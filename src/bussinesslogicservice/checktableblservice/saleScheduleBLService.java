package bussinesslogicservice.checktableblservice;

import vo.table.SaleScheduleVO;

public interface saleScheduleBLService {
	
	public void viewReport(SaleScheduleVO saleScheduleVO);
	
	public void exportReport();
	
}
