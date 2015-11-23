package SomeUtils.DAO;

import java.sql.SQLException;

import jcx.db.talk;
import jcx.jform.hproc;
import SomeUtils.Bean.ProductDevProjectManageAndCtrlTableBean;
import SomeUtils.DAO.Interface.ProductDevProjectManageAndCtrlTableDAOInterface;

//PRODUCT_DEV_PROJECT_MANAGE_AND_CTRL_TABLE
public class ProductDevProjectManageAndCtrlTableDAO extends hproc implements
		ProductDevProjectManageAndCtrlTableDAOInterface {
	talk t;
	String tablesString = "PRODUCT_DEV_PROJECT_MANAGE_AND_CTRL_TABLE";
	public ProductDevProjectManageAndCtrlTableDAO(talk t) {
		this.t = t;
	}

	@Override
	public void update(ProductDevProjectManageAndCtrlTableBean bean)
			throws SQLException, Exception {
		// TODO Auto-generated method stub
		t.execFromPool("update "+tablesString+" set "
				+ " DATE = '" + bean.getDATE() + "'" 
				+ ", P_NAME = '"+ bean.getP_NAME() + "'" 
				+ ", DESCRIPTION = '" + bean.getDESCRIPTION() + "'" 
				+ ", EXP_DATE = '" + bean.getEXP_DATE() + "'" 
				+ ", GENERIC_CNAME = '" + bean.getGENERIC_CNAME() + "'" 
				+ ", GENERIC_ENAME = '" + bean.getGENERIC_ENAME() + "'" 
				+ ", DOSAGE_FORM = '" + bean.getDOSAGE_FORM() + "'" 
				+ ", DOSE = '" + bean.getDOSE() + "'" 
				+ ", PACKING = '" + bean.getPACKING() + "'" 
				+ ", DEV_TYPE = '" + bean.getDEV_TYPE() + "'" 
				+ ", MEDICINE_TYPE = '" + bean.getMEDICINE_TYPE() + "'" 
				+ ", SALES_ATTACHED = '" + bean.getSALES_ATTACHED() + "'" 
				+ ", LAW_ATTACHED = '" + bean.getLAW_ATTACHED() + "'" 
				+ ", PURCH_ATTACHED = '" + bean.getPURCH_ATTACHED() + "'" 
				+ ", PROCESS_ATTACHED = '" + bean.getPROCESS_ATTACHED() + "'" 
				+ ", RD_ATTACHED = '" + bean.getRD_ATTACHED() + "'" 
				+ ", IS_APPROVE = '" + bean.getIS_APPROVE() + "'" 
				+ ", PROJECT_NO = '" + bean.getPROJECT_NO() + "'" 			
				+ " where PNO = '" + bean.getPNO() + "'"
		);
		t.close();
	}

	@Override
	public ProductDevProjectManageAndCtrlTableBean getProductDevProjectManageAndCtrlTableBean(
			String PNO) throws SQLException, Exception {
		// TODO Auto-generated method stub
		ProductDevProjectManageAndCtrlTableBean pBean = null;

		String[][] ret = t
				.queryFromPool("select * from "+tablesString+" where PNO = '"
						+ PNO + "'");

		pBean = new ProductDevProjectManageAndCtrlTableBean(ret[0][0],// PNO
				ret[0][1],// DATE
				ret[0][2],// P_NAME
				ret[0][3],// DESCRIPTION
				ret[0][4],// EXP_DATE
				ret[0][5],// GENERIC_CNAME
				ret[0][6],// GENERIC_ENAME
				ret[0][7],// DOSAGE_FORM
				ret[0][8],// DOSE
				ret[0][9],// PACKING
				ret[0][10],// DEV_TYPE
				ret[0][11],// MEDICINE_TYPE
				ret[0][12],// SALES_ATTACHED
				ret[0][13],// LAW_ATTACHED
				ret[0][14],// PURCH_ATTACHED
				ret[0][15],// PROCESS_ATTACHED
				ret[0][16],// RD_ATTACHED
				ret[0][17],// IS_APPROVE
				ret[0][18]);// PROJECT_NO
		t.close();
		return pBean;
	}

	@Override
	public String action(String arg0) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

}
