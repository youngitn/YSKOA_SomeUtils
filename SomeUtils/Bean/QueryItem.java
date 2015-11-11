package SomeUtils.Bean;

import java.io.Serializable;
/**
 * �e��,�˩ҭn�d�ߪ����W�ٻP����W��(��Ʈw���W��,dmaker�����D) 
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
	 * �d�߭�����UI��줤,�Q�n��@�d�߱������,�Φ����O�˸����i�hArrayList
	 * �t�X_hproc.setQueryTable()�ϥ�.
	 * @param fieldName ���W��
	 * @param chineseName ����W��
	 * @param searchType int 0:����줣�����d�߱��� 1:�@��d�߸������ 2:�ɶ��϶��d�����
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
