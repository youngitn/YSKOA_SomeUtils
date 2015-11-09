package SomeUtils;

import java.sql.SQLException;
import java.util.Enumeration;
import java.util.HashMap;

import jcx.db.talk;
import jcx.jform.hproc;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;

import SomeUtils.Bean.UserInfoViewBean;

public class _hproc extends hproc {

	public String[][] getInfoTheKeyIs(String tableName, String PKFieldName,
			String Key) throws SQLException, Exception {

		String sql = "select * from " + tableName + " where " + PKFieldName
				+ "='" + Key + "'";
		talk t = getTalk();

		String[][] ret = t.queryFromPool(sql);
		t.close();
		return ret;

	}

	public void DoInster(String tableName) throws Exception {
		talk t = getTalk();
		String sql = "select * from " + tableName;
		String[][] allFieldName = t.getColumnsFromPool(sql);
		String Fields = "";
		String values = "";
		t.close();
		String c = ",";
		for (int i = 0; i < allFieldName.length; i++) {
			if (i == allFieldName.length - 1) {
				c = "";
			}
			Fields += allFieldName[i][0] + c;

			if (allFieldName[i][0].equals("PNO")) {
				values += "'"
						+ createPNO("PNO", getToday("YYYYmmdd"), tableName)
						+ "'" + c;
			} else {
				values += "'" + getValue(allFieldName[i][0]) + "'" + c;
			}
		}
		sql = "INSERT INTO " + tableName + " (" + Fields + ")" + "VALUES ("
				+ values + ")";
		t.execFromPool(sql);
		message("資料已送出!");
	}

	public String createPNO(String Key, String inToday, String inTableName)
			throws SQLException, Exception {
		int idx = 1;
		talk t = getTalk();
		String pno = inToday;
		String sql = "select max(" + Key + ") from " + inTableName + " where "
				+ Key + " like '" + inToday + "%'";

		String theMaxPNO[][];
		theMaxPNO = t.queryFromPool(sql);
		if (theMaxPNO[0][0] != null && !theMaxPNO[0][0].trim().equals("")) {
			pno = inToday
					+ StringUtils.leftPad(
							NumberUtils.toInt(theMaxPNO[0][0].substring(inToday
									.length())) + idx + "", 3, "0");
		} else {
			pno = inToday + StringUtils.leftPad(idx + "", 3, "0");
		}
		t.close();
		System.gc();
		return pno;
	}

	public String[][] selectFromWhere(String field, String table,
			String condition) throws SQLException, Exception {
		talk t = getTalk();
		String sql = "select " + field + " from " + table + " where "
				+ condition + ";";

		String[][] ret = t.queryFromPool(sql);
		t.close();
		return ret;

	}

	public boolean checkEmpty(String[][] field) {

		for (int i = 0; i < field.length; i++) {
			if (getValue(field[i][0]).trim().equals("")) {
				message("欄位:" + field[i][1] + " 不可空白!");
				return false;
			}

		}
		return true;
	}

	public UserInfoViewBean getUserInfo(String EMPID) throws SQLException, Exception {
		
		talk t = getTalk();
		String sql = "SELECT * FROM YSKHR.dbo.USER_INFO_VIEW WHERE EMPID = '"+EMPID+"'";

		String[][] ret = t.queryFromPool(sql);
		UserInfoViewBean UIV = new UserInfoViewBean();
		UIV.setCpnyid(ret[0][0]);
		UIV.setEmpid(ret[0][1]);
		UIV.setDeptNo(ret[0][2]);
		UIV.setHecname(ret[0][3]);
		UIV.setExt(ret[0][4]);
		UIV.setEmail(ret[0][5]);
		UIV.setDepNo(Integer.parseInt(ret[0][6]));
		UIV.setDepName(ret[0][7]);
		UIV.setDepChief(ret[0][8]);
		UIV.setParentNo(Integer.parseInt(ret[0][9]));
		UIV.setDepType(ret[0][10]);
		UIV.setPossie(ret[0][11]);
		UIV.setPosName(ret[0][12]);
		UIV.setBossName(ret[0][13]);
		UIV.setAgent(ret[0][14]);
		UIV.setAgentName(ret[0][15]);
		UIV.setInadate(ret[0][16]);
		UIV.setState(ret[0][17]);
		UIV.setQuitdate(ret[0][18]);
		UIV.setEmpidName(ret[0][19]);		
		return UIV;

	}
	
	
//	public HashMap<String,String> getQueryTable() {
//		
//		String aString = "";
//		HashMap<String,String> map = new HashMap<String,String>();
//		Enumeration<String> iterator = getAllcLabels().keys();
//		
//		while (iterator.hasMoreElements()) {
//			map.put(iterator.nextElement(), getValue(iterator.nextElement()));
//			aString  += iterator.nextElement()+"-";
//			
//		}
//		return map;
//		
//	}
	

	@Override
	public String action(String paramString) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

}
