package SIMSclient.src.bussinesslogicservice.accountbillblservice;

import SIMSclient.src.dataenum.ResultMessage;
import SIMSclient.src.vo.makefinancialdoc.ReceiptBillVO;

public interface PaymentBillBLService {

	public ResultMessage newBuild(ReceiptBillVO xjfydVO);
	
	public ResultMessage modify(ReceiptBillVO xjfydVO);
	
	public ResultMessage delete(ReceiptBillVO xjfydVO);
	
	public ReceiptBillVO find(String message);
	
	public ResultMessage commit(ReceiptBillVO xjfydVO);
	
}
