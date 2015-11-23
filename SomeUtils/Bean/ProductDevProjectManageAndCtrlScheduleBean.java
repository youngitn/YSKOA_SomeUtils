package SomeUtils.Bean;

import java.io.Serializable;

public class ProductDevProjectManageAndCtrlScheduleBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4045464807088456302L;
	private String PNO;
	private String PROJECT_NO;
	private String EXP_MATERIAL_ATTENDANCE_DATE;
	private String EXP_SMALL_TEST_DATE;
	private String EXP_SMALL_TEST_END_DATE;
	private String EXP_MIDDLE_TEST_DATE;
	private String EXP_METHODOLOGY_BEGIN_DATE;
	private String EXP_STABILITY_SAMPLES_PLACED_DATE;
	private String EXP_REPORTING_DATE;
	private String PROJECT_STATUS;
	private String CLOSING_DATE;
	private String REFERENCE_FILE_1;
	private String REFERENCE_FILE_2;
	private String EFERENCE_FILE_3;

	public ProductDevProjectManageAndCtrlScheduleBean(String pNO,
			String pROJECT_NO, String eXP_MATERIAL_ATTENDANCE_DATE,
			String eXP_SMALL_TEST_DATE, String eXP_SMALL_TEST_END_DATE,
			String eXP_MIDDLE_TEST_DATE, String eXP_METHODOLOGY_BEGIN_DATE,
			String eXP_STABILITY_SAMPLES_PLACED_DATE,
			String eXP_REPORTING_DATE, String pROJECT_STATUS,
			String cLOSING_DATE, String rEFERENCE_FILE_1,
			String rEFERENCE_FILE_2, String eFERENCE_FILE_3) {
		super();
		PNO = pNO;
		PROJECT_NO = pROJECT_NO;
		EXP_MATERIAL_ATTENDANCE_DATE = eXP_MATERIAL_ATTENDANCE_DATE;
		EXP_SMALL_TEST_DATE = eXP_SMALL_TEST_DATE;
		EXP_SMALL_TEST_END_DATE = eXP_SMALL_TEST_END_DATE;
		EXP_MIDDLE_TEST_DATE = eXP_MIDDLE_TEST_DATE;
		EXP_METHODOLOGY_BEGIN_DATE = eXP_METHODOLOGY_BEGIN_DATE;
		EXP_STABILITY_SAMPLES_PLACED_DATE = eXP_STABILITY_SAMPLES_PLACED_DATE;
		EXP_REPORTING_DATE = eXP_REPORTING_DATE;
		PROJECT_STATUS = pROJECT_STATUS;
		CLOSING_DATE = cLOSING_DATE;
		REFERENCE_FILE_1 = rEFERENCE_FILE_1;
		REFERENCE_FILE_2 = rEFERENCE_FILE_2;
		EFERENCE_FILE_3 = eFERENCE_FILE_3;
	}

	public String getPROJECT_NO() {
		return PROJECT_NO;
	}

	public void setPROJECT_NO(String pROJECT_NO) {
		PROJECT_NO = pROJECT_NO;
	}

	public String getEXP_MATERIAL_ATTENDANCE_DATE() {
		return EXP_MATERIAL_ATTENDANCE_DATE;
	}

	public void setEXP_MATERIAL_ATTENDANCE_DATE(
			String eXP_MATERIAL_ATTENDANCE_DATE) {
		EXP_MATERIAL_ATTENDANCE_DATE = eXP_MATERIAL_ATTENDANCE_DATE;
	}

	public String getEXP_SMALL_TEST_DATE() {
		return EXP_SMALL_TEST_DATE;
	}

	public void setEXP_SMALL_TEST_DATE(String eXP_SMALL_TEST_DATE) {
		EXP_SMALL_TEST_DATE = eXP_SMALL_TEST_DATE;
	}

	public String getEXP_SMALL_TEST_END_DATE() {
		return EXP_SMALL_TEST_END_DATE;
	}

	public void setEXP_SMALL_TEST_END_DATE(String eXP_SMALL_TEST_END_DATE) {
		EXP_SMALL_TEST_END_DATE = eXP_SMALL_TEST_END_DATE;
	}

	public String getEXP_MIDDLE_TEST_DATE() {
		return EXP_MIDDLE_TEST_DATE;
	}

	public void setEXP_MIDDLE_TEST_DATE(String eXP_MIDDLE_TEST_DATE) {
		EXP_MIDDLE_TEST_DATE = eXP_MIDDLE_TEST_DATE;
	}

	public String getEXP_METHODOLOGY_BEGIN_DATE() {
		return EXP_METHODOLOGY_BEGIN_DATE;
	}

	public void setEXP_METHODOLOGY_BEGIN_DATE(String eXP_METHODOLOGY_BEGIN_DATE) {
		EXP_METHODOLOGY_BEGIN_DATE = eXP_METHODOLOGY_BEGIN_DATE;
	}

	public String getEXP_STABILITY_SAMPLES_PLACED_DATE() {
		return EXP_STABILITY_SAMPLES_PLACED_DATE;
	}

	public void setEXP_STABILITY_SAMPLES_PLACED_DATE(
			String eXP_STABILITY_SAMPLES_PLACED_DATE) {
		EXP_STABILITY_SAMPLES_PLACED_DATE = eXP_STABILITY_SAMPLES_PLACED_DATE;
	}

	public String getEXP_REPORTING_DATE() {
		return EXP_REPORTING_DATE;
	}

	public void setEXP_REPORTING_DATE(String eXP_REPORTING_DATE) {
		EXP_REPORTING_DATE = eXP_REPORTING_DATE;
	}

	public String getPROJECT_STATUS() {
		return PROJECT_STATUS;
	}

	public void setPROJECT_STATUS(String pROJECT_STATUS) {
		PROJECT_STATUS = pROJECT_STATUS;
	}

	public String getCLOSING_DATE() {
		return CLOSING_DATE;
	}

	public void setCLOSING_DATE(String cLOSING_DATE) {
		CLOSING_DATE = cLOSING_DATE;
	}

	public String getREFERENCE_FILE_1() {
		return REFERENCE_FILE_1;
	}

	public void setREFERENCE_FILE_1(String rEFERENCE_FILE_1) {
		REFERENCE_FILE_1 = rEFERENCE_FILE_1;
	}

	public String getREFERENCE_FILE_2() {
		return REFERENCE_FILE_2;
	}

	public void setREFERENCE_FILE_2(String rEFERENCE_FILE_2) {
		REFERENCE_FILE_2 = rEFERENCE_FILE_2;
	}

	public String getREFERENCE_FILE_3() {
		return EFERENCE_FILE_3;
	}

	public void setEFERENCE_FILE_3(String eFERENCE_FILE_3) {
		EFERENCE_FILE_3 = eFERENCE_FILE_3;
	}

	public String getPNO() {
		return PNO;
	}

	public void setPNO(String pNO) {
		PNO = pNO;
	}

}
