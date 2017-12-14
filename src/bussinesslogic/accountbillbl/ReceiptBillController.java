package bussinesslogic.accountbillbl;

import bussinesslogicservice.accountbillblservice.ReceiptBillBLService;
import dataenum.ResultMessage;
import vo.FinancialBill.ReceiptBillVO;

public class ReceiptBillController implements ReceiptBillBLService{

	ReceiptBillBL receiptBillBL=new ReceiptBillBL();

	@Override
	public ResultMessage save(ReceiptBillVO receiptBillVO) {
		return receiptBillBL.save(receiptBillVO);
	}

	@Override
	public ResultMessage delete(ReceiptBillVO receiptBillVO) {
		return receiptBillBL.delete(receiptBillVO);
	}

	@Override
	public ReceiptBillVO find() {
		return receiptBillBL.find();
	}

	@Override
	public ResultMessage getAccountList() {
		return receiptBillBL.getAccountList();
	}

	@Override
	public ResultMessage getCustomerList() {
		return receiptBillBL.getCustomerList();
	}

	@Override
	public ResultMessage judgeLegal(String money) {
		return receiptBillBL.judgeLegal(money);
	}

	@Override
	public ResultMessage commit(ReceiptBillVO receiptBillVO) {
		return receiptBillBL.commit(receiptBillVO);
	}
	
	
}
