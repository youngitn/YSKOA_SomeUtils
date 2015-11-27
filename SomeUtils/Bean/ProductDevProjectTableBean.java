package SomeUtils.Bean;

import java.io.Serializable;

public class ProductDevProjectTableBean implements Serializable {

	/**
	 * 
	 */

	private static final long serialVersionUID = 8838462362464304307L;
	private String PNO;
	private String DATE;
	private String P_NAME;
	private String DESCRIPTION;
	private String EXP_DATE;
	private String GENERIC_CNAME;
	private String GENERIC_ENAME;
	private String DOSAGE_FORM;
	private String DOSE;
	private String PACKING;
	private String DEV_TYPE;
	private String MEDICINE_TYPE;
	private String SALES_ATTACHED;
	private String LAW_ATTACHED;
	private String PURCH_ATTACHED;
	private String PROCESS_ATTACHED;
	private String RD_ATTACHED;
	private String IS_APPROVE;
	private String PROJECT_NO;

	public ProductDevProjectTableBean(String pNO, String dATE,
			String p_NAME, String dESCRIPTION, String eXP_DATE,
			String gENERIC_CNAME, String gENERIC_ENAME, String dOSAGE_FORM,
			String dOSE, String pACKING, String dEV_TYPE, String mEDICINE_TYPE,
			String sALES_ATTACHED, String lAW_ATTACHED, String pURCH_ATTACHED,
			String pROCESS_ATTACHED, String rD_ATTACHED, String iS_APPROVE,
			String pROJECT_NO) {
		super();
		PNO = pNO;
		DATE = dATE;
		P_NAME = p_NAME;
		DESCRIPTION = dESCRIPTION;
		EXP_DATE = eXP_DATE;
		GENERIC_CNAME = gENERIC_CNAME;
		GENERIC_ENAME = gENERIC_ENAME;
		DOSAGE_FORM = dOSAGE_FORM;
		DOSE = dOSE;
		PACKING = pACKING;
		DEV_TYPE = dEV_TYPE;
		MEDICINE_TYPE = mEDICINE_TYPE;
		SALES_ATTACHED = sALES_ATTACHED;
		LAW_ATTACHED = lAW_ATTACHED;
		PURCH_ATTACHED = pURCH_ATTACHED;
		PROCESS_ATTACHED = pROCESS_ATTACHED;
		RD_ATTACHED = rD_ATTACHED;
		IS_APPROVE = iS_APPROVE;
		PROJECT_NO = pROJECT_NO;

	}

	public String getPNO() {
		return PNO;
	}

	public void setPNO(String pNO) {
		PNO = pNO;
	}

	public String getDATE() {
		return DATE;
	}

	public void setDATE(String dATE) {
		DATE = dATE;
	}

	public String getP_NAME() {
		return P_NAME;
	}

	public void setP_NAME(String p_NAME) {
		P_NAME = p_NAME;
	}

	public String getDESCRIPTION() {
		return DESCRIPTION;
	}

	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}

	public String getEXP_DATE() {
		return EXP_DATE;
	}

	public void setEXP_DATE(String eXP_DATE) {
		EXP_DATE = eXP_DATE;
	}

	public String getGENERIC_CNAME() {
		return GENERIC_CNAME;
	}

	public void setGENERIC_CNAME(String gENERIC_CNAME) {
		GENERIC_CNAME = gENERIC_CNAME;
	}

	public String getGENERIC_ENAME() {
		return GENERIC_ENAME;
	}

	public void setGENERIC_ENAME(String gENERIC_ENAME) {
		GENERIC_ENAME = gENERIC_ENAME;
	}

	public String getDOSAGE_FORM() {
		return DOSAGE_FORM;
	}

	public void setDOSAGE_FORM(String dOSAGE_FORM) {
		DOSAGE_FORM = dOSAGE_FORM;
	}

	public String getDOSE() {
		return DOSE;
	}

	public void setDOSE(String dOSE) {
		DOSE = dOSE;
	}

	public String getPACKING() {
		return PACKING;
	}

	public void setPACKING(String pACKING) {
		PACKING = pACKING;
	}

	public String getDEV_TYPE() {
		return DEV_TYPE;
	}

	public void setDEV_TYPE(String dEV_TYPE) {
		DEV_TYPE = dEV_TYPE;
	}

	public String getMEDICINE_TYPE() {
		return MEDICINE_TYPE;
	}

	public void setMEDICINE_TYPE(String mEDICINE_TYPE) {
		MEDICINE_TYPE = mEDICINE_TYPE;
	}

	public String getSALES_ATTACHED() {
		return SALES_ATTACHED;
	}

	public void setSALES_ATTACHED(String sALES_ATTACHED) {
		SALES_ATTACHED = sALES_ATTACHED;
	}

	public String getLAW_ATTACHED() {
		return LAW_ATTACHED;
	}

	public void setLAW_ATTACHED(String lAW_ATTACHED) {
		LAW_ATTACHED = lAW_ATTACHED;
	}

	public String getPURCH_ATTACHED() {
		return PURCH_ATTACHED;
	}

	public void setPURCH_ATTACHED(String pURCH_ATTACHED) {
		PURCH_ATTACHED = pURCH_ATTACHED;
	}

	public String getPROCESS_ATTACHED() {
		return PROCESS_ATTACHED;
	}

	public void setPROCESS_ATTACHED(String pROCESS_ATTACHED) {
		PROCESS_ATTACHED = pROCESS_ATTACHED;
	}

	public String getRD_ATTACHED() {
		return RD_ATTACHED;
	}

	public void setRD_ATTACHED(String rD_ATTACHED) {
		RD_ATTACHED = rD_ATTACHED;
	}

	public String getIS_APPROVE() {
		return IS_APPROVE;
	}

	public void setIS_APPROVE(String iS_APPROVE) {
		IS_APPROVE = iS_APPROVE;
	}

	public String getPROJECT_NO() {
		return PROJECT_NO;
	}

	public void setPROJECT_NO(String pROJECT_NO) {
		PROJECT_NO = pROJECT_NO;
	}

}
