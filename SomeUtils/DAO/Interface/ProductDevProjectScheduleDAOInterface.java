package SomeUtils.DAO.Interface;

import java.sql.SQLException;

import SomeUtils.Bean.ProductDevProjectScheduleBean;

public interface ProductDevProjectScheduleDAOInterface {
	public ProductDevProjectScheduleBean getProductDevProjectScheduleBean(String PNO) throws SQLException, Exception;
	public void update(ProductDevProjectScheduleBean bean) throws SQLException, Exception;
}
