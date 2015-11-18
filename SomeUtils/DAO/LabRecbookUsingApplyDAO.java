package SomeUtils.DAO;

import java.sql.SQLException;

import jcx.db.talk;
import jcx.jform.hproc;
import SomeUtils.Bean.LabRecbookUsingApplyBean;

/**
 * 用來做DB動作 for table LabRecbookUsingApply.
 * 
 * @author b0050
 *
 */
public class LabRecbookUsingApplyDAO extends hproc {
	private talk t;

	/**
	 * 傳 talk 做為參數.
	 * @param t = getTalk()
	 */
	public LabRecbookUsingApplyDAO(talk t) {
		this.t = t;
	}

	/**無參數建構元
	 * @deprecated 搭配 getLabRecbookUsingApplyBean(talk t,String RECBOOK_NO)
	 */
	public LabRecbookUsingApplyDAO() {
	}

	/**
	 * 
	 * @param t
	 *            talk.
	 * @param RECBOOK_NO
	 *            紀錄簿編號
	 * @return
	 * @throws SQLException
	 * @throws Exception
	 */
	public LabRecbookUsingApplyBean getLabRecbookUsingApplyBean(talk t,
			String RECBOOK_NO) throws SQLException, Exception {

		String[][] ret = t
				.queryFromPool("SELECT * from LAB_RECBOOK_USING_APPLY where RECBOOK_NO ='"
						+ RECBOOK_NO + "'");
		t.close();
		if (ret.length != 0) {

			LabRecbookUsingApplyBean lab = new LabRecbookUsingApplyBean(
					ret[0][0], ret[0][1], ret[0][2], ret[0][3], ret[0][4],
					ret[0][5]);
			return lab;

		} else {
			return null;

		}

	}

	public LabRecbookUsingApplyBean getLabRecbookUsingApplyBean(
			String RECBOOK_NO) throws SQLException, Exception {

		String[][] ret = t
				.queryFromPool("SELECT * from LAB_RECBOOK_USING_APPLY where RECBOOK_NO ='"
						+ RECBOOK_NO + "'");
		t.close();
		if (ret.length != 0) {

			LabRecbookUsingApplyBean lab = new LabRecbookUsingApplyBean(
					ret[0][0], ret[0][1], ret[0][2], ret[0][3], ret[0][4],
					ret[0][5]);
			return lab;

		} else {
			return null;

		}

	}

	/**
	 * 已PNO做為KEY 查詢 RecbookUsingApply
	 * @param PNO
	 * @return LabRecbookUsingApplyBean
	 * @throws SQLException
	 * @throws Exception
	 */
	public LabRecbookUsingApplyBean getLabRecbookUsingApplyBeanByPno(String PNO)
			throws SQLException, Exception {

		String[][] ret = t
				.queryFromPool("SELECT * from LAB_RECBOOK_USING_APPLY where PNO ='"
						+ PNO + "'");
		t.close();
		if (ret.length != 0) {

			LabRecbookUsingApplyBean lab = new LabRecbookUsingApplyBean(
					ret[0][0], ret[0][1], ret[0][2], ret[0][3], ret[0][4],
					ret[0][5]);
			return lab;

		} else {
			return null;

		}

	}

	/**
	 * update LabRecbookUsingApply
	 * @param bean LabRecbookUsingApplyBean
	 * @throws SQLException
	 * @throws Exception
	 */
	public void update(LabRecbookUsingApplyBean bean) throws SQLException,
			Exception {
		t.execFromPool("update LAB_RECBOOK_USING_APPLY set "
				+ " RECBOOK_NO = '"+ bean.getRECBOOK_NO() + "'" 
				+ ", REC_END_DATE = '"+ bean.getREC_END_DATE() + "'" 
				+ ", REC_START_DATE = '"+ bean.getREC_START_DATE() + "'"
				+ ", RECBOOK_NAME = '"+ bean.getRECBOOK_NAME()	+ "'"											
				+ " where PNO = '" + bean.getPNO() + "'"
				);
		t.close();
	}

	@Override
	public String action(String arg0) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}
}
