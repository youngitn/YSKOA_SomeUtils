package SomeUtils.DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import jcx.db.talk;
import jcx.jform.hproc;
import SomeUtils.Bean.SubProductDevProjectTableBean;
import SomeUtils.DAO.Interface.SubProductDevProjectTableDAOInterface;

public class SubProductDevProjectTableDAO extends hproc implements
		SubProductDevProjectTableDAOInterface {
	talk t;

	public SubProductDevProjectTableDAO(talk t) {
		super();
		this.t = t;
	}

	public void add(ArrayList<SubProductDevProjectTableBean> beanList)
			throws SQLException, Exception {
		// TODO Auto-generated method stub
		for (SubProductDevProjectTableBean b : beanList) {

			t.execFromPool("INSERT INTO SUB_PRODUCT_DEV_PROJECT_TABLE (DEPT_FLAG,MSATER_PNO,SUB_PNO)"
					+ " VALUES ('"
					+ b.getDEPT_FLAG().trim()
					+ "', '"
					+ b.getMSATER_PNO() 
					+ "','" 
					+ b.getSUB_PNO() + "');");
		}
		t.close();
	}

	@Override
	public String action(String arg0) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

}
