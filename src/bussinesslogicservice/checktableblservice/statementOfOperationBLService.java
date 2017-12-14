package bussinesslogicservice.checktableblservice;

import vo.table.StatementOfOperationVO;

public interface statementOfOperationBLService {
	
	public void viewRport(StatementOfOperationVO statementOfOperationVO);

	public void exportReport();
	
}
