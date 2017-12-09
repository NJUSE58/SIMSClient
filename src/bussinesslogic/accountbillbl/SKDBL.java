package SIMSclient.src.bussinesslogic.accountbillbl;

import SIMSclient.src.bussinesslogicservice.accountbillblservice.ReceiptBillBLService;
import SIMSclient.src.dataenum.ResultMessage;
import SIMSclient.src.vo.makefinancialdoc.PaymentBillVO;

public class SKDBL implements ReceiptBillBLService{

	private static SKDBL skdController = new SKDBL();
	public static SKDBL getInstance(){
		return skdController;
	}

	public ReceiptBillBLService getSKDBLService(){
		return (ReceiptBillBLService)skdController;
	}

	@Override
	public ResultMessage newBuild(PaymentBillVO skdVO) {
		return null;
	}

	@Override
	public ResultMessage modify(PaymentBillVO skdVO) {
		return null;
	}

	@Override
	public ResultMessage delete(PaymentBillVO skdVO) {
		return null;
	}

	@Override
	public PaymentBillVO find(String message) {
		return null;
	}

	@Override
	public ResultMessage commit(PaymentBillVO skdVO) {
		return null;
	}

}
