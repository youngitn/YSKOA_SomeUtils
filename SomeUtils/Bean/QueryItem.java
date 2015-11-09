package SomeUtils.Bean;


import java.io.Serializable;

public class QueryItem implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -67545244671344280L;
	private String fieldName ="";
	private String chineseName = "";
	public QueryItem(String fieldName, String chineseName) {
		super();
		this.fieldName = fieldName;
		this.chineseName = chineseName;
	}
	
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public String getChineseName() {
		return chineseName;
	}
	public void setChineseName(String chineseName) {
		this.chineseName = chineseName;
	}
	
}
