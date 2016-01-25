package SomeUtils.DAO;

import java.sql.SQLException;

import jcx.db.talk;
import jcx.jform.hproc;
import SomeUtils.Bean.OA201Bean;
import SomeUtils.Bean.OA201ViewBean;

/**
 * 用來做DB動作 for table OA201.
 * 
 * @author b0050
 *
 */
public class OA201DAO extends hproc {
	private talk t;

	/**
	 * 傳 talk 做為參數.
	 * 
	 * @param t
	 *            = getTalk()
	 */
	public OA201DAO(talk t) {
		this.t = t;
	}

	public OA201ViewBean getOA201BeanByUuid(String UUID) throws SQLException, Exception {

		String[][] ret = t
				.queryFromPool("SELECT * from OA201_VIEW where UUID ='" + UUID
						+ "'");
		t.close();
		if (ret.length != 0) {
			OA201ViewBean o = new OA201ViewBean(ret[0][0], ret[0][1],
					ret[0][2], ret[0][3], ret[0][4], ret[0][5], ret[0][6],
					ret[0][7], ret[0][8], ret[0][9], ret[0][10], ret[0][11],
					ret[0][12], ret[0][13], ret[0][14], ret[0][15], ret[0][16],
					ret[0][17], ret[0][18], ret[0][19], ret[0][20], ret[0][21],
					ret[0][22], ret[0][23], ret[0][24], ret[0][25], ret[0][26],
					ret[0][27], ret[0][28], ret[0][29], ret[0][30], ret[0][31],
					ret[0][32], ret[0][33], ret[0][34], ret[0][35], ret[0][36],
					ret[0][37], ret[0][38], ret[0][39], ret[0][40], ret[0][41],
					ret[0][42], ret[0][43], ret[0][44], ret[0][45], ret[0][46],
					ret[0][47], ret[0][48], ret[0][49], ret[0][50], ret[0][51],
					ret[0][52], ret[0][53], ret[0][54], ret[0][55], ret[0][56],
					ret[0][57], ret[0][58], ret[0][59]);
			return o;

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
