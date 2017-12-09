package SIMSclient.src.dataservice.checktabledataservice;

import SIMSclient.src.dataservice.CommonDataService;
import SIMSclient.src.po.PersistObject;
import SIMSclient.src.po.makefinancialdoc.FinancialDocPO;
import SIMSclient.src.po.table.BusinessHistorySchedulePO;

public interface BusinessHistoryScheduleDataService extends CommonDataService<BusinessHistorySchedulePO>{
	public static final String NAME = "BusinessHistoryScheduleData";
	
	public FinancialDocPO viewReport(BusinessHistorySchedulePO businessHistorySchedulePO);
	
	public void exportReport();
	
	public void writeOff();//ºì³å
	
	public void writeOffAndCopy(PersistObject billPO);//ºì³å²¢¸´ÖÆ
}
