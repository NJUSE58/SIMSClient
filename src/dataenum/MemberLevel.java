package dataenum;

public enum MemberLevel {

	LEVEL1("一级"),
	LEVEL2("二级"),
	LEVEL3("三级"),
	LEVEL4("四级"),
	LEVEL5("五级");

	public final String value;

	MemberLevel(String value) {
		this.value = value;
	}

	public static MemberLevel getLevel(String value){
		switch(value){
		case "一级":return LEVEL1;
		case "二级":return LEVEL2;
		case "三级":return LEVEL3;
		case "四级":return LEVEL4;
		default:return LEVEL5;
		}
	}
}