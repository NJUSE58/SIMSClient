package bussinesslogic.accountbillbl;

import java.util.ArrayList;

import po.FinancialBill.EntryPO;
import po.FinancialBill.PaymentBillPO;
import vo.FinancialBill.EntryVO;
import vo.FinancialBill.PaymentBillVO;

public class PaymentBillTransition {
	
	EntryVO entryVO;
	EntryPO entryPO;
	
	public PaymentBillVO POtoVO(PaymentBillPO paymentBillPO){
		
		entryVO=new EntryVO("", "", "");
		PaymentBillVO paymentBillVO;
		
		String total=paymentBillPO.getTotal();
		String accountID=paymentBillPO.getAccountID();
		ArrayList<EntryPO> entryPOs=paymentBillPO.getEntryListPO();
		ArrayList<EntryVO> entryVOs=new ArrayList<>();
		for (int i = 0; i < entryPOs.size(); i++) {
			entryVO.setEntryName(entryPOs.get(i).getEntryName());
			entryVO.setTransferAmount(entryPOs.get(i).getTransferAmount());
			entryVO.setNote(entryPOs.get(i).getNote());
			entryVOs.add(entryVO);
		}
		
		paymentBillVO=new PaymentBillVO(paymentBillPO.getDocID(), paymentBillPO.getUserID(),paymentBillPO.getCustomerID(), 
				accountID, entryVOs, total, paymentBillPO.getBillType(), paymentBillPO.getBillState());
		
		return paymentBillVO;
	}
	
	public PaymentBillPO VOtoPO(PaymentBillVO paymentBillVO){
		
		entryPO=new EntryPO("","", "");
		PaymentBillPO paymentBillPO;
		
		String total =paymentBillVO.getTotal();
		String accountID=paymentBillVO.getAccountID();
		ArrayList<EntryVO> entryVOs=paymentBillVO.getEntryListVO();
		ArrayList<EntryPO> entryPOs=new ArrayList<>();
		for (int i = 0; i < entryVOs.size(); i++) {
			entryPO.setEntryName(entryVOs.get(i).getEntryName());
			entryPO.setTransferAmount(entryVOs.get(i).getTransferAmount());
			entryPO.setNote(entryVOs.get(i).getNote());
			entryPOs.add(entryPO);
		}
		
		paymentBillPO=new PaymentBillPO(paymentBillVO.getDocID(), paymentBillVO.getUserID(), paymentBillVO.getCustomerID(), 
				accountID, entryPOs, total, paymentBillVO.getBillType(), paymentBillVO.getBillState());
		
		return paymentBillPO;
	}
}
