package SomeUtils;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;

import jcx.db.talk;
import jcx.jform.hproc;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;

import com.ysk.service.BaseService;

import SomeUtils.Bean.QueryItem;
import SomeUtils.Bean.UserInfoViewBean;

/**
 * 
 * @author b0050
 *
 */
/**
 * @author YangTing
 *
 */
public class _hproc extends hproc {

	/**
	 * 送參數代替select動作.
	 * 
	 * @param tableName
	 *            資料表名稱
	 * @param PKFieldName
	 *            PK欄位名稱
	 * @param Key
	 *            PK的值
	 * @return String[][] 回傳查詢結果
	 * @throws SQLException
	 * @throws Exception
	 */
	public String[][] getInfoTheKeyIs(String tableName, String PKFieldName,
			String Key) throws SQLException, Exception {

		String sql = "select * from " + tableName + " where " + PKFieldName
				+ "='" + Key + "'";
		talk t = getTalk();

		String[][] ret = t.queryFromPool(sql);
		t.close();
		return ret;

	}

	/**
	 * 新增資料進資料庫,代入資料表名稱會自動取得該表的所有欄位 PNO部分,內部會使用createPNO來取得. 設計流程時 第一關請固定設計
	 * "填單人確認".
	 * 
	 * @param tableName
	 *            資料表名稱
	 * @throws Exception
	 */
	public void DoInster(String tableName, String firstSIGN) throws Exception {
		talk t = getTalk();
		String sql = "select * from " + tableName + " where 1 = 0";
		String[][] allFieldName = t.getColumnsFromPool(sql);
		String Fields = "";
		String values = "";
		String PNO = createPNO("PNO", getToday("YYYYmmdd"), tableName);
		t.close();
		String c = ",";
		for (int i = 0; i < allFieldName.length; i++) {
			if (i == allFieldName.length - 1) {
				c = "";
			}
			Fields += allFieldName[i][0] + c;

			if (allFieldName[i][0].equals("PNO")) {
				values += "'" + PNO + "'" + c;
			} else {
				values += "'" + getValue(allFieldName[i][0]).trim() + "'" + c;
			}
		}
		sql = "INSERT INTO " + tableName + " (" + Fields + ")" + "VALUES ("
				+ values + ")";
		t.execFromPool(sql);
		sql = "INSERT INTO " + tableName + "_FLOWC"
				+ " (PNO ,F_INP_STAT , F_INP_ID , F_INP_TIME , F_INP_INFO)"
				+ "VALUES ('" + PNO + "','" + firstSIGN + "','"
				+ getUser().trim() + "','" + getNow() + "','" + firstSIGN + "'"
				+ ")";
		t.execFromPool(sql);

		sql = "INSERT INTO " + tableName + "_FLOWC_HIS"
				+ " (PNO ,F_INP_STAT , F_INP_ID , F_INP_TIME , F_INP_INFO)"
				+ "VALUES ('" + PNO + "','填單人確認','" + getUser().trim() + "','"
				+ getNow() + "','填單人確認'" + ")";
		t.execFromPool(sql);
		// 需要做時間處理.因為流程簽核順序試用時間來做排序.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Calendar calendar = Calendar.getInstance();
		Date newDate = calendar.getTime();
		calendar.setTime(newDate);
		calendar.add(Calendar.SECOND, 5);
		// calendar.getTime();
		sql = "INSERT INTO " + tableName + "_FLOWC_HIS"
				+ " (PNO ,F_INP_STAT , F_INP_ID , F_INP_TIME , F_INP_INFO)"
				+ "VALUES ('" + PNO + "','" + firstSIGN + "','"
				+ getUser().trim() + "','" + sdf.format(calendar.getTime())
				+ "','" + firstSIGN + "'" + ")";
		t.execFromPool(sql);

		t.close();
		message("資料已送出!");
	}
	
	/**
	 * 純粹新增. 前提是你的DB欄位 和UI欄位名稱一致 且PK名稱為PNO.
	 * 
	 * @param tableName
	 *            資料表名稱.
	 * @throws Exception
	 */
	public void DoInster(String tableName) throws Exception {
		talk t = getTalk();
		String sql = "select * from " + tableName + " where 1 = 0";
		String[][] allFieldName = t.getColumnsFromPool(sql);
		String Fields = "";
		String values = "";
		String PNO = createPNO("PNO", getToday("YYYYmmdd"), tableName);
		t.close();
		String c = ",";
		for (int i = 0; i < allFieldName.length; i++) {
			if (i == allFieldName.length - 1) {
				c = "";
			}
			Fields += allFieldName[i][0] + c;

			if (allFieldName[i][0].equals("PNO")) {
				values += "'" + PNO + "'" + c;
			} else {
				values += "'" + getValue(allFieldName[i][0]).trim() + "'" + c;
			}
		}
		sql = "INSERT INTO " + tableName + " (" + Fields + ")" + "VALUES ("
				+ values + ")";
		t.execFromPool(sql);
		t.close();
		message("資料已送出!");
	}

	/**
	 * 利用年月日 產生PK.
	 * 
	 * @param Key
	 *            PK欄位的名稱
	 * @param inToday
	 *            產生PK的日期
	 * @param inTableName
	 *            資料表名稱
	 * @return String 回傳獨一無二的字串編碼
	 * @throws SQLException
	 * @throws Exception
	 */
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

		return pno;
	}

	/**
	 * 帶入參數做查詢.有where的查詢才適用
	 * 
	 * @param field
	 *            要查詢的欄位,為一字串 如要找 A和B欄位直接給"A,B".
	 * @param table
	 *            資料表名稱
	 * @param condition
	 *            where查詢條件
	 * @return String[][] 回傳查詢結果
	 * @throws SQLException
	 * @throws Exception
	 */
	public String[][] selectFromWhere(String field, String table,
			String condition) throws SQLException, Exception {
		talk t = getTalk();
		String sql = "select " + field + " from " + table + " where "
				+ condition + ";";

		String[][] ret = t.queryFromPool(sql);
		t.close();
		return ret;

	}

	/**
	 * 將想要做判斷不可為空的欄位塞入陣列,如果為空 則中斷新增,並會顯示message:欄位:XXX 不可空白.
	 * 
	 * @param field
	 *            String[][] 二維陣列 <br>
	 *            EX:<br>
	 *            String[][] field = { { "RECBOOK_NO", "紀錄簿編號" },<br>
	 *            { "RECBOOK_NAME", "紀錄簿名稱" }, { "DATE", "申請日期" },<br>
	 *            { "REASON", "異動原因" }, { "CONTENT", "欲修訂內容" } };<br>
	 * @return boolean
	 */
	public boolean checkEmpty(String[][] field) {

		for (int i = 0; i < field.length; i++) {
			if (getValue(field[i][0]).trim().equals("")) {
				message("欄位:" + field[i][1] + " 不可空白!");
				return false;
			}

		}
		return true;
	}

	/**
	 * 從UserInfoView取得員工資料
	 * 
	 * @deprecated 已有DAO可用
	 * @param EMPID
	 *            String 員工編號
	 * @return 回傳UserInfoViewBean類別
	 * @throws SQLException
	 * @throws Exception
	 */
	public UserInfoViewBean getUserInfo(String EMPID) throws SQLException,
			Exception {

		talk t = getTalk();
		String sql = "SELECT * FROM YSKHR.dbo.USER_INFO_VIEW WHERE EMPID = '"
				+ EMPID + "'";

		String[][] ret = t.queryFromPool(sql);
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

	/**
	 * 顯示查詢結果在名為"QUERY_LIST"的表格中,沒有簽核狀態的查詢.
	 * 
	 * @see DoQuery
	 * @param list
	 *            [ArrayList<QueryItem>]<br>
	 *            要查詢欄位先丟進去ArrayList.欄位名稱為資料庫欄位名稱,不是Dmaker欄位標題.<br>
	 *            標體命名請在相關欄位前面加上"QUERY_",日期區間UI欄位命名格式"QUERY_"+DB欄位名稱+"_S" or<br>
	 *            "QUERY_"+DB欄位名稱+"_E" S表示起始欄位 E表式結束欄位. 此為查詢結果的 table Header.<br>
	 * @param tableName
	 *            [String] 資料表名稱<br>
	 * @param signFunctionName
	 *            [String] 功能名稱,如:XXXXX申請單 用來取得簽核狀態.<br>
	 * @param empNameNo
	 *            [int] 員工編號位於 所傳入list順序編號.(從零開始算).目的在於和設計模式中的表格欄位做對照.<br>
	 * @param signStateNo
	 *            [int] 簽核狀態位於 所傳入list順序編號.(從零開始算).<br>
	 *            -目的在於和設計模式中的表格欄位做對照.<br>
	 * @param otherCondition
	 *            [String] 其他查詢條件,直接給字串即可. 如果此參數不為空<br>
	 *            -字串中需要有"where"字串在裡面,如沒有要使用該參數請代入 "".<br>
	 * @return 無回傳
	 * @throws SQLException
	 * @throws Exception
	 */
	public boolean setQueryTable(ArrayList<QueryItem> list, String tableName,
			String otherCondition) throws SQLException, Exception {

		String selectField = "";
		String tableHeaders = "";
		String c = ",";
		String conditionSqlString = "";
		String AND = " and ";
		ArrayList<String> condition = new ArrayList<String>();
		for (QueryItem q : list) {
			if (list.indexOf(q) == list.size() - 1) {
				c = "";
			}
			selectField += q.getFieldName() + c;
			tableHeaders += q.getChineseName() + c;
			// process search type

			switch (q.getSearchType()) {
			case 1:
				if (!StringUtils.isEmpty(getValue("QUERY_" + q.getFieldName()))) {
					condition.add(q.getFieldName() + "= '"
							+ getValue("QUERY_" + q.getFieldName()) + "'");
				}

				break;
			case 2:

				if (!checkQueryForDateFieldStartAndEnd(q.getFieldName())) {
					message("請輸入完整的日期區間以供查詢!");
					return true;
				}
				if (!StringUtils.isEmpty(getValue("QUERY_" + q.getFieldName()
						+ "_S"))) {
					condition.add(q.getFieldName() + " between '"
							+ getValue("QUERY_" + q.getFieldName() + "_S")
							+ "' and '"
							+ getValue("QUERY_" + q.getFieldName() + "_E")
							+ "'");
				}

				break;
			case 0:

				break;

			default:
				break;
			}

		}

		if (condition.size() > 0) {
			conditionSqlString = AND;
			for (String s : condition) {
				if (condition.indexOf(s) == condition.size() - 1) {
					AND = "";
				}
				conditionSqlString += s + AND;
			}
		}
		String[] HeaderArray = tableHeaders.split(",");

		if (otherCondition.equals("") && !conditionSqlString.equals("")) {
			otherCondition = "where 1 = 1";
		}

		String sqlString = "SELECT " + selectField + " FROM " + tableName + " "
				+ otherCondition + " " + conditionSqlString;

		String[][] ret = getTalk().queryFromPool(sqlString);

		getTalk().close();
		if (ret.length <= 0) {
			message("查無資料!");

		}
		setTableData("QUERY_LIST", ret);
		setTableHeader("QUERY_LIST", HeaderArray);
		// message(sqlString);//debug
		return true;

	}
	
	/**
	 * 帶簽核狀態的查詢.
	 * @param list
	 * @param tableName
	 * @param signFunctionName
	 * @param empNameNo
	 * @param signStateNo
	 * @param otherCondition
	 * @return
	 * @throws SQLException
	 * @throws Exception
	 */
	public boolean setQueryTable(ArrayList<QueryItem> list, String tableName,
			String signFunctionName, int empNameNo, int signStateNo,
			String otherCondition) throws SQLException, Exception {

		String selectField = "";
		String tableHeaders = "";
		String c = ",";
		String conditionSqlString = "";
		String AND = " and ";
		ArrayList<String> condition = new ArrayList<String>();
		for (QueryItem q : list) {
			if (list.indexOf(q) == list.size() - 1) {
				c = "";
			}
			selectField += q.getFieldName() + c;
			tableHeaders += q.getChineseName() + c;
			// process search type

			switch (q.getSearchType()) {
			case 1:
				if (!StringUtils.isEmpty(getValue("QUERY_" + q.getFieldName()))) {
					condition.add(q.getFieldName() + "= '"
							+ getValue("QUERY_" + q.getFieldName()) + "'");
				}

				break;
			case 2:

				if (!checkQueryForDateFieldStartAndEnd(q.getFieldName())) {
					message("請輸入完整的日期區間以供查詢!");
					return true;
				}
				if (!StringUtils.isEmpty(getValue("QUERY_" + q.getFieldName()
						+ "_S"))) {
					condition.add(q.getFieldName() + " between '"
							+ getValue("QUERY_" + q.getFieldName() + "_S")
							+ "' and '"
							+ getValue("QUERY_" + q.getFieldName() + "_E")
							+ "'");
				}

				break;
			case 0:

				break;

			default:
				break;
			}

		}

		if (condition.size() > 0) {
			conditionSqlString = AND;
			for (String s : condition) {
				if (condition.indexOf(s) == condition.size() - 1) {
					AND = "";
				}
				conditionSqlString += s + AND;
			}
		}
		String[] HeaderArray = tableHeaders.split(",");

		if (otherCondition.equals("") && !conditionSqlString.equals("")) {
			otherCondition = "where 1 = 1 ";
		}

		String sqlString = "SELECT " + selectField + " FROM " + tableName
				+ " a " + otherCondition + conditionSqlString;

		String[][] ret = getTalk().queryFromPool(sqlString);

		for (int i = 0; i < ret.length; i++) {
			// set EMP name in table data.
			UserInfoViewBean user = getUserInfo(ret[i][empNameNo]);
			ret[i][empNameNo] = ret[i][empNameNo] + "-" + user.getHecname();

			// set SIGN state and who will sign in table data.==>
			// the if-statement like below...may be more.
			String state[][] =  getTalk().queryFromPool("select F_INP_STAT from "+tableName+"_FLOWC where PNO = '"+ret[i][0]+"'");
			if (state[0][0].trim().equals("歸檔")
					|| state[0][0].trim().equals("結案")
					|| state[0][0].trim().equals("END")) {

				ret[i][signStateNo] = state[0][0].trim().trim()
						+ "<br><font color=blue>(已結案)</font>";
			} else {
				// 如果還沒結案 就需要取得簽核人員的資料並顯示.
				Vector<?> people = getApprovablePeople(signFunctionName,
						"a.PNO='" + ret[i][0] + "'");

				StringBuffer sb = new StringBuffer();
				if (people != null) {
					if (people.size() != 0) {
						sb.append("(");
						for (int j = 0; j < people.size(); j++) {
							if (j != 0)
								sb.append(",");
							String id1 = (String) people.elementAt(j);
							String name1 = getName(id1);
							sb.append(name1 + ":" + id1);
						}
						sb.append(")");
					}
				}
				
				
				ret[i][signStateNo] = state[0][0].trim()
						+ "<br><font color=red>(未結案)" + sb.toString()
						+ "</font>";
			}
			// set SIGN state and who will sign in table data.==<
		}

		getTalk().close();
		if (ret.length <= 0) {
			message("查無資料!");

		}
		setTableData("QUERY_LIST", ret);
		setTableHeader("QUERY_LIST", HeaderArray);
		//message(sqlString);//debug
		return true;

	}

	/**
	 * 
	 * @param FieldName
	 *            不需要加入"QUERY_" & "_S",直接使用DB欄位名稱.
	 * @return
	 */
	public boolean checkQueryForDateFieldStartAndEnd(String FieldName) {
		if (getValue("QUERY_" + FieldName + "_S").trim().length() != 0
				&& getValue("QUERY_" + FieldName + "_E").trim().length() == 0) {
			return false;
		}
		if (getValue("QUERY_" + FieldName + "_S").trim().length() == 0
				&& getValue("QUERY_" + FieldName + "_E").trim().length() != 0) {
			return false;
		}

		return true;
	}

	/**
	 * 簡化表單填寫頁面的寄信功能.
	 * 
	 * @param EMPID
	 *            申請者ID
	 * @param title
	 *            信件主旨
	 * @param content
	 *            信件內容
	 * @param fileName
	 *            附檔名稱 如無需求給:null
	 * @param filePath
	 *            附檔路徑 如無需求給:''
	 * @param FLOW_SING_LEVEL
	 *            收信主管層級 使用 Flow.FLOW_SING_LEVEL_10~1X 課:11 依此類推.
	 * @throws Throwable
	 */
	public void sendEmailAfterAdd(String EMPID, String title, String content,
			String[] fileName, String filePath, int FLOW_SING_LEVEL)
			throws Throwable {
		// TODO Auto-generated method stub
		BaseService service = new BaseService();
		// get sign people

		String approver = service.getBossBySignLevel(EMPID, FLOW_SING_LEVEL);
		Vector<String> idVector = new Vector<String>();
		if (StringUtils.isNotEmpty(approver)) {
			idVector.add(getEmail(approver));
		}
		idVector.add("admin");

		String usr[] = ((String[]) idVector.toArray(new String[0]));

		String sendRS = service.sendMailbccUTF8(usr, title, content, fileName,
				filePath, "text/html");
		if (sendRS.trim().equals("")) {
			addScript("alert('EMAIL已寄出通知');history.go(0)");
		} else {
			message("EMAIL寄出失敗");
		}

	}

	public void sendEmailAfterAdd(String EMPID, String title, String content,
			String[] fileName, String filePath, String toSendEMPID)
			throws Throwable {
		// TODO Auto-generated method stub
		BaseService service = new BaseService();
		// get sign people

		Vector<String> idVector = new Vector<String>();
		if (StringUtils.isNotEmpty(toSendEMPID)) {
			idVector.add(getEmail(toSendEMPID));
		}
		idVector.add("admin");

		String usr[] = ((String[]) idVector.toArray(new String[0]));

		String sendRS = service.sendMailbccUTF8(usr, title, content, fileName,
				filePath, "text/html");
		if (sendRS.trim().equals("")) {
			addScript("alert('EMAIL已寄出通知');history.go(0)");
			// message("EMAIL已寄出通知");
		} else {
			message("EMAIL寄出失敗");
		}

	}
	/**
	 * 帶簽核狀態的查詢 FOR UUID.
	 * @param list
	 * @param tableName
	 * @param signFunctionName
	 * @param empNameNo
	 * @param signStateNo
	 * @param otherCondition
	 * @return
	 * @throws SQLException
	 * @throws Exception
	 */
	public boolean setQueryTableForUUID(ArrayList<QueryItem> list, String tableName,
			String signFunctionName, int empNameNo, int signStateNo,
			String otherCondition) throws SQLException, Exception {

		String selectField = "";
		String tableHeaders = "";
		String c = ",";
		String conditionSqlString = "";
		String AND = " and ";
		ArrayList<String> condition = new ArrayList<String>();
		for (QueryItem q : list) {
			if (list.indexOf(q) == list.size() - 1) {
				c = "";
			}
			selectField += q.getFieldName() + c;
			tableHeaders += q.getChineseName() + c;
			// process search type

			switch (q.getSearchType()) {
			case 1:
				if (!StringUtils.isEmpty(getValue("QUERY_" + q.getFieldName()))) {
					condition.add(q.getFieldName() + "= '"
							+ getValue("QUERY_" + q.getFieldName()) + "'");
				}

				break;
			case 2:

				if (!checkQueryForDateFieldStartAndEnd(q.getFieldName())) {
					message("請輸入完整的日期區間以供查詢!");
					return true;
				}
				if (!StringUtils.isEmpty(getValue("QUERY_" + q.getFieldName()
						+ "_S"))) {
					condition.add(q.getFieldName() + " between '"
							+ getValue("QUERY_" + q.getFieldName() + "_S")
							+ "' and '"
							+ getValue("QUERY_" + q.getFieldName() + "_E")
							+ "'");
				}

				break;
			case 0:

				break;

			default:
				break;
			}

		}

		if (condition.size() > 0) {
			conditionSqlString = AND;
			for (String s : condition) {
				if (condition.indexOf(s) == condition.size() - 1) {
					AND = "";
				}
				conditionSqlString += s + AND;
			}
		}
		String[] HeaderArray = tableHeaders.split(",");

		if (otherCondition.equals("") && !conditionSqlString.equals("")) {
			otherCondition = "where 1 = 1 ";
		}

		String sqlString = "SELECT " + selectField + " FROM " + tableName
				+ " a " + otherCondition + conditionSqlString;

		String[][] ret = getTalk().queryFromPool(sqlString);

		for (int i = 0; i < ret.length; i++) {
			// set EMP name in table data.
			UserInfoViewBean user = getUserInfo(ret[i][empNameNo]);
			ret[i][empNameNo] = ret[i][empNameNo] + "-" + user.getHecname();

			// set SIGN state and who will sign in table data.==>
			// the if-statement like below...may be more.
			String state[][] =  getTalk().queryFromPool("select F_INP_STAT from "+tableName+"_FLOWC where UUID = '"+ret[i][0]+"'");
			if (state[0][0].trim().equals("歸檔")
					|| state[0][0].trim().equals("結案")
					|| state[0][0].trim().equals("END")) {

				ret[i][signStateNo] = state[0][0].trim().trim()
						+ "<br><font color=blue>(已結案)</font>";
			} else {
				// 如果還沒結案 就需要取得簽核人員的資料並顯示.
				Vector<?> people = getApprovablePeople(signFunctionName,
						"a.PNO='" + ret[i][0] + "'");

				StringBuffer sb = new StringBuffer();
				if (people != null) {
					if (people.size() != 0) {
						sb.append("(");
						for (int j = 0; j < people.size(); j++) {
							if (j != 0)
								sb.append(",");
							String id1 = (String) people.elementAt(j);
							String name1 = getName(id1);
							sb.append(name1 + ":" + id1);
						}
						sb.append(")");
					}
				}
				
				
				ret[i][signStateNo] = state[0][0].trim()
						+ "<br><font color=red>(未結案)" + sb.toString()
						+ "</font>";
			}
			// set SIGN state and who will sign in table data.==<
		}

		getTalk().close();
		if (ret.length <= 0) {
			message("查無資料!");

		}
		setTableData("QUERY_LIST", ret);
		setTableHeader("QUERY_LIST", HeaderArray);
		//message(sqlString);//debug
		return true;

	}
	@Override
	public String action(String paramString) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

}
