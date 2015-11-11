package SomeUtils.Bean;

import java.io.Serializable;
/**
 * 容器,裝所要查詢的欄位名稱與中文名稱(資料庫欄位名稱,dmaker欄位標題) 
 * @author b0050
 * 
 */
public class QueryItem implements Serializable {
	
	private static final long serialVersionUID = -67545244671344280L;
	private String fieldName = "";
	private String chineseName = "";
	private int searchType;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * 查詢頁面的UI欄位中,想要當作查詢條件的欄位,用此類別裝載後丟進去ArrayList
	 * 配合_hproc.setQueryTable()使用.
	 * @param fieldName 欄位名稱
	 * @param chineseName 中文名稱
	 * @param searchType int 0:該欄位不做為查詢條件 1:一般查詢跳健欄位 2:時間區間查詢欄位
	 */
	public QueryItem(String fieldName, String chineseName, int searchType) {
		super();
		this.fieldName = fieldName;
		this.chineseName = chineseName;
		this.searchType = searchType;
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

	public int getSearchType() {
		return searchType;
	}

	public void setSearchType(int searchType) {
		this.searchType = searchType;
	}
}
