package bussinesslogicservice.accountbillblservice;

import dataenum.ResultMessage;
import vo.FinancialBill.ReceiptBillVO;

public interface ReceiptBillBLService {
	
	public ResultMessage save(ReceiptBillVO receiptBillVO);//如果没有，就新建，否则修改
	
	public ResultMessage delete(ReceiptBillVO receiptBillVO);
	
	public ReceiptBillVO find();
	
	public ResultMessage getAccountList();
	
	public ResultMessage getCustomerList();
	
	public ResultMessage judgeLegal(String money);
	
	public ResultMessage commit(ReceiptBillVO receiptBillVO);
	
}
