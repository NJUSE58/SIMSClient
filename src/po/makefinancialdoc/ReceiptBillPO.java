package SIMSclient.src.po.makefinancialdoc;

import java.util.ArrayList;
import java.util.Date;

import SIMSclient.src.dataenum.BillState;
import SIMSclient.src.dataenum.BillType;

/**
 *
 * @author 王灿灿
 * @version 2017-12-2
 *
 */
@SuppressWarnings("serial")
public class ReceiptBillPO extends FinancialDocPO {
	private static final long serialVersionUID = 1L;
	// 条目清单
	private ArrayList<String> entryName;// 条目名
	private ArrayList<String> transferAmount;// 金额
	
	private EntryListPO entryListPO;

	public ReceiptBillPO(String docID, String userID, ArrayList<String> accountName, ArrayList<String> money, String customerID,
			ArrayList<String> note,ArrayList<String> entryName,ArrayList<String> transferAmount,BillType billType,BillState billState) {
		super(docID,userID,accountName,money,customerID,note,billType,billState);
		entryListPO=new EntryListPO(entryName, transferAmount, note);
	}

	public ArrayList<String> getEntryName() {
		return entryName;
	}

	public void setEntryName(ArrayList<String> entryName) {
		this.entryName = entryName;
	}

	public ArrayList<String> getTransferAmount() {
		return transferAmount;
	}

	public void setTransferAmount(ArrayList<String> transferAmount) {
		this.transferAmount = transferAmount;
	}

	public EntryListPO getEntryListPO() {
		return entryListPO;
	}

	public void setEntryListPO(EntryListPO entryListPO) {
		this.entryListPO = entryListPO;
	}

}
