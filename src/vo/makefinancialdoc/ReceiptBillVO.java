package vo.makefinancialdoc;

import java.util.ArrayList;


import dataenum.BillState;
import dataenum.BillType;

@SuppressWarnings("serial")
public class ReceiptBillVO extends FinancialDocVO {

	// 条目清单
	private ArrayList<AccountListVO> accountListVOs;

	public ReceiptBillVO(String docID, String userID, ArrayList<String> accountName, ArrayList<String> money, String customerID,
			ArrayList<String> note,ArrayList<String> entryName,ArrayList<String> transferAmount,BillType billType,BillState billState) {
		super(docID,userID,customerID,billType,billState);
		accountListVOs=new ArrayList<AccountListVO>();
	}

	public ArrayList<AccountListVO> getAccountListVOs() {
		return accountListVOs;
	}

	public void setAccountListVOs(ArrayList<AccountListVO> accountListVOs) {
		this.accountListVOs = accountListVOs;
	}



}
