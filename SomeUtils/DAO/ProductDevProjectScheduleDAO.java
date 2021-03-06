package SomeUtils.DAO;

import java.sql.SQLException;

import org.apache.commons.lang.StringUtils;

import jcx.db.talk;
import jcx.jform.hproc;
import SomeUtils.Bean.ProductDevProjectScheduleBean;
import SomeUtils.DAO.Interface.ProductDevProjectScheduleDAOInterface;

public class ProductDevProjectScheduleDAO extends hproc implements
		ProductDevProjectScheduleDAOInterface {

	talk t;
	String tableString =  "PRODUCT_DEV_PROJECT_SCHEDULE";
	public ProductDevProjectScheduleDAO(talk t) {
		this.t = t;
	}

	@Override
	public String action(String arg0) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductDevProjectScheduleBean getProductDevProjectScheduleBean(
			String PNO) throws SQLException, Exception {
		// TODO Auto-generated method stub
		ProductDevProjectScheduleBean pBean = null;

		String[][] ret = t
				.queryFromPool("select * from "+tableString+" where PNO = '"
						+ PNO + "'");

		pBean = new ProductDevProjectScheduleBean(ret[0][0],// PNO
				ret[0][1],// PROJECT_NO
				ret[0][2],// EXP_MATERIAL_ATTENDANCE_DATE
				ret[0][3],// EXP_SMALL_TEST_DATE
				ret[0][4],// EXP_SMALL_TEST_END_DATE
				ret[0][5],// EXP_MIDDLE_TEST_DATE
				ret[0][6],// EXP_METHODOLOGY_BEGIN_DATE
				ret[0][7],// EXP_STABILITY_SAMPLES_PLACED_DATE
				ret[0][8],// EXP_REPORTING_DATE
				ret[0][9],// PROJECT_STATUS
				ret[0][10],// CLOSING_DATE
				ret[0][11],// REFERENCE_FILE_1
				ret[0][12],// REFERENCE_FILE_2
				ret[0][13]// REFERENCE_FILE_3
		);

		t.close();
		return pBean;

	}
	
	public ProductDevProjectScheduleBean getProductDevProjectScheduleBeanByProjectNo(
			String ProjectNo) throws SQLException, Exception {
		// TODO Auto-generated method stub
		ProductDevProjectScheduleBean pBean = null;

		String[][] ret = t
				.queryFromPool("select * from "+tableString+" where PROJECT_NO = '"
						+ ProjectNo + "'");

		

		t.close();
		if (ret.length != 0 ){
			pBean = new ProductDevProjectScheduleBean(ret[0][0],// PNO
					ret[0][1],// PROJECT_NO
					ret[0][2],// EXP_MATERIAL_ATTENDANCE_DATE
					ret[0][3],// EXP_SMALL_TEST_DATE
					ret[0][4],// EXP_SMALL_TEST_END_DATE
					ret[0][5],// EXP_MIDDLE_TEST_DATE
					ret[0][6],// EXP_METHODOLOGY_BEGIN_DATE
					ret[0][7],// EXP_STABILITY_SAMPLES_PLACED_DATE
					ret[0][8],// EXP_REPORTING_DATE
					ret[0][9],// PROJECT_STATUS
					ret[0][10],// CLOSING_DATE
					ret[0][11],// REFERENCE_FILE_1
					ret[0][12],// REFERENCE_FILE_2
					ret[0][13]// REFERENCE_FILE_3
			);
			return pBean;
		}
		return null;

	}

	@Override
	public void update(ProductDevProjectScheduleBean bean)
			throws SQLException, Exception {
		// TODO Auto-generated method stub
		String sql = "update "+tableString+" set "
				+ " PROJECT_NO = '"
				+ bean.getPROJECT_NO()
				+ "'"
				+ ", EXP_MATERIAL_ATTENDANCE_DATE = '"
				+ bean.getEXP_MATERIAL_ATTENDANCE_DATE()
				+ "'"
				+ ", EXP_SMALL_TEST_DATE = '"
				+ bean.getEXP_SMALL_TEST_DATE()
				+ "'"
				+ ", EXP_SMALL_TEST_END_DATE = '"
				+ bean.getEXP_SMALL_TEST_END_DATE()
				+ "'"
				+ ", EXP_MIDDLE_TEST_DATE = '"
				+ bean.getEXP_MIDDLE_TEST_DATE()
				+ "'"
				+ ", EXP_METHODOLOGY_BEGIN_DATE = '"
				+ bean.getEXP_METHODOLOGY_BEGIN_DATE()
				+ "'"
				+ ", EXP_STABILITY_SAMPLES_PLACED_DATE = '"
				+ bean.getEXP_STABILITY_SAMPLES_PLACED_DATE()
				+ "'"
				+ ", EXP_REPORTING_DATE = '"
				+ bean.getEXP_REPORTING_DATE()
				+ "'"
				+ ", PROJECT_STATUS = '"
				+ bean.getPROJECT_STATUS()
				+ "'"
				+ ", CLOSING_DATE = '"
				+ bean.getCLOSING_DATE()
				+ "' ";
		
		if (!StringUtils.isEmpty(bean.getREFERENCE_FILE_1())&& !bean.getREFERENCE_FILE_1().equals("null") ){
			sql += ", REFERENCE_FILE_1 = '" + bean.getREFERENCE_FILE_1() + "'";
			}
		if (!StringUtils.isEmpty(bean.getREFERENCE_FILE_2())&& !bean.getREFERENCE_FILE_2().equals("null")){
			sql += ", REFERENCE_FILE_2 = '" + bean.getREFERENCE_FILE_2() + "'";
			}
		if (!StringUtils.isEmpty(bean.getREFERENCE_FILE_3())&& !bean.getREFERENCE_FILE_3().equals("null")){
			sql += ", REFERENCE_FILE_3 = '" + bean.getREFERENCE_FILE_3() + "'";
			}
		
		
	
		sql += " where PNO = '" + bean.getPNO() + "'";
		System.out.println("ProductDevProjectScheduleDAO update()--"+sql);
		t.execFromPool(sql);
		t.close();
	}
	
	public void insert(ProductDevProjectScheduleBean bean) throws SQLException, Exception {
		String Fields = "PNO,"+
		"PROJECT_NO,"+
		"EXP_MATERIAL_ATTENDANCE_DATE,"+
		"EXP_SMALL_TEST_DATE,"+
		"EXP_SMALL_TEST_END_DATE,"+
		"EXP_MIDDLE_TEST_DATE,"+
		"EXP_METHODOLOGY_BEGIN_DATE,"+
		"EXP_STABILITY_SAMPLES_PLACED_DATE,"+
		"EXP_REPORTING_DATE,"+
		"PROJECT_STATUS,"+
		"CLOSING_DATE,"+
		"REFERENCE_FILE_1,"+
		"REFERENCE_FILE_2,"+
		"REFERENCE_FILE_3";
		
		t.execFromPool("INSERT INTO " + tableString + " (" + Fields + ")" + " VALUES ("+
				"'"+bean.getPNO()+"',"+
				"'"+bean.getPROJECT_NO()+"',"+
				"'"+bean.getEXP_MATERIAL_ATTENDANCE_DATE()+"',"+
				"'"+bean.getEXP_SMALL_TEST_DATE()+"',"+
				"'"+bean.getEXP_SMALL_TEST_END_DATE()+"',"+
				"'"+bean.getEXP_MIDDLE_TEST_DATE()+"',"+
				"'"+bean.getEXP_METHODOLOGY_BEGIN_DATE()+"',"+
				"'"+bean.getEXP_STABILITY_SAMPLES_PLACED_DATE()+"',"+
				"'"+bean.getEXP_REPORTING_DATE()+"',"+
				"'"+bean.getPROJECT_STATUS()+"',"+
				"'"+bean.getCLOSING_DATE()+"',"+
				"'"+bean.getREFERENCE_FILE_1()+"',"+
				"'"+bean.getREFERENCE_FILE_2()+"',"+
				"'"+bean.getREFERENCE_FILE_3()+"'"+
				");");
		
	}

}
