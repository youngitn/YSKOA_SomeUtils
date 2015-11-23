package SomeUtils.DAO.Interface;

import java.sql.SQLException;

import SomeUtils.Bean.ProductDevProjectManageAndCtrlTableBean;


public interface ProductDevProjectManageAndCtrlTableDAOInterface {

	public ProductDevProjectManageAndCtrlTableBean getProductDevProjectManageAndCtrlTableBean(String PNO) throws SQLException, Exception;
	public void update(ProductDevProjectManageAndCtrlTableBean bean) throws SQLException, Exception;
	
}
