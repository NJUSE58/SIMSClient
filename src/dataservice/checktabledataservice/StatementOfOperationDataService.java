package SIMSclient.src.dataservice.checktabledataservice;

import SIMSclient.src.dataservice.CommonDataService;
import SIMSclient.src.po.table.StatementOfOperationPO;

public interface StatementOfOperationDataService extends CommonDataService<StatementOfOperationPO>{
	public static final String NAME = "statementOfOperationData";
	
	public void viewRport(StatementOfOperationPO statementOfOperationPO);

	public void exportReport();
}
