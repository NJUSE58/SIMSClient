package SIMSclient.src.po.table;

import SIMSclient.src.dataenum.TableType;

public class TableTypePO {

	TableType tableType;

	public TableTypePO(TableType t) {
		tableType = t;
	}

	public TableType getTableType() {
		return tableType;
	}

	public void setTableType(TableType tableType) {
		this.tableType = tableType;
	}

}
