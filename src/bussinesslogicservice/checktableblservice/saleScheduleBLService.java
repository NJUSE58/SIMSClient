package SIMSclient.src.bussinesslogicservice.checktableblservice;

import SIMSclient.src.vo.table.SaleScheduleVO;

public interface saleScheduleBLService {
	
	public void viewReport(SaleScheduleVO saleScheduleVO);
	
	public void exportReport();
	
}
