package bussinesslogic.accountbillbl;

import java.util.ArrayList;

import po.FinancialBill.AccountListPO;
import po.FinancialBill.ReceiptBillPO;
import vo.FinancialBill.AccountListVO;
import vo.FinancialBill.ReceiptBillVO;

public class ReceiptBillTransition {
	
	AccountListPO accountListPO;
	AccountListVO accountListVO;
	
	public ReceiptBillPO VOtoPO(ReceiptBillVO receiptBillVO){
		
		accountListPO = new AccountListPO("", "", "");
		
		String total=receiptBillVO.getTotal();
		ArrayList<AccountListVO> accountListVOs=receiptBillVO.getAccountListVOs();
		ArrayList<AccountListPO> accountListPOs=new ArrayList<>();
		for (int i = 0; i < accountListVOs.size(); i++) {
			accountListPO.setAccountID(accountListVOs.get(i).getAccountID());
			accountListPO.setMoney(accountListVOs.get(i).getMoney());
			accountListPO.setNote(accountListVOs.get(i).getNote());
			accountListPOs.add(accountListPO);
		}
		
		ReceiptBillPO receiptBillPO=new ReceiptBillPO(receiptBillVO.getDocID(), receiptBillVO.getUserID(),
				receiptBillVO.getCustomerID(), receiptBillVO.getBillType(), receiptBillVO.getBillState(), accountListPOs, total);
		
		return receiptBillPO;
	}
	
	public ReceiptBillVO POtoVO(ReceiptBillPO receiptBillPO){
		
		accountListVO = new AccountListVO("", "", "");
		
		String total=receiptBillPO.getTotal();
		ArrayList<AccountListPO> accountListPOs=receiptBillPO.getAccountListPOs();
		ArrayList<AccountListVO> accountListVOs=new ArrayList<>();
		for (int i = 0; i < accountListPOs.size(); i++) {
			accountListVO.setAccountID(accountListPOs.get(i).getAccountID());
			accountListVO.setMoney(accountListPOs.get(i).getMoney());
			accountListVO.setNote(accountListPOs.get(i).getNote());
			accountListVOs.add(accountListVO);
		}
		
		ReceiptBillVO receiptBillVO=new ReceiptBillVO(receiptBillPO.getDocID(), receiptBillPO.getUserID(),
				receiptBillPO.getCustomerID(), receiptBillPO.getBillType(), receiptBillPO.getBillState(), accountListVOs, total);
		
		return receiptBillVO;
		
	}
}
