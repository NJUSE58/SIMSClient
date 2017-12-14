package bussinesslogic.accountbillbl;

import bussinesslogicservice.accountbillblservice.PaymentBillBLService;
import dataenum.ResultMessage;
import vo.FinancialBill.PaymentBillVO;

public class PaymentBillController implements PaymentBillBLService{
	
	PaymentBillBL paymentBillBL=new PaymentBillBL();

	@Override
	public ResultMessage save(PaymentBillVO paymentBillVO) {
		return paymentBillBL.save(paymentBillVO);
	}

	@Override
	public ResultMessage delete(PaymentBillVO paymentBillVO) {
		return paymentBillBL.delete(paymentBillVO);
	}

	@Override
	public PaymentBillVO find() {
		return paymentBillBL.find();
	}

	@Override
	public ResultMessage getAccountList() {
		return paymentBillBL.getAccountList();
	}

	@Override
	public ResultMessage getCustomerList() {
		return paymentBillBL.getCustomerList();
	}

	@Override
	public ResultMessage judgeLegal(String money) {
		return paymentBillBL.judgeLegal(money);
	}

	@Override
	public ResultMessage commit(PaymentBillVO paymentBillVO) {
		return paymentBillBL.commit(paymentBillVO);
	}
	
	
}
