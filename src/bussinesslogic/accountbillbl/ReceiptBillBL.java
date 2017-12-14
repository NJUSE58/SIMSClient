package bussinesslogic.accountbillbl;

import bussinesslogicservice.accountbillblservice.ReceiptBillBLService;
import dataenum.ResultMessage;
import vo.FinancialBill.ReceiptBillVO;

public class ReceiptBillBL implements ReceiptBillBLService{

	private static ReceiptBillBL skdController = new ReceiptBillBL();
	public static ReceiptBillBL getInstance(){
		return skdController;
	}

	public ReceiptBillBLService getSKDBLService(){
		return (ReceiptBillBLService)skdController;
	}

	@Override
	public ResultMessage save(ReceiptBillVO receiptBillVO) {
		return null;
	}

	@Override
	public ResultMessage delete(ReceiptBillVO receiptBillVO) {
		return null;
	}

	@Override
	public ReceiptBillVO find() {
		return null;
	}

	@Override
	public ResultMessage getAccountList() {
		return null;
	}

	@Override
	public ResultMessage getCustomerList() {
		return null;
	}

	@Override
	public ResultMessage judgeLegal(String money) {
		return null;
	}

	@Override
	public ResultMessage commit(ReceiptBillVO receiptBillVO) {
		return null;
	}

	

}
