package SomeUtils.DAO.Interface;

import java.sql.SQLException;
import java.util.ArrayList;

import SomeUtils.Bean.SubProductDevProjectTableBean;

public interface SubProductDevProjectTableDAOInterface {
	public void add(ArrayList<SubProductDevProjectTableBean> beanList) throws SQLException, Exception;
}
