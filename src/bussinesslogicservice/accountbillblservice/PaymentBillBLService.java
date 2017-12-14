package bussinesslogicservice.accountbillblservice;

import dataenum.ResultMessage;
import vo.FinancialBill.PaymentBillVO;

public interface PaymentBillBLService {

	public ResultMessage save(PaymentBillVO paymentBillVO);//如果没有，就新建，否则修改
	
	public ResultMessage delete(PaymentBillVO paymentBillVO);
	
	public PaymentBillVO find();
	
	public ResultMessage getAccountList();
	
	public ResultMessage getCustomerList();
	
	public ResultMessage judgeLegal(String money);
	
	public ResultMessage commit(PaymentBillVO paymentBillVO);
	
}
