package dataenum;

public enum Warehouse {

	WAREHOUSE1("�ֿ�1"),
	WAREHOUSE2("�ֿ�2");

	public final String value;

	Warehouse(String value) {
		this.value = value;
	}

	public static Warehouse getWarehouse(String value){
		return value == "�ֿ�1"?WAREHOUSE1:WAREHOUSE2;
	}

}
