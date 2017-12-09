package SIMSclient.src.bussinesslogicservice.checktableblservice;

import SIMSclient.src.vo.ValueObject;
import SIMSclient.src.vo.makefinancialdoc.FinancialDocVO;
import SIMSclient.src.vo.table.BusinessHistoryScheduleVO;

public interface businessHistoryScheduleBLService {

	public FinancialDocVO viewReport(BusinessHistoryScheduleVO businessHistoryScheduleVO);

	public void exportReport();

	public void writeOff();//ºì³å

	public void writeOffAndCopy(ValueObject billVO);//ºì³å²¢¸´ÖÆ

}
