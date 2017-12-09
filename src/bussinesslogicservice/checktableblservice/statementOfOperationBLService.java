package SIMSclient.src.bussinesslogicservice.checktableblservice;

import SIMSclient.src.vo.table.StatementOfOperationVO;

public interface statementOfOperationBLService {
	
	public void viewRport(StatementOfOperationVO statementOfOperationVO);

	public void exportReport();
	
}
