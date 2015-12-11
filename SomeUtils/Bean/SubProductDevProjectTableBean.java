package SomeUtils.Bean;

import java.io.Serializable;

public class SubProductDevProjectTableBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -589041514885161864L;
	private String DEPT_FLAG;
	private String MSATER_PNO;
	private String SUB_PNO;
	public SubProductDevProjectTableBean(String dEPT_FLAG, String mSATER_PNO,
			String sUB_PNO) {
		super();
		DEPT_FLAG = dEPT_FLAG;
		MSATER_PNO = mSATER_PNO;
		SUB_PNO = sUB_PNO;
	}
	public String getDEPT_FLAG() {
		return DEPT_FLAG;
	}
	public void setDEPT_FLAG(String dEPT_FLAG) {
		DEPT_FLAG = dEPT_FLAG;
	}
	public String getMSATER_PNO() {
		return MSATER_PNO;
	}
	public void setMSATER_PNO(String mSATER_PNO) {
		MSATER_PNO = mSATER_PNO;
	}
	public String getSUB_PNO() {
		return SUB_PNO;
	}
	public void setSUB_PNO(String sUB_PNO) {
		SUB_PNO = sUB_PNO;
	}
	
}
