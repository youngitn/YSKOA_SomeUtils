package SomeUtils.Bean;

import java.io.Serializable;





public class LabRecbookUsingApplyBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 63736332335269325L;
	private String PNO = "";
	private String RECBOOK_NO = "";
	private String RECBOOK_NAME = "";
	private String REC_START_DATE = "";
	private String REC_END_DATE = "";
	private String REQ_EMPID = "";

	public LabRecbookUsingApplyBean(String pNO, String rECBOOK_NO,
			String rECBOOK_NAME, String rEC_START_DATE, String rEC_END_DATE,
			String rEQ_EMPID) {
		PNO = pNO;
		RECBOOK_NO = rECBOOK_NO;
		RECBOOK_NAME = rECBOOK_NAME;
		REC_START_DATE = rEC_START_DATE;
		REC_END_DATE = rEC_END_DATE;
		REQ_EMPID = rEQ_EMPID;
		
	}
	

	public String getPNO() {
		return PNO;
	}

	public void setPNO(String pNO) {
		PNO = pNO;
	}

	public String getRECBOOK_NO() {
		return RECBOOK_NO;
	}

	public void setRECBOOK_NO(String rECBOOK_NO) {
		RECBOOK_NO = rECBOOK_NO;
	}

	public String getRECBOOK_NAME() {
		return RECBOOK_NAME;
	}

	public void setRECBOOK_NAME(String rECBOOK_NAME) {
		RECBOOK_NAME = rECBOOK_NAME;
	}

	public String getREC_START_DATE() {
		return REC_START_DATE;
	}

	public void setREC_START_DATE(String rEC_START_DATE) {
		REC_START_DATE = rEC_START_DATE;
	}

	public String getREC_END_DATE() {
		return REC_END_DATE;
	}

	public void setREC_END_DATE(String rEC_END_DATE) {
		REC_END_DATE = rEC_END_DATE;
	}

	public String getREQ_EMPID() {
		return REQ_EMPID;
	}

	public void setREQ_EMPID(String rEQ_EMPID) {
		REQ_EMPID = rEQ_EMPID;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
