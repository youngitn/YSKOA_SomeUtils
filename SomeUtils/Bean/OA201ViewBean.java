package SomeUtils.Bean;

import java.io.Serializable;


public class OA201ViewBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -116720122352151037L;
	
	private String UUID = "";
	private String CATEGORY= "";
	private String ISSUE_DATE= "";
	private String STORE_PATH= "";
	private String COST_CENTER= "";
	private String TRACK_NO= "";
	private String ISSUE_NO= "";
	private String ITEM_CONT= "";
	private String MAT_PO_CONT= "";
	private String MAT_CODE= "";
	private String MAT_CONT= "";
	private String MAT_UNIT= "";
	private String DELIVER_DATE= "";
	private String REQ_NUM= "";
	private String ASS_PRICE= "";
	private String MONEY= "";
	private String ASS_NUM= "";
	private String ASS_UNIT= "";
	private String ASS_TOTAL= "";
	private String EXP_NUM= "";
	private String RECEIVER= "";
	private String NET_PIC1= "";
	private String NET_PIC2= "";
	private String ORDER_NO= "";
	private String SELL_ORDER_NO= "";
	private String BUY_CLERK= "";
	private String NOTIFY_IT= "";
	private String ATT_PATH= "";
	private String LED_ACC= "";
	private String ACC_TYPE= "";
	private String PONO= "";
	private String FILLIN_EMP_ID= "";
	private String REQ_EMP_ID= "";
	private String REQ_DATE= "";
	private String REQ_TIME= "";
	private String UPDATE_EMP_ID= "";
	private String UPDATE_DATE= "";
	private String UPDATE_TIME= "";
	private String REQ_DATE_START= "";
	private String REQ_DATE_END= "";
	private String REQ_HECNAME= "";
	private String REQ_EXT= "";
	private String REQ_DEPT_NO= "";
	private String REQ_DEP_NAME= "";
	private String REQ_DEP_TYPE= "";
	private String REQ_DEP_CHIEF= "";
	private String FILLIN_NAME= "";
	private String FILLIN_EXT= "";
	private String FILLIN_DEPT_NO= "";
	private String FILLIN_DEP_NAME= "";
	private String FILLIN_DEP_TYPE= "";
	private String FILLIN_DEP_CHIEF= "";
	private String UPDATE_EMP_NAME= "";
	private String F_INP_STAT= "";
	private String DETAIL_V= "";
	private String SIGN_HISTORY_V= "";
	private String PRINT_V= "";
	private String CATEGORY_NAME= "";
	private String STORE_PATH_NAME= "";
	private String F_INP_STAT_V= "";
	public OA201ViewBean(String uUID, String cATEGORY, String iSSUE_DATE,
			String sTORE_PATH, String cOST_CENTER, String tRACK_NO,
			String iSSUE_NO, String iTEM_CONT, String mAT_PO_CONT,
			String mAT_CODE, String mAT_CONT, String mAT_UNIT,
			String dELIVER_DATE, String rEQ_NUM, String aSS_PRICE,
			String mONEY, String aSS_NUM, String aSS_UNIT, String aSS_TOTAL,
			String eXP_NUM, String rECEIVER, String nET_PIC1, String nET_PIC2,
			String oRDER_NO, String sELL_ORDER_NO, String bUY_CLERK,
			String nOTIFY_IT, String aTT_PATH, String lED_ACC, String aCC_TYPE,
			String pONO, String fILLIN_EMP_ID, String rEQ_EMP_ID,
			String rEQ_DATE, String rEQ_TIME, String uPDATE_EMP_ID,
			String uPDATE_DATE, String uPDATE_TIME, String rEQ_DATE_START,
			String rEQ_DATE_END, String rEQ_HECNAME, String rEQ_EXT,
			String rEQ_DEPT_NO, String rEQ_DEP_NAME, String rEQ_DEP_TYPE,
			String rEQ_DEP_CHIEF, String fILLIN_NAME, String fILLIN_EXT,
			String fILLIN_DEPT_NO, String fILLIN_DEP_NAME,
			String fILLIN_DEP_TYPE, String fILLIN_DEP_CHIEF,
			String uPDATE_EMP_NAME, String f_INP_STAT, String dETAIL_V,
			String sIGN_HISTORY_V, String pRINT_V, String cATEGORY_NAME,
			String sTORE_PATH_NAME, String f_INP_STAT_V) {
		
		UUID = uUID;
		CATEGORY = cATEGORY;
		ISSUE_DATE = iSSUE_DATE;
		STORE_PATH = sTORE_PATH;
		COST_CENTER = cOST_CENTER;
		TRACK_NO = tRACK_NO;
		ISSUE_NO = iSSUE_NO;
		ITEM_CONT = iTEM_CONT;
		MAT_PO_CONT = mAT_PO_CONT;
		MAT_CODE = mAT_CODE;
		MAT_CONT = mAT_CONT;
		MAT_UNIT = mAT_UNIT;
		DELIVER_DATE = dELIVER_DATE;
		REQ_NUM = rEQ_NUM;
		ASS_PRICE = aSS_PRICE;
		MONEY = mONEY;
		ASS_NUM = aSS_NUM;
		ASS_UNIT = aSS_UNIT;
		ASS_TOTAL = aSS_TOTAL;
		EXP_NUM = eXP_NUM;
		RECEIVER = rECEIVER;
		NET_PIC1 = nET_PIC1;
		NET_PIC2 = nET_PIC2;
		ORDER_NO = oRDER_NO;
		SELL_ORDER_NO = sELL_ORDER_NO;
		BUY_CLERK = bUY_CLERK;
		NOTIFY_IT = nOTIFY_IT;
		ATT_PATH = aTT_PATH;
		LED_ACC = lED_ACC;
		ACC_TYPE = aCC_TYPE;
		PONO = pONO;
		FILLIN_EMP_ID = fILLIN_EMP_ID;
		REQ_EMP_ID = rEQ_EMP_ID;
		REQ_DATE = rEQ_DATE;
		REQ_TIME = rEQ_TIME;
		UPDATE_EMP_ID = uPDATE_EMP_ID;
		UPDATE_DATE = uPDATE_DATE;
		UPDATE_TIME = uPDATE_TIME;
		REQ_DATE_START = rEQ_DATE_START;
		REQ_DATE_END = rEQ_DATE_END;
		REQ_HECNAME = rEQ_HECNAME;
		REQ_EXT = rEQ_EXT;
		REQ_DEPT_NO = rEQ_DEPT_NO;
		REQ_DEP_NAME = rEQ_DEP_NAME;
		REQ_DEP_TYPE = rEQ_DEP_TYPE;
		REQ_DEP_CHIEF = rEQ_DEP_CHIEF;
		FILLIN_NAME = fILLIN_NAME;
		FILLIN_EXT = fILLIN_EXT;
		FILLIN_DEPT_NO = fILLIN_DEPT_NO;
		FILLIN_DEP_NAME = fILLIN_DEP_NAME;
		FILLIN_DEP_TYPE = fILLIN_DEP_TYPE;
		FILLIN_DEP_CHIEF = fILLIN_DEP_CHIEF;
		UPDATE_EMP_NAME = uPDATE_EMP_NAME;
		F_INP_STAT = f_INP_STAT;
		DETAIL_V = dETAIL_V;
		SIGN_HISTORY_V = sIGN_HISTORY_V;
		PRINT_V = pRINT_V;
		CATEGORY_NAME = cATEGORY_NAME;
		STORE_PATH_NAME = sTORE_PATH_NAME;
		F_INP_STAT_V = f_INP_STAT_V;
	}
	
	public String getUUID() {
		return UUID;
	}
	public void setUUID(String uUID) {
		UUID = uUID;
	}
	public String getCATEGORY() {
		return CATEGORY;
	}
	public void setCATEGORY(String cATEGORY) {
		CATEGORY = cATEGORY;
	}
	public String getISSUE_DATE() {
		return ISSUE_DATE;
	}
	public void setISSUE_DATE(String iSSUE_DATE) {
		ISSUE_DATE = iSSUE_DATE;
	}
	public String getSTORE_PATH() {
		return STORE_PATH;
	}
	public void setSTORE_PATH(String sTORE_PATH) {
		STORE_PATH = sTORE_PATH;
	}
	public String getCOST_CENTER() {
		return COST_CENTER;
	}
	public void setCOST_CENTER(String cOST_CENTER) {
		COST_CENTER = cOST_CENTER;
	}
	public String getTRACK_NO() {
		return TRACK_NO;
	}
	public void setTRACK_NO(String tRACK_NO) {
		TRACK_NO = tRACK_NO;
	}
	public String getISSUE_NO() {
		return ISSUE_NO;
	}
	public void setISSUE_NO(String iSSUE_NO) {
		ISSUE_NO = iSSUE_NO;
	}
	public String getITEM_CONT() {
		return ITEM_CONT;
	}
	public void setITEM_CONT(String iTEM_CONT) {
		ITEM_CONT = iTEM_CONT;
	}
	public String getMAT_PO_CONT() {
		return MAT_PO_CONT;
	}
	public void setMAT_PO_CONT(String mAT_PO_CONT) {
		MAT_PO_CONT = mAT_PO_CONT;
	}
	public String getMAT_CODE() {
		return MAT_CODE;
	}
	public void setMAT_CODE(String mAT_CODE) {
		MAT_CODE = mAT_CODE;
	}
	public String getMAT_CONT() {
		return MAT_CONT;
	}
	public void setMAT_CONT(String mAT_CONT) {
		MAT_CONT = mAT_CONT;
	}
	public String getMAT_UNIT() {
		return MAT_UNIT;
	}
	public void setMAT_UNIT(String mAT_UNIT) {
		MAT_UNIT = mAT_UNIT;
	}
	public String getDELIVER_DATE() {
		return DELIVER_DATE;
	}
	public void setDELIVER_DATE(String dELIVER_DATE) {
		DELIVER_DATE = dELIVER_DATE;
	}
	public String getREQ_NUM() {
		return REQ_NUM;
	}
	public void setREQ_NUM(String rEQ_NUM) {
		REQ_NUM = rEQ_NUM;
	}
	public String getASS_PRICE() {
		return ASS_PRICE;
	}
	public void setASS_PRICE(String aSS_PRICE) {
		ASS_PRICE = aSS_PRICE;
	}
	public String getMONEY() {
		return MONEY;
	}
	public void setMONEY(String mONEY) {
		MONEY = mONEY;
	}
	public String getASS_NUM() {
		return ASS_NUM;
	}
	public void setASS_NUM(String aSS_NUM) {
		ASS_NUM = aSS_NUM;
	}
	public String getASS_UNIT() {
		return ASS_UNIT;
	}
	public void setASS_UNIT(String aSS_UNIT) {
		ASS_UNIT = aSS_UNIT;
	}
	public String getASS_TOTAL() {
		return ASS_TOTAL;
	}
	public void setASS_TOTAL(String aSS_TOTAL) {
		ASS_TOTAL = aSS_TOTAL;
	}
	public String getEXP_NUM() {
		return EXP_NUM;
	}
	public void setEXP_NUM(String eXP_NUM) {
		EXP_NUM = eXP_NUM;
	}
	public String getRECEIVER() {
		return RECEIVER;
	}
	public void setRECEIVER(String rECEIVER) {
		RECEIVER = rECEIVER;
	}
	public String getNET_PIC1() {
		return NET_PIC1;
	}
	public void setNET_PIC1(String nET_PIC1) {
		NET_PIC1 = nET_PIC1;
	}
	public String getNET_PIC2() {
		return NET_PIC2;
	}
	public void setNET_PIC2(String nET_PIC2) {
		NET_PIC2 = nET_PIC2;
	}
	public String getORDER_NO() {
		return ORDER_NO;
	}
	public void setORDER_NO(String oRDER_NO) {
		ORDER_NO = oRDER_NO;
	}
	public String getSELL_ORDER_NO() {
		return SELL_ORDER_NO;
	}
	public void setSELL_ORDER_NO(String sELL_ORDER_NO) {
		SELL_ORDER_NO = sELL_ORDER_NO;
	}
	public String getBUY_CLERK() {
		return BUY_CLERK;
	}
	public void setBUY_CLERK(String bUY_CLERK) {
		BUY_CLERK = bUY_CLERK;
	}
	public String getNOTIFY_IT() {
		return NOTIFY_IT;
	}
	public void setNOTIFY_IT(String nOTIFY_IT) {
		NOTIFY_IT = nOTIFY_IT;
	}
	public String getATT_PATH() {
		return ATT_PATH;
	}
	public void setATT_PATH(String aTT_PATH) {
		ATT_PATH = aTT_PATH;
	}
	public String getLED_ACC() {
		return LED_ACC;
	}
	public void setLED_ACC(String lED_ACC) {
		LED_ACC = lED_ACC;
	}
	public String getACC_TYPE() {
		return ACC_TYPE;
	}
	public void setACC_TYPE(String aCC_TYPE) {
		ACC_TYPE = aCC_TYPE;
	}
	public String getPONO() {
		return PONO;
	}
	public void setPONO(String pONO) {
		PONO = pONO;
	}
	public String getFILLIN_EMP_ID() {
		return FILLIN_EMP_ID;
	}
	public void setFILLIN_EMP_ID(String fILLIN_EMP_ID) {
		FILLIN_EMP_ID = fILLIN_EMP_ID;
	}
	public String getREQ_EMP_ID() {
		return REQ_EMP_ID;
	}
	public void setREQ_EMP_ID(String rEQ_EMP_ID) {
		REQ_EMP_ID = rEQ_EMP_ID;
	}
	public String getREQ_DATE() {
		return REQ_DATE;
	}
	public void setREQ_DATE(String rEQ_DATE) {
		REQ_DATE = rEQ_DATE;
	}
	public String getREQ_TIME() {
		return REQ_TIME;
	}
	public void setREQ_TIME(String rEQ_TIME) {
		REQ_TIME = rEQ_TIME;
	}
	public String getUPDATE_EMP_ID() {
		return UPDATE_EMP_ID;
	}
	public void setUPDATE_EMP_ID(String uPDATE_EMP_ID) {
		UPDATE_EMP_ID = uPDATE_EMP_ID;
	}
	public String getUPDATE_DATE() {
		return UPDATE_DATE;
	}
	public void setUPDATE_DATE(String uPDATE_DATE) {
		UPDATE_DATE = uPDATE_DATE;
	}
	public String getUPDATE_TIME() {
		return UPDATE_TIME;
	}
	public void setUPDATE_TIME(String uPDATE_TIME) {
		UPDATE_TIME = uPDATE_TIME;
	}
	public String getREQ_DATE_START() {
		return REQ_DATE_START;
	}
	public void setREQ_DATE_START(String rEQ_DATE_START) {
		REQ_DATE_START = rEQ_DATE_START;
	}
	public String getREQ_DATE_END() {
		return REQ_DATE_END;
	}
	public void setREQ_DATE_END(String rEQ_DATE_END) {
		REQ_DATE_END = rEQ_DATE_END;
	}
	public String getREQ_HECNAME() {
		return REQ_HECNAME;
	}
	public void setREQ_HECNAME(String rEQ_HECNAME) {
		REQ_HECNAME = rEQ_HECNAME;
	}
	public String getREQ_EXT() {
		return REQ_EXT;
	}
	public void setREQ_EXT(String rEQ_EXT) {
		REQ_EXT = rEQ_EXT;
	}
	public String getREQ_DEPT_NO() {
		return REQ_DEPT_NO;
	}
	public void setREQ_DEPT_NO(String rEQ_DEPT_NO) {
		REQ_DEPT_NO = rEQ_DEPT_NO;
	}
	public String getREQ_DEP_NAME() {
		return REQ_DEP_NAME;
	}
	public void setREQ_DEP_NAME(String rEQ_DEP_NAME) {
		REQ_DEP_NAME = rEQ_DEP_NAME;
	}
	public String getREQ_DEP_TYPE() {
		return REQ_DEP_TYPE;
	}
	public void setREQ_DEP_TYPE(String rEQ_DEP_TYPE) {
		REQ_DEP_TYPE = rEQ_DEP_TYPE;
	}
	public String getREQ_DEP_CHIEF() {
		return REQ_DEP_CHIEF;
	}
	public void setREQ_DEP_CHIEF(String rEQ_DEP_CHIEF) {
		REQ_DEP_CHIEF = rEQ_DEP_CHIEF;
	}
	public String getFILLIN_NAME() {
		return FILLIN_NAME;
	}
	public void setFILLIN_NAME(String fILLIN_NAME) {
		FILLIN_NAME = fILLIN_NAME;
	}
	public String getFILLIN_EXT() {
		return FILLIN_EXT;
	}
	public void setFILLIN_EXT(String fILLIN_EXT) {
		FILLIN_EXT = fILLIN_EXT;
	}
	public String getFILLIN_DEPT_NO() {
		return FILLIN_DEPT_NO;
	}
	public void setFILLIN_DEPT_NO(String fILLIN_DEPT_NO) {
		FILLIN_DEPT_NO = fILLIN_DEPT_NO;
	}
	public String getFILLIN_DEP_NAME() {
		return FILLIN_DEP_NAME;
	}
	public void setFILLIN_DEP_NAME(String fILLIN_DEP_NAME) {
		FILLIN_DEP_NAME = fILLIN_DEP_NAME;
	}
	public String getFILLIN_DEP_TYPE() {
		return FILLIN_DEP_TYPE;
	}
	public void setFILLIN_DEP_TYPE(String fILLIN_DEP_TYPE) {
		FILLIN_DEP_TYPE = fILLIN_DEP_TYPE;
	}
	public String getFILLIN_DEP_CHIEF() {
		return FILLIN_DEP_CHIEF;
	}
	public void setFILLIN_DEP_CHIEF(String fILLIN_DEP_CHIEF) {
		FILLIN_DEP_CHIEF = fILLIN_DEP_CHIEF;
	}
	public String getUPDATE_EMP_NAME() {
		return UPDATE_EMP_NAME;
	}
	public void setUPDATE_EMP_NAME(String uPDATE_EMP_NAME) {
		UPDATE_EMP_NAME = uPDATE_EMP_NAME;
	}
	public String getF_INP_STAT() {
		return F_INP_STAT;
	}
	public void setF_INP_STAT(String f_INP_STAT) {
		F_INP_STAT = f_INP_STAT;
	}
	public String getDETAIL_V() {
		return DETAIL_V;
	}
	public void setDETAIL_V(String dETAIL_V) {
		DETAIL_V = dETAIL_V;
	}
	public String getSIGN_HISTORY_V() {
		return SIGN_HISTORY_V;
	}
	public void setSIGN_HISTORY_V(String sIGN_HISTORY_V) {
		SIGN_HISTORY_V = sIGN_HISTORY_V;
	}
	public String getPRINT_V() {
		return PRINT_V;
	}
	public void setPRINT_V(String pRINT_V) {
		PRINT_V = pRINT_V;
	}
	public String getCATEGORY_NAME() {
		return CATEGORY_NAME;
	}
	public void setCATEGORY_NAME(String cATEGORY_NAME) {
		CATEGORY_NAME = cATEGORY_NAME;
	}
	public String getSTORE_PATH_NAME() {
		return STORE_PATH_NAME;
	}
	public void setSTORE_PATH_NAME(String sTORE_PATH_NAME) {
		STORE_PATH_NAME = sTORE_PATH_NAME;
	}
	public String getF_INP_STAT_V() {
		return F_INP_STAT_V;
	}
	public void setF_INP_STAT_V(String f_INP_STAT_V) {
		F_INP_STAT_V = f_INP_STAT_V;
	}

	
	
}
