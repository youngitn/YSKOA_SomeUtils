package SomeUtils.DAO;

import java.sql.SQLException;

import jcx.db.talk;
import jcx.jform.hproc;
import SomeUtils.Bean.LabRecbookUsingApplyBean;
/**
 * 用來做DB動作 for table LabRecbookUsingApply.
 * @author b0050
 *
 */
public class LabRecbookUsingApplyDAO extends hproc {

	/**
	 * 
	 * @param t talk.
	 * @param RECBOOK_NO 紀錄簿編號
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

	@Override
	public String action(String arg0) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}
}
