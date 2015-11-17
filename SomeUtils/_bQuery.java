package SomeUtils;

import java.sql.SQLException;

import SomeUtils.Bean.UserInfoViewBean;
import jcx.db.talk;
import jcx.jform.bQuery;

/**
 * 簡化自訂查詢(寫在輔助輸入等emaker提供的功能)
 * @author YangTing
 *
 */
public class _bQuery extends bQuery{

	@Override
	public String getFilter() throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 查詢UserInfoView的資料 並塞回此類別.
	 * @param EMPID 員工編號
	 * @return 回傳一個UserInfoViewBean類別,或者null
	 * @throws SQLException
	 * @throws Exception
	 */
	public UserInfoViewBean getUserInfo(String EMPID) throws SQLException,
			Exception {

		talk t = getTalk();
		String sql = "SELECT * FROM YSKHR.dbo.USER_INFO_VIEW WHERE EMPID = '"
				+ EMPID + "'";

		String[][] ret = t.queryFromPool(sql);
		// message(EMPID + "-" + ret[0][0]);
		if (ret.length > 0) {
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

		return null;
	}

}
