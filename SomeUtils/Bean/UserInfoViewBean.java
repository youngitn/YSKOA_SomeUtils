package SomeUtils.Bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.CompareToBuilder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * UserInfoViewBean is a mapping of USER_INFO_VIEW Table.
 */
public class UserInfoViewBean implements Serializable {
	
	private static final long serialVersionUID = -3573042979184750733L;
	private String empidName;
	private boolean empidNameIsModified = false;
	private boolean empidNameIsInitialized = false;

	private String quitdate;
	private boolean quitdateIsModified = false;
	private boolean quitdateIsInitialized = false;
	
	private String state;
	private boolean stateIsModified = false;
	private boolean stateIsInitialized = false;

	private String inadate;
	private boolean inadateIsModified = false;
	private boolean inadateIsInitialized = false;
	/**
	 * 取得代理人姓名
	 */
	private String agentName;
	private boolean agentNameIsModified = false;
	private boolean agentNameIsInitialized = false;
	
	private String agent;
	private boolean agentIsModified = false;
	private boolean agentIsInitialized = false;

	private String bossName;
	private boolean bossNameIsModified = false;
	private boolean bossNameIsInitialized = false;

	private String posName;
	private boolean posNameIsModified = false;
	private boolean posNameIsInitialized = false;

	private String possie;
	private boolean possieIsModified = false;
	private boolean possieIsInitialized = false;

	private String depType;
	private boolean depTypeIsModified = false;
	private boolean depTypeIsInitialized = false;

	private Integer parentNo;
	private boolean parentNoIsModified = false;
	private boolean parentNoIsInitialized = false;

	private String depChief;
	private boolean depChiefIsModified = false;
	private boolean depChiefIsInitialized = false;

	private String depName;
	private boolean depNameIsModified = false;
	private boolean depNameIsInitialized = false;

	private Integer depNo;
	private boolean depNoIsModified = false;
	private boolean depNoIsInitialized = false;

	private String email;
	private boolean emailIsModified = false;
	private boolean emailIsInitialized = false;

	private String ext;
	private boolean extIsModified = false;
	private boolean extIsInitialized = false;

	private String hecname;
	private boolean hecnameIsModified = false;
	private boolean hecnameIsInitialized = false;

	private String deptNo;
	private boolean deptNoIsModified = false;
	private boolean deptNoIsInitialized = false;

	private String empid;
	private boolean empidIsModified = false;
	private boolean empidIsInitialized = false;

	private String cpnyid;
	private boolean cpnyidIsModified = false;
	private boolean cpnyidIsInitialized = false;

	private boolean _isNew = true;

	/**
	 * Prefered methods to create a UserInfoViewBean is via the
	 * createUserInfoViewBean method in UserInfoViewManager or via the factory
	 * class UserInfoViewFactory create method
	 */
	public UserInfoViewBean() {
	}

	/**
	 * Getter method for empidName. <br>
	 * Meta Data Information (in progress):
	 * <ul>
	 * <li>full name: USER_INFO_VIEW.EMPID_NAME</li>
	 * <li>column size: 71</li>
	 * <li>jdbc type returned by the driver: Types.VARCHAR</li>
	 * </ul>
	 *
	 * @return the value of empidName
	 */
	public String getEmpidName() {
		return empidName;
	}

	/**
	 * Setter method for empidName. <br>
	 * The new value is set only if compareTo() says it is different, or if one
	 * of either the new value or the current value is null. In case the new
	 * value is different, it is set and the field is marked as 'modified'.
	 *
	 * @param newVal
	 *            the new value to be assigned to empidName
	 */
	public void setEmpidName(String newVal) {
		this.setEmpidName(newVal, false);
	}

	/**
	 * Setter method for empidName. <br>
	 * The new value is set only if compareTo() says it is different, or if one
	 * of either the new value or the current value is null. In case the new
	 * value is different, it is set and the field is marked as 'modified'.
	 *
	 * @param newVal
	 *            the new value to be assigned to empidName
	 */
	public void setEmpidName(String newVal, boolean ignoreEmpty) {
		if (ignoreEmpty && StringUtils.isEmpty(newVal)) {
			return;
		}
		if ((newVal != null && empidName != null && (newVal
				.compareTo(empidName) == 0))
				|| (newVal == null && empidName == null && empidNameIsInitialized)) {
			return;
		}
		empidName = newVal;
		empidNameIsModified = true;
		empidNameIsInitialized = true;
	}

	/**
	 * Determines if the empidName has been modified.
	 *
	 * @return true if the field has been modified, false if the field has not
	 *         been modified
	 */
	public boolean isEmpidNameModified() {
		return empidNameIsModified;
	}

	/**
	 * Determines if the empidName has been initialized. <br>
	 * It is useful to determine if a field is null on purpose or just because
	 * it has not been initialized.
	 *
	 * @return true if the field has been initialized, false otherwise
	 */
	public boolean isEmpidNameInitialized() {
		return empidNameIsInitialized;
	}

	/**
	 * Getter method for quitdate. <br>
	 * Meta Data Information (in progress):
	 * <ul>
	 * <li>full name: USER_INFO_VIEW.QUITDATE</li>
	 * <li>column size: 8</li>
	 * <li>jdbc type returned by the driver: Types.VARCHAR</li>
	 * </ul>
	 *
	 * @return the value of quitdate
	 */
	public String getQuitdate() {
		return quitdate;
	}

	/**
	 * Setter method for quitdate. <br>
	 * The new value is set only if compareTo() says it is different, or if one
	 * of either the new value or the current value is null. In case the new
	 * value is different, it is set and the field is marked as 'modified'.
	 *
	 * @param newVal
	 *            the new value to be assigned to quitdate
	 */
	public void setQuitdate(String newVal) {
		this.setQuitdate(newVal, false);
	}

	/**
	 * Setter method for quitdate. <br>
	 * The new value is set only if compareTo() says it is different, or if one
	 * of either the new value or the current value is null. In case the new
	 * value is different, it is set and the field is marked as 'modified'.
	 *
	 * @param newVal
	 *            the new value to be assigned to quitdate
	 */
	public void setQuitdate(String newVal, boolean ignoreEmpty) {
		if (ignoreEmpty && StringUtils.isEmpty(newVal)) {
			return;
		}
		if ((newVal != null && quitdate != null && (newVal.compareTo(quitdate) == 0))
				|| (newVal == null && quitdate == null && quitdateIsInitialized)) {
			return;
		}
		quitdate = newVal;
		quitdateIsModified = true;
		quitdateIsInitialized = true;
	}

	/**
	 * Determines if the quitdate has been modified.
	 *
	 * @return true if the field has been modified, false if the field has not
	 *         been modified
	 */
	public boolean isQuitdateModified() {
		return quitdateIsModified;
	}

	/**
	 * Determines if the quitdate has been initialized. <br>
	 * It is useful to determine if a field is null on purpose or just because
	 * it has not been initialized.
	 *
	 * @return true if the field has been initialized, false otherwise
	 */
	public boolean isQuitdateInitialized() {
		return quitdateIsInitialized;
	}

	/**
	 * Getter method for state. <br>
	 * Meta Data Information (in progress):
	 * <ul>
	 * <li>full name: USER_INFO_VIEW.STATE</li>
	 * <li>column size: 1</li>
	 * <li>jdbc type returned by the driver: Types.VARCHAR</li>
	 * </ul>
	 *
	 * @return the value of state
	 */
	public String getState() {
		return state;
	}

	/**
	 * Setter method for state. <br>
	 * The new value is set only if compareTo() says it is different, or if one
	 * of either the new value or the current value is null. In case the new
	 * value is different, it is set and the field is marked as 'modified'.
	 *
	 * @param newVal
	 *            the new value to be assigned to state
	 */
	public void setState(String newVal) {
		this.setState(newVal, false);
	}

	/**
	 * Setter method for state. <br>
	 * The new value is set only if compareTo() says it is different, or if one
	 * of either the new value or the current value is null. In case the new
	 * value is different, it is set and the field is marked as 'modified'.
	 *
	 * @param newVal
	 *            the new value to be assigned to state
	 */
	public void setState(String newVal, boolean ignoreEmpty) {
		if (ignoreEmpty && StringUtils.isEmpty(newVal)) {
			return;
		}
		if ((newVal != null && state != null && (newVal.compareTo(state) == 0))
				|| (newVal == null && state == null && stateIsInitialized)) {
			return;
		}
		state = newVal;
		stateIsModified = true;
		stateIsInitialized = true;
	}

	/**
	 * Determines if the state has been modified.
	 *
	 * @return true if the field has been modified, false if the field has not
	 *         been modified
	 */
	public boolean isStateModified() {
		return stateIsModified;
	}

	/**
	 * Determines if the state has been initialized. <br>
	 * It is useful to determine if a field is null on purpose or just because
	 * it has not been initialized.
	 *
	 * @return true if the field has been initialized, false otherwise
	 */
	public boolean isStateInitialized() {
		return stateIsInitialized;
	}

	/**
	 * Getter method for inadate. <br>
	 * Meta Data Information (in progress):
	 * <ul>
	 * <li>full name: USER_INFO_VIEW.INADATE</li>
	 * <li>column size: 8</li>
	 * <li>jdbc type returned by the driver: Types.VARCHAR</li>
	 * </ul>
	 *
	 * @return the value of inadate
	 */
	public String getInadate() {
		return inadate;
	}

	/**
	 * Setter method for inadate. <br>
	 * The new value is set only if compareTo() says it is different, or if one
	 * of either the new value or the current value is null. In case the new
	 * value is different, it is set and the field is marked as 'modified'.
	 *
	 * @param newVal
	 *            the new value to be assigned to inadate
	 */
	public void setInadate(String newVal) {
		this.setInadate(newVal, false);
	}

	/**
	 * Setter method for inadate. <br>
	 * The new value is set only if compareTo() says it is different, or if one
	 * of either the new value or the current value is null. In case the new
	 * value is different, it is set and the field is marked as 'modified'.
	 *
	 * @param newVal
	 *            the new value to be assigned to inadate
	 */
	public void setInadate(String newVal, boolean ignoreEmpty) {
		if (ignoreEmpty && StringUtils.isEmpty(newVal)) {
			return;
		}
		if ((newVal != null && inadate != null && (newVal.compareTo(inadate) == 0))
				|| (newVal == null && inadate == null && inadateIsInitialized)) {
			return;
		}
		inadate = newVal;
		inadateIsModified = true;
		inadateIsInitialized = true;
	}

	/**
	 * Determines if the inadate has been modified.
	 *
	 * @return true if the field has been modified, false if the field has not
	 *         been modified
	 */
	public boolean isInadateModified() {
		return inadateIsModified;
	}

	/**
	 * Determines if the inadate has been initialized. <br>
	 * It is useful to determine if a field is null on purpose or just because
	 * it has not been initialized.
	 *
	 * @return true if the field has been initialized, false otherwise
	 */
	public boolean isInadateInitialized() {
		return inadateIsInitialized;
	}

	/**
	 * Getter method for agentName. <br>
	 * Meta Data Information (in progress):
	 * <ul>
	 * <li>full name: USER_INFO_VIEW.AGENT_NAME</li>
	 * <li>column size: 50</li>
	 * <li>jdbc type returned by the driver: Types.VARCHAR</li>
	 * </ul>
	 *
	 * @return the value of agentName
	 */
	public String getAgentName() {
		return agentName;
	}

	/**
	 * Setter method for agentName. <br>
	 * The new value is set only if compareTo() says it is different, or if one
	 * of either the new value or the current value is null. In case the new
	 * value is different, it is set and the field is marked as 'modified'.
	 *
	 * @param newVal
	 *            the new value to be assigned to agentName
	 */
	public void setAgentName(String newVal) {
		this.setAgentName(newVal, false);
	}

	/**
	 * Setter method for agentName. <br>
	 * The new value is set only if compareTo() says it is different, or if one
	 * of either the new value or the current value is null. In case the new
	 * value is different, it is set and the field is marked as 'modified'.
	 *
	 * @param newVal
	 *            the new value to be assigned to agentName
	 */
	public void setAgentName(String newVal, boolean ignoreEmpty) {
		if (ignoreEmpty && StringUtils.isEmpty(newVal)) {
			return;
		}
		if ((newVal != null && agentName != null && (newVal
				.compareTo(agentName) == 0))
				|| (newVal == null && agentName == null && agentNameIsInitialized)) {
			return;
		}
		agentName = newVal;
		agentNameIsModified = true;
		agentNameIsInitialized = true;
	}

	/**
	 * Determines if the agentName has been modified.
	 *
	 * @return true if the field has been modified, false if the field has not
	 *         been modified
	 */
	public boolean isAgentNameModified() {
		return agentNameIsModified;
	}

	/**
	 * Determines if the agentName has been initialized. <br>
	 * It is useful to determine if a field is null on purpose or just because
	 * it has not been initialized.
	 *
	 * @return true if the field has been initialized, false otherwise
	 */
	public boolean isAgentNameInitialized() {
		return agentNameIsInitialized;
	}

	/**
	 * Getter method for agent. <br>
	 * Meta Data Information (in progress):
	 * <ul>
	 * <li>full name: USER_INFO_VIEW.AGENT</li>
	 * <li>column size: 20</li>
	 * <li>jdbc type returned by the driver: Types.VARCHAR</li>
	 * </ul>
	 *
	 * @return the value of agent
	 */
	public String getAgent() {
		return agent;
	}

	/**
	 * Setter method for agent. <br>
	 * The new value is set only if compareTo() says it is different, or if one
	 * of either the new value or the current value is null. In case the new
	 * value is different, it is set and the field is marked as 'modified'.
	 *
	 * @param newVal
	 *            the new value to be assigned to agent
	 */
	public void setAgent(String newVal) {
		this.setAgent(newVal, false);
	}

	/**
	 * Setter method for agent. <br>
	 * The new value is set only if compareTo() says it is different, or if one
	 * of either the new value or the current value is null. In case the new
	 * value is different, it is set and the field is marked as 'modified'.
	 *
	 * @param newVal
	 *            the new value to be assigned to agent
	 */
	public void setAgent(String newVal, boolean ignoreEmpty) {
		if (ignoreEmpty && StringUtils.isEmpty(newVal)) {
			return;
		}
		if ((newVal != null && agent != null && (newVal.compareTo(agent) == 0))
				|| (newVal == null && agent == null && agentIsInitialized)) {
			return;
		}
		agent = newVal;
		agentIsModified = true;
		agentIsInitialized = true;
	}

	/**
	 * Determines if the agent has been modified.
	 *
	 * @return true if the field has been modified, false if the field has not
	 *         been modified
	 */
	public boolean isAgentModified() {
		return agentIsModified;
	}

	/**
	 * Determines if the agent has been initialized. <br>
	 * It is useful to determine if a field is null on purpose or just because
	 * it has not been initialized.
	 *
	 * @return true if the field has been initialized, false otherwise
	 */
	public boolean isAgentInitialized() {
		return agentIsInitialized;
	}

	/**
	 * Getter method for bossName. <br>
	 * Meta Data Information (in progress):
	 * <ul>
	 * <li>full name: USER_INFO_VIEW.BOSS_NAME</li>
	 * <li>column size: 50</li>
	 * <li>jdbc type returned by the driver: Types.VARCHAR</li>
	 * </ul>
	 *
	 * @return the value of bossName
	 */
	public String getBossName() {
		return bossName;
	}

	/**
	 * Setter method for bossName. <br>
	 * The new value is set only if compareTo() says it is different, or if one
	 * of either the new value or the current value is null. In case the new
	 * value is different, it is set and the field is marked as 'modified'.
	 *
	 * @param newVal
	 *            the new value to be assigned to bossName
	 */
	public void setBossName(String newVal) {
		this.setBossName(newVal, false);
	}

	/**
	 * Setter method for bossName. <br>
	 * The new value is set only if compareTo() says it is different, or if one
	 * of either the new value or the current value is null. In case the new
	 * value is different, it is set and the field is marked as 'modified'.
	 *
	 * @param newVal
	 *            the new value to be assigned to bossName
	 */
	public void setBossName(String newVal, boolean ignoreEmpty) {
		if (ignoreEmpty && StringUtils.isEmpty(newVal)) {
			return;
		}
		if ((newVal != null && bossName != null && (newVal.compareTo(bossName) == 0))
				|| (newVal == null && bossName == null && bossNameIsInitialized)) {
			return;
		}
		bossName = newVal;
		bossNameIsModified = true;
		bossNameIsInitialized = true;
	}

	/**
	 * Determines if the bossName has been modified.
	 *
	 * @return true if the field has been modified, false if the field has not
	 *         been modified
	 */
	public boolean isBossNameModified() {
		return bossNameIsModified;
	}

	/**
	 * Determines if the bossName has been initialized. <br>
	 * It is useful to determine if a field is null on purpose or just because
	 * it has not been initialized.
	 *
	 * @return true if the field has been initialized, false otherwise
	 */
	public boolean isBossNameInitialized() {
		return bossNameIsInitialized;
	}

	/**
	 * Getter method for posName. <br>
	 * Meta Data Information (in progress):
	 * <ul>
	 * <li>full name: USER_INFO_VIEW.POS_NAME</li>
	 * <li>column size: 40</li>
	 * <li>jdbc type returned by the driver: Types.VARCHAR</li>
	 * </ul>
	 *
	 * @return the value of posName
	 */
	public String getPosName() {
		return posName;
	}

	/**
	 * Setter method for posName. <br>
	 * The new value is set only if compareTo() says it is different, or if one
	 * of either the new value or the current value is null. In case the new
	 * value is different, it is set and the field is marked as 'modified'.
	 *
	 * @param newVal
	 *            the new value to be assigned to posName
	 */
	public void setPosName(String newVal) {
		this.setPosName(newVal, false);
	}

	/**
	 * Setter method for posName. <br>
	 * The new value is set only if compareTo() says it is different, or if one
	 * of either the new value or the current value is null. In case the new
	 * value is different, it is set and the field is marked as 'modified'.
	 *
	 * @param newVal
	 *            the new value to be assigned to posName
	 */
	public void setPosName(String newVal, boolean ignoreEmpty) {
		if (ignoreEmpty && StringUtils.isEmpty(newVal)) {
			return;
		}
		if ((newVal != null && posName != null && (newVal.compareTo(posName) == 0))
				|| (newVal == null && posName == null && posNameIsInitialized)) {
			return;
		}
		posName = newVal;
		posNameIsModified = true;
		posNameIsInitialized = true;
	}

	/**
	 * Determines if the posName has been modified.
	 *
	 * @return true if the field has been modified, false if the field has not
	 *         been modified
	 */
	public boolean isPosNameModified() {
		return posNameIsModified;
	}

	/**
	 * Determines if the posName has been initialized. <br>
	 * It is useful to determine if a field is null on purpose or just because
	 * it has not been initialized.
	 *
	 * @return true if the field has been initialized, false otherwise
	 */
	public boolean isPosNameInitialized() {
		return posNameIsInitialized;
	}

	/**
	 * Getter method for possie. <br>
	 * Meta Data Information (in progress):
	 * <ul>
	 * <li>full name: USER_INFO_VIEW.POSSIE</li>
	 * <li>column size: 10</li>
	 * <li>jdbc type returned by the driver: Types.VARCHAR</li>
	 * </ul>
	 *
	 * @return the value of possie
	 */
	public String getPossie() {
		return possie;
	}

	/**
	 * Setter method for possie. <br>
	 * The new value is set only if compareTo() says it is different, or if one
	 * of either the new value or the current value is null. In case the new
	 * value is different, it is set and the field is marked as 'modified'.
	 *
	 * @param newVal
	 *            the new value to be assigned to possie
	 */
	public void setPossie(String newVal) {
		this.setPossie(newVal, false);
	}

	/**
	 * Setter method for possie. <br>
	 * The new value is set only if compareTo() says it is different, or if one
	 * of either the new value or the current value is null. In case the new
	 * value is different, it is set and the field is marked as 'modified'.
	 *
	 * @param newVal
	 *            the new value to be assigned to possie
	 */
	public void setPossie(String newVal, boolean ignoreEmpty) {
		if (ignoreEmpty && StringUtils.isEmpty(newVal)) {
			return;
		}
		if ((newVal != null && possie != null && (newVal.compareTo(possie) == 0))
				|| (newVal == null && possie == null && possieIsInitialized)) {
			return;
		}
		possie = newVal;
		possieIsModified = true;
		possieIsInitialized = true;
	}

	/**
	 * Determines if the possie has been modified.
	 *
	 * @return true if the field has been modified, false if the field has not
	 *         been modified
	 */
	public boolean isPossieModified() {
		return possieIsModified;
	}

	/**
	 * Determines if the possie has been initialized. <br>
	 * It is useful to determine if a field is null on purpose or just because
	 * it has not been initialized.
	 *
	 * @return true if the field has been initialized, false otherwise
	 */
	public boolean isPossieInitialized() {
		return possieIsInitialized;
	}

	/**
	 * Getter method for depType. <br>
	 * Meta Data Information (in progress):
	 * <ul>
	 * <li>full name: USER_INFO_VIEW.DEP_TYPE</li>
	 * <li>column size: 8</li>
	 * <li>jdbc type returned by the driver: Types.VARCHAR</li>
	 * </ul>
	 *
	 * @return the value of depType
	 */
	public String getDepType() {
		return depType;
	}

	/**
	 * Setter method for depType. <br>
	 * The new value is set only if compareTo() says it is different, or if one
	 * of either the new value or the current value is null. In case the new
	 * value is different, it is set and the field is marked as 'modified'.
	 *
	 * @param newVal
	 *            the new value to be assigned to depType
	 */
	public void setDepType(String newVal) {
		this.setDepType(newVal, false);
	}

	/**
	 * Setter method for depType. <br>
	 * The new value is set only if compareTo() says it is different, or if one
	 * of either the new value or the current value is null. In case the new
	 * value is different, it is set and the field is marked as 'modified'.
	 *
	 * @param newVal
	 *            the new value to be assigned to depType
	 */
	public void setDepType(String newVal, boolean ignoreEmpty) {
		if (ignoreEmpty && StringUtils.isEmpty(newVal)) {
			return;
		}
		if ((newVal != null && depType != null && (newVal.compareTo(depType) == 0))
				|| (newVal == null && depType == null && depTypeIsInitialized)) {
			return;
		}
		depType = newVal;
		depTypeIsModified = true;
		depTypeIsInitialized = true;
	}

	/**
	 * Determines if the depType has been modified.
	 *
	 * @return true if the field has been modified, false if the field has not
	 *         been modified
	 */
	public boolean isDepTypeModified() {
		return depTypeIsModified;
	}

	/**
	 * Determines if the depType has been initialized. <br>
	 * It is useful to determine if a field is null on purpose or just because
	 * it has not been initialized.
	 *
	 * @return true if the field has been initialized, false otherwise
	 */
	public boolean isDepTypeInitialized() {
		return depTypeIsInitialized;
	}

	/**
	 * Getter method for parentNo. <br>
	 * Meta Data Information (in progress):
	 * <ul>
	 * <li>full name: USER_INFO_VIEW.PARENT_NO</li>
	 * <li>column size: 10</li>
	 * <li>jdbc type returned by the driver: Types.INTEGER</li>
	 * </ul>
	 *
	 * @return the value of parentNo
	 */
	public Integer getParentNo() {
		return parentNo;
	}

	/**
	 * Setter method for parentNo. <br>
	 * The new value is set only if compareTo() says it is different, or if one
	 * of either the new value or the current value is null. In case the new
	 * value is different, it is set and the field is marked as 'modified'.
	 *
	 * @param newVal
	 *            the new value to be assigned to parentNo
	 */
	public void setParentNo(Integer newVal) {
		this.setParentNo(newVal, false);
	}

	/**
	 * Setter method for parentNo. <br>
	 * The new value is set only if compareTo() says it is different, or if one
	 * of either the new value or the current value is null. In case the new
	 * value is different, it is set and the field is marked as 'modified'.
	 *
	 * @param newVal
	 *            the new value to be assigned to parentNo
	 */
	public void setParentNo(Integer newVal, boolean ignoreEmpty) {
		if (ignoreEmpty && newVal == null) {
			return;
		}
		if ((newVal != null && parentNo != null && (newVal.compareTo(parentNo) == 0))
				|| (newVal == null && parentNo == null && parentNoIsInitialized)) {
			return;
		}
		parentNo = newVal;
		parentNoIsModified = true;
		parentNoIsInitialized = true;
	}

	/**
	 * Setter method for parentNo. <br>
	 * Convenient for those who do not want to deal with Objects for primary
	 * types.
	 *
	 * @param newVal
	 *            the new value to be assigned to parentNo
	 */
	public void setParentNo(int newVal) {
		setParentNo(new Integer(newVal));
	}

	/**
	 * Determines if the parentNo has been modified.
	 *
	 * @return true if the field has been modified, false if the field has not
	 *         been modified
	 */
	public boolean isParentNoModified() {
		return parentNoIsModified;
	}

	/**
	 * Determines if the parentNo has been initialized. <br>
	 * It is useful to determine if a field is null on purpose or just because
	 * it has not been initialized.
	 *
	 * @return true if the field has been initialized, false otherwise
	 */
	public boolean isParentNoInitialized() {
		return parentNoIsInitialized;
	}

	/**
	 * Getter method for depChief. <br>
	 * Meta Data Information (in progress):
	 * <ul>
	 * <li>full name: USER_INFO_VIEW.DEP_CHIEF</li>
	 * <li>column size: 50</li>
	 * <li>jdbc type returned by the driver: Types.VARCHAR</li>
	 * </ul>
	 *
	 * @return the value of depChief
	 */
	public String getDepChief() {
		return depChief;
	}

	/**
	 * Setter method for depChief. <br>
	 * The new value is set only if compareTo() says it is different, or if one
	 * of either the new value or the current value is null. In case the new
	 * value is different, it is set and the field is marked as 'modified'.
	 *
	 * @param newVal
	 *            the new value to be assigned to depChief
	 */
	public void setDepChief(String newVal) {
		this.setDepChief(newVal, false);
	}

	/**
	 * Setter method for depChief. <br>
	 * The new value is set only if compareTo() says it is different, or if one
	 * of either the new value or the current value is null. In case the new
	 * value is different, it is set and the field is marked as 'modified'.
	 *
	 * @param newVal
	 *            the new value to be assigned to depChief
	 */
	public void setDepChief(String newVal, boolean ignoreEmpty) {
		if (ignoreEmpty && StringUtils.isEmpty(newVal)) {
			return;
		}
		if ((newVal != null && depChief != null && (newVal.compareTo(depChief) == 0))
				|| (newVal == null && depChief == null && depChiefIsInitialized)) {
			return;
		}
		depChief = newVal;
		depChiefIsModified = true;
		depChiefIsInitialized = true;
	}

	/**
	 * Determines if the depChief has been modified.
	 *
	 * @return true if the field has been modified, false if the field has not
	 *         been modified
	 */
	public boolean isDepChiefModified() {
		return depChiefIsModified;
	}

	/**
	 * Determines if the depChief has been initialized. <br>
	 * It is useful to determine if a field is null on purpose or just because
	 * it has not been initialized.
	 *
	 * @return true if the field has been initialized, false otherwise
	 */
	public boolean isDepChiefInitialized() {
		return depChiefIsInitialized;
	}

	/**
	 * Getter method for depName. <br>
	 * Meta Data Information (in progress):
	 * <ul>
	 * <li>full name: USER_INFO_VIEW.DEP_NAME</li>
	 * <li>column size: 50</li>
	 * <li>jdbc type returned by the driver: Types.VARCHAR</li>
	 * </ul>
	 *
	 * @return the value of depName
	 */
	public String getDepName() {
		return depName;
	}

	/**
	 * Setter method for depName. <br>
	 * The new value is set only if compareTo() says it is different, or if one
	 * of either the new value or the current value is null. In case the new
	 * value is different, it is set and the field is marked as 'modified'.
	 *
	 * @param newVal
	 *            the new value to be assigned to depName
	 */
	public void setDepName(String newVal) {
		this.setDepName(newVal, false);
	}

	/**
	 * Setter method for depName. <br>
	 * The new value is set only if compareTo() says it is different, or if one
	 * of either the new value or the current value is null. In case the new
	 * value is different, it is set and the field is marked as 'modified'.
	 *
	 * @param newVal
	 *            the new value to be assigned to depName
	 */
	public void setDepName(String newVal, boolean ignoreEmpty) {
		if (ignoreEmpty && StringUtils.isEmpty(newVal)) {
			return;
		}
		if ((newVal != null && depName != null && (newVal.compareTo(depName) == 0))
				|| (newVal == null && depName == null && depNameIsInitialized)) {
			return;
		}
		depName = newVal;
		depNameIsModified = true;
		depNameIsInitialized = true;
	}

	/**
	 * Determines if the depName has been modified.
	 *
	 * @return true if the field has been modified, false if the field has not
	 *         been modified
	 */
	public boolean isDepNameModified() {
		return depNameIsModified;
	}

	/**
	 * Determines if the depName has been initialized. <br>
	 * It is useful to determine if a field is null on purpose or just because
	 * it has not been initialized.
	 *
	 * @return true if the field has been initialized, false otherwise
	 */
	public boolean isDepNameInitialized() {
		return depNameIsInitialized;
	}

	/**
	 * Getter method for depNo. <br>
	 * Meta Data Information (in progress):
	 * <ul>
	 * <li>full name: USER_INFO_VIEW.DEP_NO</li>
	 * <li>column size: 10</li>
	 * <li>jdbc type returned by the driver: Types.INTEGER</li>
	 * </ul>
	 *
	 * @return the value of depNo
	 */
	public Integer getDepNo() {
		return depNo;
	}

	/**
	 * Setter method for depNo. <br>
	 * The new value is set only if compareTo() says it is different, or if one
	 * of either the new value or the current value is null. In case the new
	 * value is different, it is set and the field is marked as 'modified'.
	 *
	 * @param newVal
	 *            the new value to be assigned to depNo
	 */
	public void setDepNo(Integer newVal) {
		this.setDepNo(newVal, false);
	}

	/**
	 * Setter method for depNo. <br>
	 * The new value is set only if compareTo() says it is different, or if one
	 * of either the new value or the current value is null. In case the new
	 * value is different, it is set and the field is marked as 'modified'.
	 *
	 * @param newVal
	 *            the new value to be assigned to depNo
	 */
	public void setDepNo(Integer newVal, boolean ignoreEmpty) {
		if (ignoreEmpty && newVal == null) {
			return;
		}
		if ((newVal != null && depNo != null && (newVal.compareTo(depNo) == 0))
				|| (newVal == null && depNo == null && depNoIsInitialized)) {
			return;
		}
		depNo = newVal;
		depNoIsModified = true;
		depNoIsInitialized = true;
	}

	/**
	 * Setter method for depNo. <br>
	 * Convenient for those who do not want to deal with Objects for primary
	 * types.
	 *
	 * @param newVal
	 *            the new value to be assigned to depNo
	 */
	public void setDepNo(int newVal) {
		setDepNo(new Integer(newVal));
	}

	/**
	 * Determines if the depNo has been modified.
	 *
	 * @return true if the field has been modified, false if the field has not
	 *         been modified
	 */
	public boolean isDepNoModified() {
		return depNoIsModified;
	}

	/**
	 * Determines if the depNo has been initialized. <br>
	 * It is useful to determine if a field is null on purpose or just because
	 * it has not been initialized.
	 *
	 * @return true if the field has been initialized, false otherwise
	 */
	public boolean isDepNoInitialized() {
		return depNoIsInitialized;
	}

	/**
	 * Getter method for email. <br>
	 * Meta Data Information (in progress):
	 * <ul>
	 * <li>full name: USER_INFO_VIEW.EMAIL</li>
	 * <li>column size: 255</li>
	 * <li>jdbc type returned by the driver: Types.VARCHAR</li>
	 * </ul>
	 *
	 * @return the value of email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Setter method for email. <br>
	 * The new value is set only if compareTo() says it is different, or if one
	 * of either the new value or the current value is null. In case the new
	 * value is different, it is set and the field is marked as 'modified'.
	 *
	 * @param newVal
	 *            the new value to be assigned to email
	 */
	public void setEmail(String newVal) {
		this.setEmail(newVal, false);
	}

	/**
	 * Setter method for email. <br>
	 * The new value is set only if compareTo() says it is different, or if one
	 * of either the new value or the current value is null. In case the new
	 * value is different, it is set and the field is marked as 'modified'.
	 *
	 * @param newVal
	 *            the new value to be assigned to email
	 */
	public void setEmail(String newVal, boolean ignoreEmpty) {
		if (ignoreEmpty && StringUtils.isEmpty(newVal)) {
			return;
		}
		if ((newVal != null && email != null && (newVal.compareTo(email) == 0))
				|| (newVal == null && email == null && emailIsInitialized)) {
			return;
		}
		email = newVal;
		emailIsModified = true;
		emailIsInitialized = true;
	}

	/**
	 * Determines if the email has been modified.
	 *
	 * @return true if the field has been modified, false if the field has not
	 *         been modified
	 */
	public boolean isEmailModified() {
		return emailIsModified;
	}

	/**
	 * Determines if the email has been initialized. <br>
	 * It is useful to determine if a field is null on purpose or just because
	 * it has not been initialized.
	 *
	 * @return true if the field has been initialized, false otherwise
	 */
	public boolean isEmailInitialized() {
		return emailIsInitialized;
	}

	/**
	 * Getter method for ext. <br>
	 * Meta Data Information (in progress):
	 * <ul>
	 * <li>full name: USER_INFO_VIEW.EXT</li>
	 * <li>column size: 10</li>
	 * <li>jdbc type returned by the driver: Types.VARCHAR</li>
	 * </ul>
	 *
	 * @return the value of ext
	 */
	public String getExt() {
		return ext;
	}

	/**
	 * Setter method for ext. <br>
	 * The new value is set only if compareTo() says it is different, or if one
	 * of either the new value or the current value is null. In case the new
	 * value is different, it is set and the field is marked as 'modified'.
	 *
	 * @param newVal
	 *            the new value to be assigned to ext
	 */
	public void setExt(String newVal) {
		this.setExt(newVal, false);
	}

	/**
	 * Setter method for ext. <br>
	 * The new value is set only if compareTo() says it is different, or if one
	 * of either the new value or the current value is null. In case the new
	 * value is different, it is set and the field is marked as 'modified'.
	 *
	 * @param newVal
	 *            the new value to be assigned to ext
	 */
	public void setExt(String newVal, boolean ignoreEmpty) {
		if (ignoreEmpty && StringUtils.isEmpty(newVal)) {
			return;
		}
		if ((newVal != null && ext != null && (newVal.compareTo(ext) == 0))
				|| (newVal == null && ext == null && extIsInitialized)) {
			return;
		}
		ext = newVal;
		extIsModified = true;
		extIsInitialized = true;
	}

	/**
	 * Determines if the ext has been modified.
	 *
	 * @return true if the field has been modified, false if the field has not
	 *         been modified
	 */
	public boolean isExtModified() {
		return extIsModified;
	}

	/**
	 * Determines if the ext has been initialized. <br>
	 * It is useful to determine if a field is null on purpose or just because
	 * it has not been initialized.
	 *
	 * @return true if the field has been initialized, false otherwise
	 */
	public boolean isExtInitialized() {
		return extIsInitialized;
	}

	/**
	 * Getter method for hecname. <br>
	 * Meta Data Information (in progress):
	 * <ul>
	 * <li>full name: USER_INFO_VIEW.HECNAME</li>
	 * <li>column size: 50</li>
	 * <li>jdbc type returned by the driver: Types.VARCHAR</li>
	 * </ul>
	 *
	 * @return the value of hecname
	 */
	public String getHecname() {
		return hecname;
	}

	/**
	 * Setter method for hecname. <br>
	 * The new value is set only if compareTo() says it is different, or if one
	 * of either the new value or the current value is null. In case the new
	 * value is different, it is set and the field is marked as 'modified'.
	 *
	 * @param newVal
	 *            the new value to be assigned to hecname
	 */
	public void setHecname(String newVal) {
		this.setHecname(newVal, false);
	}

	/**
	 * Setter method for hecname. <br>
	 * The new value is set only if compareTo() says it is different, or if one
	 * of either the new value or the current value is null. In case the new
	 * value is different, it is set and the field is marked as 'modified'.
	 *
	 * @param newVal
	 *            the new value to be assigned to hecname
	 */
	public void setHecname(String newVal, boolean ignoreEmpty) {
		if (ignoreEmpty && StringUtils.isEmpty(newVal)) {
			return;
		}
		if ((newVal != null && hecname != null && (newVal.compareTo(hecname) == 0))
				|| (newVal == null && hecname == null && hecnameIsInitialized)) {
			return;
		}
		hecname = newVal;
		hecnameIsModified = true;
		hecnameIsInitialized = true;
	}

	/**
	 * Determines if the hecname has been modified.
	 *
	 * @return true if the field has been modified, false if the field has not
	 *         been modified
	 */
	public boolean isHecnameModified() {
		return hecnameIsModified;
	}

	/**
	 * Determines if the hecname has been initialized. <br>
	 * It is useful to determine if a field is null on purpose or just because
	 * it has not been initialized.
	 *
	 * @return true if the field has been initialized, false otherwise
	 */
	public boolean isHecnameInitialized() {
		return hecnameIsInitialized;
	}

	/**
	 * Getter method for deptNo. <br>
	 * Meta Data Information (in progress):
	 * <ul>
	 * <li>full name: USER_INFO_VIEW.DEPT_NO</li>
	 * <li>column size: 7</li>
	 * <li>jdbc type returned by the driver: Types.VARCHAR</li>
	 * </ul>
	 *
	 * @return the value of deptNo
	 */
	public String getDeptNo() {
		return deptNo;
	}

	/**
	 * Setter method for deptNo. <br>
	 * The new value is set only if compareTo() says it is different, or if one
	 * of either the new value or the current value is null. In case the new
	 * value is different, it is set and the field is marked as 'modified'.
	 *
	 * @param newVal
	 *            the new value to be assigned to deptNo
	 */
	public void setDeptNo(String newVal) {
		this.setDeptNo(newVal, false);
	}

	/**
	 * Setter method for deptNo. <br>
	 * The new value is set only if compareTo() says it is different, or if one
	 * of either the new value or the current value is null. In case the new
	 * value is different, it is set and the field is marked as 'modified'.
	 *
	 * @param newVal
	 *            the new value to be assigned to deptNo
	 */
	public void setDeptNo(String newVal, boolean ignoreEmpty) {
		if (ignoreEmpty && StringUtils.isEmpty(newVal)) {
			return;
		}
		if ((newVal != null && deptNo != null && (newVal.compareTo(deptNo) == 0))
				|| (newVal == null && deptNo == null && deptNoIsInitialized)) {
			return;
		}
		deptNo = newVal;
		deptNoIsModified = true;
		deptNoIsInitialized = true;
	}

	/**
	 * Determines if the deptNo has been modified.
	 *
	 * @return true if the field has been modified, false if the field has not
	 *         been modified
	 */
	public boolean isDeptNoModified() {
		return deptNoIsModified;
	}

	/**
	 * Determines if the deptNo has been initialized. <br>
	 * It is useful to determine if a field is null on purpose or just because
	 * it has not been initialized.
	 *
	 * @return true if the field has been initialized, false otherwise
	 */
	public boolean isDeptNoInitialized() {
		return deptNoIsInitialized;
	}

	/**
	 * Getter method for empid. <br>
	 * Meta Data Information (in progress):
	 * <ul>
	 * <li>full name: USER_INFO_VIEW.EMPID</li>
	 * <li>column size: 20</li>
	 * <li>jdbc type returned by the driver: Types.VARCHAR</li>
	 * </ul>
	 *
	 * @return the value of empid
	 */
	public String getEmpid() {
		return empid;
	}

	/**
	 * Setter method for empid. <br>
	 * The new value is set only if compareTo() says it is different, or if one
	 * of either the new value or the current value is null. In case the new
	 * value is different, it is set and the field is marked as 'modified'.
	 *
	 * @param newVal
	 *            the new value to be assigned to empid
	 */
	public void setEmpid(String newVal) {
		this.setEmpid(newVal, false);
	}

	/**
	 * Setter method for empid. <br>
	 * The new value is set only if compareTo() says it is different, or if one
	 * of either the new value or the current value is null. In case the new
	 * value is different, it is set and the field is marked as 'modified'.
	 *
	 * @param newVal
	 *            the new value to be assigned to empid
	 */
	public void setEmpid(String newVal, boolean ignoreEmpty) {
		if (ignoreEmpty && StringUtils.isEmpty(newVal)) {
			return;
		}
		if ((newVal != null && empid != null && (newVal.compareTo(empid) == 0))
				|| (newVal == null && empid == null && empidIsInitialized)) {
			return;
		}
		empid = newVal;
		empidIsModified = true;
		empidIsInitialized = true;
	}

	/**
	 * Determines if the empid has been modified.
	 *
	 * @return true if the field has been modified, false if the field has not
	 *         been modified
	 */
	public boolean isEmpidModified() {
		return empidIsModified;
	}

	/**
	 * Determines if the empid has been initialized. <br>
	 * It is useful to determine if a field is null on purpose or just because
	 * it has not been initialized.
	 *
	 * @return true if the field has been initialized, false otherwise
	 */
	public boolean isEmpidInitialized() {
		return empidIsInitialized;
	}

	/**
	 * Getter method for cpnyid. <br>
	 * Meta Data Information (in progress):
	 * <ul>
	 * <li>full name: USER_INFO_VIEW.CPNYID</li>
	 * <li>column size: 10</li>
	 * <li>jdbc type returned by the driver: Types.VARCHAR</li>
	 * </ul>
	 *
	 * @return the value of cpnyid
	 */
	public String getCpnyid() {
		return cpnyid;
	}

	/**
	 * Setter method for cpnyid. <br>
	 * The new value is set only if compareTo() says it is different, or if one
	 * of either the new value or the current value is null. In case the new
	 * value is different, it is set and the field is marked as 'modified'.
	 *
	 * @param newVal
	 *            the new value to be assigned to cpnyid
	 */
	public void setCpnyid(String newVal) {
		this.setCpnyid(newVal, false);
	}

	/**
	 * Setter method for cpnyid. <br>
	 * The new value is set only if compareTo() says it is different, or if one
	 * of either the new value or the current value is null. In case the new
	 * value is different, it is set and the field is marked as 'modified'.
	 *
	 * @param newVal
	 *            the new value to be assigned to cpnyid
	 */
	public void setCpnyid(String newVal, boolean ignoreEmpty) {
		if (ignoreEmpty && StringUtils.isEmpty(newVal)) {
			return;
		}
		if ((newVal != null && cpnyid != null && (newVal.compareTo(cpnyid) == 0))
				|| (newVal == null && cpnyid == null && cpnyidIsInitialized)) {
			return;
		}
		cpnyid = newVal;
		cpnyidIsModified = true;
		cpnyidIsInitialized = true;
	}

	/**
	 * Determines if the cpnyid has been modified.
	 *
	 * @return true if the field has been modified, false if the field has not
	 *         been modified
	 */
	public boolean isCpnyidModified() {
		return cpnyidIsModified;
	}

	/**
	 * Determines if the cpnyid has been initialized. <br>
	 * It is useful to determine if a field is null on purpose or just because
	 * it has not been initialized.
	 *
	 * @return true if the field has been initialized, false otherwise
	 */
	public boolean isCpnyidInitialized() {
		return cpnyidIsInitialized;
	}

	/**
	 * Determines if the current object is new.
	 *
	 * @return true if the current object is new, false if the object is not new
	 */
	public boolean isNew() {
		return _isNew;
	}

	/**
	 * Specifies to the object if it has been set as new.
	 *
	 * @param isNew
	 *            the boolean value to be assigned to the isNew field
	 */
	public void isNew(boolean isNew) {
		this._isNew = isNew;
	}

	/**
	 * Determines if the object has been modified since the last time this
	 * method was called. <br>
	 * We can also determine if this object has ever been modified since its
	 * creation.
	 *
	 * @return true if the object has been modified, false if the object has not
	 *         been modified
	 */
	public boolean isModified() {
		return empidNameIsModified || quitdateIsModified || stateIsModified
				|| inadateIsModified || agentNameIsModified || agentIsModified
				|| bossNameIsModified || posNameIsModified || possieIsModified
				|| depTypeIsModified || parentNoIsModified
				|| depChiefIsModified || depNameIsModified || depNoIsModified
				|| emailIsModified || extIsModified || hecnameIsModified
				|| deptNoIsModified || empidIsModified || cpnyidIsModified;
	}

	/**
	 * Resets the object modification status to 'not modified'.
	 */
	public void resetIsModified() {
		empidNameIsModified = false;
		quitdateIsModified = false;
		stateIsModified = false;
		inadateIsModified = false;
		agentNameIsModified = false;
		agentIsModified = false;
		bossNameIsModified = false;
		posNameIsModified = false;
		possieIsModified = false;
		depTypeIsModified = false;
		parentNoIsModified = false;
		depChiefIsModified = false;
		depNameIsModified = false;
		depNoIsModified = false;
		emailIsModified = false;
		extIsModified = false;
		hecnameIsModified = false;
		deptNoIsModified = false;
		empidIsModified = false;
		cpnyidIsModified = false;
	}

	/**
	 * Copies the passed bean into the current bean.
	 *
	 * @param bean
	 *            the bean to copy into the current bean
	 */
	public void copy(UserInfoViewBean bean) {
		setEmpidName(bean.getEmpidName());
		setQuitdate(bean.getQuitdate());
		setState(bean.getState());
		setInadate(bean.getInadate());
		setAgentName(bean.getAgentName());
		setAgent(bean.getAgent());
		setBossName(bean.getBossName());
		setPosName(bean.getPosName());
		setPossie(bean.getPossie());
		setDepType(bean.getDepType());
		setParentNo(bean.getParentNo());
		setDepChief(bean.getDepChief());
		setDepName(bean.getDepName());
		setDepNo(bean.getDepNo());
		setEmail(bean.getEmail());
		setExt(bean.getExt());
		setHecname(bean.getHecname());
		setDeptNo(bean.getDeptNo());
		setEmpid(bean.getEmpid());
		setCpnyid(bean.getCpnyid());
	}

	/**
	 * return a dictionnary of the object
	 */
	public Map<String, String> getDictionnary() {
		Map<String, String> dictionnary = new HashMap<String, String>();
		dictionnary.put("empid_name", getEmpidName() == null ? ""
				: getEmpidName().toString());
		dictionnary.put("quitdate", getQuitdate() == null ? "" : getQuitdate()
				.toString());
		dictionnary.put("state", getState() == null ? "" : getState()
				.toString());
		dictionnary.put("inadate", getInadate() == null ? "" : getInadate()
				.toString());
		dictionnary.put("agent_name", getAgentName() == null ? ""
				: getAgentName().toString());
		dictionnary.put("agent", getAgent() == null ? "" : getAgent()
				.toString());
		dictionnary.put("boss_name", getBossName() == null ? "" : getBossName()
				.toString());
		dictionnary.put("pos_name", getPosName() == null ? "" : getPosName()
				.toString());
		dictionnary.put("possie", getPossie() == null ? "" : getPossie()
				.toString());
		dictionnary.put("dep_type", getDepType() == null ? "" : getDepType()
				.toString());
		dictionnary.put("parent_no", getParentNo() == null ? "" : getParentNo()
				.toString());
		dictionnary.put("dep_chief", getDepChief() == null ? "" : getDepChief()
				.toString());
		dictionnary.put("dep_name", getDepName() == null ? "" : getDepName()
				.toString());
		dictionnary.put("dep_no", getDepNo() == null ? "" : getDepNo()
				.toString());
		dictionnary.put("email", getEmail() == null ? "" : getEmail()
				.toString());
		dictionnary.put("ext", getExt() == null ? "" : getExt().toString());
		dictionnary.put("hecname", getHecname() == null ? "" : getHecname()
				.toString());
		dictionnary.put("dept_no", getDeptNo() == null ? "" : getDeptNo()
				.toString());
		dictionnary.put("empid", getEmpid() == null ? "" : getEmpid()
				.toString());
		dictionnary.put("cpnyid", getCpnyid() == null ? "" : getCpnyid()
				.toString());
		return dictionnary;
	}

	/**
	 * return a dictionnary of the pk columns no primary key, the regular
	 * dictionnary is returned
	 */
	public Map<String, String> getPkDictionnary() {
		return getDictionnary();
	}

	/**
	 * return a dictionnary of the object
	 */
	public Map<String, String> getUpperCaseDictionnary() {
		Map<String, String> dictionnary = new HashMap<String, String>();
		dictionnary.put("EMPID_NAME", getEmpidName() == null ? ""
				: getEmpidName().toString());
		dictionnary.put("QUITDATE", getQuitdate() == null ? "" : getQuitdate()
				.toString());
		dictionnary.put("STATE", getState() == null ? "" : getState()
				.toString());
		dictionnary.put("INADATE", getInadate() == null ? "" : getInadate()
				.toString());
		dictionnary.put("AGENT_NAME", getAgentName() == null ? ""
				: getAgentName().toString());
		dictionnary.put("AGENT", getAgent() == null ? "" : getAgent()
				.toString());
		dictionnary.put("BOSS_NAME", getBossName() == null ? "" : getBossName()
				.toString());
		dictionnary.put("POS_NAME", getPosName() == null ? "" : getPosName()
				.toString());
		dictionnary.put("POSSIE", getPossie() == null ? "" : getPossie()
				.toString());
		dictionnary.put("DEP_TYPE", getDepType() == null ? "" : getDepType()
				.toString());
		dictionnary.put("PARENT_NO", getParentNo() == null ? "" : getParentNo()
				.toString());
		dictionnary.put("DEP_CHIEF", getDepChief() == null ? "" : getDepChief()
				.toString());
		dictionnary.put("DEP_NAME", getDepName() == null ? "" : getDepName()
				.toString());
		dictionnary.put("DEP_NO", getDepNo() == null ? "" : getDepNo()
				.toString());
		dictionnary.put("EMAIL", getEmail() == null ? "" : getEmail()
				.toString());
		dictionnary.put("EXT", getExt() == null ? "" : getExt().toString());
		dictionnary.put("HECNAME", getHecname() == null ? "" : getHecname()
				.toString());
		dictionnary.put("DEPT_NO", getDeptNo() == null ? "" : getDeptNo()
				.toString());
		dictionnary.put("EMPID", getEmpid() == null ? "" : getEmpid()
				.toString());
		dictionnary.put("CPNYID", getCpnyid() == null ? "" : getCpnyid()
				.toString());
		return dictionnary;
	}

	/**
	 * return a dictionnary of the pk columns no primary key, the regular
	 * dictionnary is returned
	 */
	public Map<String, String> getUpperCasePkDictionnary() {
		return getUpperCaseDictionnary();
	}

	/**
	 * return a the value string representation of the given field
	 */
	public String getValue(String column) {
		if (null == column || "".equals(column)) {
			return "";
		} else if ("EMPID_NAME".equalsIgnoreCase(column)
				|| "empidName".equalsIgnoreCase(column)) {
			return getEmpidName() == null ? "" : getEmpidName().toString();
		} else if ("QUITDATE".equalsIgnoreCase(column)
				|| "quitdate".equalsIgnoreCase(column)) {
			return getQuitdate() == null ? "" : getQuitdate().toString();
		} else if ("STATE".equalsIgnoreCase(column)
				|| "state".equalsIgnoreCase(column)) {
			return getState() == null ? "" : getState().toString();
		} else if ("INADATE".equalsIgnoreCase(column)
				|| "inadate".equalsIgnoreCase(column)) {
			return getInadate() == null ? "" : getInadate().toString();
		} else if ("AGENT_NAME".equalsIgnoreCase(column)
				|| "agentName".equalsIgnoreCase(column)) {
			return getAgentName() == null ? "" : getAgentName().toString();
		} else if ("AGENT".equalsIgnoreCase(column)
				|| "agent".equalsIgnoreCase(column)) {
			return getAgent() == null ? "" : getAgent().toString();
		} else if ("BOSS_NAME".equalsIgnoreCase(column)
				|| "bossName".equalsIgnoreCase(column)) {
			return getBossName() == null ? "" : getBossName().toString();
		} else if ("POS_NAME".equalsIgnoreCase(column)
				|| "posName".equalsIgnoreCase(column)) {
			return getPosName() == null ? "" : getPosName().toString();
		} else if ("POSSIE".equalsIgnoreCase(column)
				|| "possie".equalsIgnoreCase(column)) {
			return getPossie() == null ? "" : getPossie().toString();
		} else if ("DEP_TYPE".equalsIgnoreCase(column)
				|| "depType".equalsIgnoreCase(column)) {
			return getDepType() == null ? "" : getDepType().toString();
		} else if ("PARENT_NO".equalsIgnoreCase(column)
				|| "parentNo".equalsIgnoreCase(column)) {
			return getParentNo() == null ? "" : getParentNo().toString();
		} else if ("DEP_CHIEF".equalsIgnoreCase(column)
				|| "depChief".equalsIgnoreCase(column)) {
			return getDepChief() == null ? "" : getDepChief().toString();
		} else if ("DEP_NAME".equalsIgnoreCase(column)
				|| "depName".equalsIgnoreCase(column)) {
			return getDepName() == null ? "" : getDepName().toString();
		} else if ("DEP_NO".equalsIgnoreCase(column)
				|| "depNo".equalsIgnoreCase(column)) {
			return getDepNo() == null ? "" : getDepNo().toString();
		} else if ("EMAIL".equalsIgnoreCase(column)
				|| "email".equalsIgnoreCase(column)) {
			return getEmail() == null ? "" : getEmail().toString();
		} else if ("EXT".equalsIgnoreCase(column)
				|| "ext".equalsIgnoreCase(column)) {
			return getExt() == null ? "" : getExt().toString();
		} else if ("HECNAME".equalsIgnoreCase(column)
				|| "hecname".equalsIgnoreCase(column)) {
			return getHecname() == null ? "" : getHecname().toString();
		} else if ("DEPT_NO".equalsIgnoreCase(column)
				|| "deptNo".equalsIgnoreCase(column)) {
			return getDeptNo() == null ? "" : getDeptNo().toString();
		} else if ("EMPID".equalsIgnoreCase(column)
				|| "empid".equalsIgnoreCase(column)) {
			return getEmpid() == null ? "" : getEmpid().toString();
		} else if ("CPNYID".equalsIgnoreCase(column)
				|| "cpnyid".equalsIgnoreCase(column)) {
			return getCpnyid() == null ? "" : getCpnyid().toString();
		}
		return "";
	}

	/**
	 * @see java.lang.Object#equals(Object)
	 */
	public boolean equals(Object object) {
		if (!(object instanceof UserInfoViewBean)) {
			return false;
		}

		UserInfoViewBean obj = (UserInfoViewBean) object;
		return new EqualsBuilder().append(getEmpidName(), obj.getEmpidName())
				.append(getQuitdate(), obj.getQuitdate())
				.append(getState(), obj.getState())
				.append(getInadate(), obj.getInadate())
				.append(getAgentName(), obj.getAgentName())
				.append(getAgent(), obj.getAgent())
				.append(getBossName(), obj.getBossName())
				.append(getPosName(), obj.getPosName())
				.append(getPossie(), obj.getPossie())
				.append(getDepType(), obj.getDepType())
				.append(getParentNo(), obj.getParentNo())
				.append(getDepChief(), obj.getDepChief())
				.append(getDepName(), obj.getDepName())
				.append(getDepNo(), obj.getDepNo())
				.append(getEmail(), obj.getEmail())
				.append(getExt(), obj.getExt())
				.append(getHecname(), obj.getHecname())
				.append(getDeptNo(), obj.getDeptNo())
				.append(getEmpid(), obj.getEmpid())
				.append(getCpnyid(), obj.getCpnyid()).isEquals();
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		return new HashCodeBuilder(-82280557, -700257973)
				.append(getEmpidName()).append(getQuitdate())
				.append(getState()).append(getInadate()).append(getAgentName())
				.append(getAgent()).append(getBossName()).append(getPosName())
				.append(getPossie()).append(getDepType()).append(getParentNo())
				.append(getDepChief()).append(getDepName()).append(getDepNo())
				.append(getEmail()).append(getExt()).append(getHecname())
				.append(getDeptNo()).append(getEmpid()).append(getCpnyid())
				.toHashCode();
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return toString(ToStringStyle.MULTI_LINE_STYLE);
	}

	/**
	 * you can use the following styles: <li>ToStringStyle.DEFAULT_STYLE</li>
	 * <li>ToStringStyle.MULTI_LINE_STYLE</li> <li>
	 * ToStringStyle.NO_FIELD_NAMES_STYLE</li> <li>
	 * ToStringStyle.SHORT_PREFIX_STYLE</li> <li>ToStringStyle.SIMPLE_STYLE</li>
	 */
	public String toString(ToStringStyle style) {
		return new ToStringBuilder(this, style)
				.append("EMPID_NAME", getEmpidName())
				.append("QUITDATE", getQuitdate()).append("STATE", getState())
				.append("INADATE", getInadate())
				.append("AGENT_NAME", getAgentName())
				.append("AGENT", getAgent()).append("BOSS_NAME", getBossName())
				.append("POS_NAME", getPosName()).append("POSSIE", getPossie())
				.append("DEP_TYPE", getDepType())
				.append("PARENT_NO", getParentNo())
				.append("DEP_CHIEF", getDepChief())
				.append("DEP_NAME", getDepName()).append("DEP_NO", getDepNo())
				.append("EMAIL", getEmail()).append("EXT", getExt())
				.append("HECNAME", getHecname()).append("DEPT_NO", getDeptNo())
				.append("EMPID", getEmpid()).append("CPNYID", getCpnyid())
				.toString();
	}

	public int compareTo(Object object) {
		UserInfoViewBean obj = (UserInfoViewBean) object;
		return new CompareToBuilder()
				.append(getEmpidName(), obj.getEmpidName())
				.append(getQuitdate(), obj.getQuitdate())
				.append(getState(), obj.getState())
				.append(getInadate(), obj.getInadate())
				.append(getAgentName(), obj.getAgentName())
				.append(getAgent(), obj.getAgent())
				.append(getBossName(), obj.getBossName())
				.append(getPosName(), obj.getPosName())
				.append(getPossie(), obj.getPossie())
				.append(getDepType(), obj.getDepType())
				.append(getParentNo(), obj.getParentNo())
				.append(getDepChief(), obj.getDepChief())
				.append(getDepName(), obj.getDepName())
				.append(getDepNo(), obj.getDepNo())
				.append(getEmail(), obj.getEmail())
				.append(getExt(), obj.getExt())
				.append(getHecname(), obj.getHecname())
				.append(getDeptNo(), obj.getDeptNo())
				.append(getEmpid(), obj.getEmpid())
				.append(getCpnyid(), obj.getCpnyid()).toComparison();
	}
}
