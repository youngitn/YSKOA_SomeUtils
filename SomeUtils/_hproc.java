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
	 * �e�ѼƥN��select�ʧ@.
	 * 
	 * @param tableName
	 *            ��ƪ�W��
	 * @param PKFieldName
	 *            PK���W��
	 * @param Key
	 *            PK����
	 * @return String[][] �^�Ǭd�ߵ��G
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
	 * �s�W��ƶi��Ʈw,�N�J��ƪ�W�ٷ|�۰ʨ��o�Ӫ��Ҧ���� PNO����,�����|�ϥ�createPNO�Ө��o. �]�p�y�{�� �Ĥ@���ЩT�w�]�p
	 * "���H�T�{".
	 * 
	 * @param tableName
	 *            ��ƪ�W��
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
				+ "VALUES ('" + PNO + "','���H�T�{','" + getUser().trim() + "','"
				+ getNow() + "','���H�T�{'" + ")";
		t.execFromPool(sql);
		// �ݭn���ɶ��B�z.�]���y�{ñ�ֶ��Ǹեήɶ��Ӱ��Ƨ�.
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
		message("��Ƥw�e�X!");
	}
	
	/**
	 * �º�s�W. �e���O�A��DB��� �MUI���W�٤@�P �BPK�W�٬�PNO.
	 * 
	 * @param tableName
	 *            ��ƪ�W��.
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
		message("��Ƥw�e�X!");
	}

	/**
	 * �Q�Φ~��� ����PK.
	 * 
	 * @param Key
	 *            PK��쪺�W��
	 * @param inToday
	 *            ����PK�����
	 * @param inTableName
	 *            ��ƪ�W��
	 * @return String �^�ǿW�@�L�G���r��s�X
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
	 * �a�J�Ѽư��d��.��where���d�ߤ~�A��
	 * 
	 * @param field
	 *            �n�d�ߪ����,���@�r�� �p�n�� A�MB��쪽����"A,B".
	 * @param table
	 *            ��ƪ�W��
	 * @param condition
	 *            where�d�߱���
	 * @return String[][] �^�Ǭd�ߵ��G
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
	 * �N�Q�n���P�_���i���Ū�����J�}�C,�p�G���� �h���_�s�W,�÷|���message:���:XXX ���i�ť�.
	 * 
	 * @param field
	 *            String[][] �G���}�C <br>
	 *            EX:<br>
	 *            String[][] field = { { "RECBOOK_NO", "����ï�s��" },<br>
	 *            { "RECBOOK_NAME", "����ï�W��" }, { "DATE", "�ӽФ��" },<br>
	 *            { "REASON", "���ʭ�]" }, { "CONTENT", "���׭q���e" } };<br>
	 * @return boolean
	 */
	public boolean checkEmpty(String[][] field) {

		for (int i = 0; i < field.length; i++) {
			if (getValue(field[i][0]).trim().equals("")) {
				message("���:" + field[i][1] + " ���i�ť�!");
				return false;
			}

		}
		return true;
	}

	/**
	 * �qUserInfoView���o���u���
	 * 
	 * @deprecated �w��DAO�i��
	 * @param EMPID
	 *            String ���u�s��
	 * @return �^��UserInfoViewBean���O
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
	 * ��ܬd�ߵ��G�b�W��"QUERY_LIST"����椤,�S��ñ�֪��A���d��.
	 * 
	 * @see DoQuery
	 * @param list
	 *            [ArrayList<QueryItem>]<br>
	 *            �n�d��������i�hArrayList.���W�٬���Ʈw���W��,���ODmaker�����D.<br>
	 *            ����R�W�Цb�������e���[�W"QUERY_",����϶�UI���R�W�榡"QUERY_"+DB���W��+"_S" or<br>
	 *            "QUERY_"+DB���W��+"_E" S��ܰ_�l��� E���������. �����d�ߵ��G�� table Header.<br>
	 * @param tableName
	 *            [String] ��ƪ�W��<br>
	 * @param signFunctionName
	 *            [String] �\��W��,�p:XXXXX�ӽг� �ΨӨ��oñ�֪��A.<br>
	 * @param empNameNo
	 *            [int] ���u�s����� �ҶǤJlist���ǽs��.(�q�s�}�l��).�ت��b��M�]�p�Ҧ����������찵���.<br>
	 * @param signStateNo
	 *            [int] ñ�֪��A��� �ҶǤJlist���ǽs��.(�q�s�}�l��).<br>
	 *            -�ت��b��M�]�p�Ҧ����������찵���.<br>
	 * @param otherCondition
	 *            [String] ��L�d�߱���,�������r��Y�i. �p�G���ѼƤ�����<br>
	 *            -�r�ꤤ�ݭn��"where"�r��b�̭�,�p�S���n�ϥθӰѼƽХN�J "".<br>
	 * @return �L�^��
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
					message("�п�J���㪺����϶��H�Ѭd��!");
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
			message("�d�L���!");

		}
		setTableData("QUERY_LIST", ret);
		setTableHeader("QUERY_LIST", HeaderArray);
		// message(sqlString);//debug
		return true;

	}
	
	/**
	 * �añ�֪��A���d��.
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
					message("�п�J���㪺����϶��H�Ѭd��!");
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
			if (state[0][0].trim().equals("�k��")
					|| state[0][0].trim().equals("����")
					|| state[0][0].trim().equals("END")) {

				ret[i][signStateNo] = state[0][0].trim().trim()
						+ "<br><font color=blue>(�w����)</font>";
			} else {
				// �p�G�٨S���� �N�ݭn���oñ�֤H������ƨ����.
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
						+ "<br><font color=red>(������)" + sb.toString()
						+ "</font>";
			}
			// set SIGN state and who will sign in table data.==<
		}

		getTalk().close();
		if (ret.length <= 0) {
			message("�d�L���!");

		}
		setTableData("QUERY_LIST", ret);
		setTableHeader("QUERY_LIST", HeaderArray);
		//message(sqlString);//debug
		return true;

	}

	/**
	 * 
	 * @param FieldName
	 *            ���ݭn�[�J"QUERY_" & "_S",�����ϥ�DB���W��.
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
	 * ²�ƪ���g�������H�H�\��.
	 * 
	 * @param EMPID
	 *            �ӽЪ�ID
	 * @param title
	 *            �H��D��
	 * @param content
	 *            �H�󤺮e
	 * @param fileName
	 *            ���ɦW�� �p�L�ݨD��:null
	 * @param filePath
	 *            ���ɸ��| �p�L�ݨD��:''
	 * @param FLOW_SING_LEVEL
	 *            ���H�D�޼h�� �ϥ� Flow.FLOW_SING_LEVEL_10~1X ��:11 �̦�����.
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
			addScript("alert('EMAIL�w�H�X�q��');history.go(0)");
		} else {
			message("EMAIL�H�X����");
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
			addScript("alert('EMAIL�w�H�X�q��');history.go(0)");
			// message("EMAIL�w�H�X�q��");
		} else {
			message("EMAIL�H�X����");
		}

	}
	/**
	 * �añ�֪��A���d�� FOR UUID.
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
					message("�п�J���㪺����϶��H�Ѭd��!");
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
			if (state[0][0].trim().equals("�k��")
					|| state[0][0].trim().equals("����")
					|| state[0][0].trim().equals("END")) {

				ret[i][signStateNo] = state[0][0].trim().trim()
						+ "<br><font color=blue>(�w����)</font>";
			} else {
				// �p�G�٨S���� �N�ݭn���oñ�֤H������ƨ����.
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
						+ "<br><font color=red>(������)" + sb.toString()
						+ "</font>";
			}
			// set SIGN state and who will sign in table data.==<
		}

		getTalk().close();
		if (ret.length <= 0) {
			message("�d�L���!");

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
