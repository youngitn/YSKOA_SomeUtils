package SomeUtils.DAO.Interface;

import java.sql.SQLException;

import SomeUtils.Bean.ProductDevProjectTableBean;


public interface ProductDevProjectTableDAOInterface {

	public ProductDevProjectTableBean getProductDevProjectTableBean(String PNO) throws SQLException, Exception;
	public void update(ProductDevProjectTableBean bean) throws SQLException, Exception;
	
}
