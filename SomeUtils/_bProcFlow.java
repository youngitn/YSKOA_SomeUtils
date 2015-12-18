package SomeUtils;

import java.sql.SQLException;

import jcx.db.talk;
import jcx.jform.bProcFlow;

public class _bProcFlow extends bProcFlow {

	@Override
	public boolean action(String arg0) throws Throwable {
		// TODO Auto-generated method stub
		return false;
	}
	
	/**
	 * §R°£³æ¾Ú
	 * @param tableName
	 * @param key
	 * @throws SQLException
	 * @throws Exception
	 */
	public void del(String tableName,String key) throws SQLException, Exception{
		talk t = getTalk();
		t.execFromPool("DELETE FROM "+tableName+" WHERE PNO = '"+key+"';");
		t.execFromPool("DELETE FROM "+tableName+"_FLOWC WHERE PNO = '"+key+"';");
		t.execFromPool("DELETE FROM "+tableName+"_FLOWC_HIS WHERE PNO = '"+key+"';");
		t.close();
	}

}
