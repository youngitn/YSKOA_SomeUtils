package SomeUtils;

import java.sql.SQLException;
import java.util.Vector;

import SomeUtils.Bean.UserInfoViewBean;
import jcx.db.talk;
import jcx.jform.bRule;
/**
 * �Ψ�²��ñ�ֳW�h�����O
 * @author b0050
 *
 */
public class _bRule extends bRule{
	talk t;
	@Override
	public Vector<?> getIDs(String arg0) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * �N�J�s�սs��(in ��ƪ�  HRUSER_DEPT or HRUSER_DEPT_BAS ),���o�Ӹs�դ����Ĥ@�즨��.
	 * @param DEPT_NO String
	 * @return
	 * @throws SQLException
	 * @throws Exception
	 */
	public String getSignPeopleFromHruserDeptBas(String DEPT_NO) throws SQLException, Exception {
		t =  getTalk();
		String ret[][] = t.queryFromPool("select * from HRUSER_DEPT_BAS WHERE DEP_NO = '" + DEPT_NO + "'");
		t.close();
		return ret[0][0];
		
	}
	
	/**
	 * �N�J�s�սs��(in ��ƪ�  HRUSER_DEPT or HRUSER_DEPT_BAS ),���o�Ӹs�դ����Ĥ@�즨��.
	 * @param DEPT_NO int
	 * @return
	 * @throws SQLException
	 * @throws Exception
	 */
	public String getSignPeopleFromHruserDeptBas(int DEPT_NO) throws SQLException, Exception {
		t =  getTalk();
		String ret[][] = t.queryFromPool("select ID from HRUSER_DEPT WHERE DEP_NO = '" + Integer.toString(DEPT_NO) + "'");
		t.close();
		return ret[0][0];
		
	}
	
	/**
	 * �qUserInfoView���o���u���
	 *  @deprecated �w��DAO�i��
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


}
