package SomeUtils.DAO.Interface;

import java.sql.SQLException;

import SomeUtils.Bean.ProductDevProjectManageAndCtrlScheduleBean;

public interface ProductDevProjectManageAndCtrlScheduleDAOInterface {
	public ProductDevProjectManageAndCtrlScheduleBean getProductDevProjectManageAndCtrlScheduleBean(String PNO) throws SQLException, Exception;
	public void update(ProductDevProjectManageAndCtrlScheduleBean bean) throws SQLException, Exception;
}
