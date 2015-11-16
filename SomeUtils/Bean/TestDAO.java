package SomeUtils.Bean;

import java.sql.SQLException;

import jcx.db.talk;

import jcx.jform.hproc;

public class TestDAO extends hproc {

	public LabRecbookUsingApplyBean getLabBean(talk t,String RECBOOK_NO)
			throws SQLException, Exception {

//		String ret[][]=talk.sendmsgx("select","SELECT * from LAB_RECBOOK_USING_APPLY where RECBOOK_NO ='"
//				+ RECBOOK_NO + "'","ysk");

		String[][] ret = t
				.queryFromPool("SELECT * from LAB_RECBOOK_USING_APPLY where RECBOOK_NO ='"
						+ RECBOOK_NO + "'");

		if (ret.length != 0) {
			
			LabRecbookUsingApplyBean lab = new LabRecbookUsingApplyBean(
					ret[0][0], ret[0][1], ret[0][2], ret[0][3], ret[0][4],
					ret[0][5]);
			return lab;

		}else {
			return null;

		}
		
	}

	@Override
	public String action(String arg0) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}
}
