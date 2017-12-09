package SIMSclient.src.dataservice.checktabledataservice;

import SIMSclient.src.dataservice.CommonDataService;
import SIMSclient.src.po.table.SaleSchedulePO;


public interface SaleScheduleDataService extends CommonDataService<SaleSchedulePO>{
	public static final String NAME = "SaleScheduleData";
	
	public void viewReport(SaleSchedulePO saleSchedulePO);
	
	public void exportReport();
}