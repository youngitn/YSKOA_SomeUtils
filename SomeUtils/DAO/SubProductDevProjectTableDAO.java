package SomeUtils.DAO;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import jcx.db.talk;
import SomeUtils._hproc;
import SomeUtils.Bean.ProductDevProjectTableBean;
import SomeUtils.Bean.SubProductDevProjectTableBean;
import SomeUtils.DAO.Interface.SubProductDevProjectTableDAOInterface;

public class SubProductDevProjectTableDAO extends _hproc implements
		SubProductDevProjectTableDAOInterface {
	talk t;

	public SubProductDevProjectTableDAO(talk t) {
		this.t = t;
	}

	public void add(ArrayList<SubProductDevProjectTableBean> beanList)
			throws SQLException, Exception {
		// TODO Auto-generated method stub
		ProductDevProjectTableDAO dao = new ProductDevProjectTableDAO(t);
		ProductDevProjectTableBean bean = null;
		for (SubProductDevProjectTableBean b : beanList) {
			t.execFromPool("INSERT INTO SUB_PRODUCT_DEV_PROJECT_TABLE (DEPT_FLAG,MSATER_PNO,SUB_PNO)"
					+ " VALUES ('"
					+ b.getDEPT_FLAG().trim()
					+ "', '"
					+ b.getMSATER_PNO()
					+ "','"
					+ b.getMSATER_PNO()
					+ "_"
					+ (beanList.indexOf(b) + 1) + "');");
			bean = dao.getProductDevProjectTableBean(b.getMSATER_PNO());
			InsertFlowAndHis(t, b.getMSATER_PNO(), b.getMSATER_PNO() + "_"
					+ (beanList.indexOf(b) + 1), bean.getREQ_EMPID().trim());
		}
		t.close();
	}

	public void InsertFlowAndHis(talk t, String MSATER_PNO, String SUB_PNO,
			String EMPID) throws SQLException, Exception {
		String sql = "";
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date date = new Date();
		String strDate = sdFormat.format(date);

		sql = "INSERT INTO SUB_PRODUCT_DEV_PROJECT_TABLE_FLOWC"
				+ " (MSATER_PNO ,SUB_PNO ,F_INP_STAT , F_INP_ID , F_INP_TIME , F_INP_INFO)"
				+ " VALUES ('" + MSATER_PNO + "','" + SUB_PNO + "','相關單位主管','"
				+ EMPID + "','" + strDate + "','相關單位主管')";

		t.execFromPool(sql);

		sql = "INSERT INTO SUB_PRODUCT_DEV_PROJECT_TABLE_FLOWC_HIS"
				+ " (MSATER_PNO ,SUB_PNO ,F_INP_STAT , F_INP_ID , F_INP_TIME , F_INP_INFO)"
				+ " VALUES ('" + MSATER_PNO + "','" + SUB_PNO + "','相關單位主管','"
				+ EMPID + "','" + strDate + "','相關單位主管')";
		t.execFromPool(sql);

	}

	@Override
	public String action(String arg0) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

}
