package SIMSclient.src.po.makefinancialdoc;

import java.util.ArrayList;
import java.util.Date;

import SIMSclient.src.dataenum.BillState;
import SIMSclient.src.dataenum.BillType;
import SIMSclient.src.vo.makefinancialdoc.AccountListVO;

/**
 * 
 * @author Íõ²Ó²Ó
 *@version 2017-12-2
 *
 */
public class PaymentBillPO extends FinancialDocPO {
	private static final long serialVersionUID = 1L;
	private String total;//×ªÕË×Ü¶î	
	private AccountListPO accountListPO;
	
	public PaymentBillPO (String docID,String userID,ArrayList<String> accountName,ArrayList<String> money,String customerID,
			ArrayList<String> note,String total,BillType billType,BillState billState){
		super(docID,userID,accountName,money,customerID,note,billType,billState);
		accountListPO=new AccountListPO(accountName, money, note);
		this.total=total;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public AccountListPO getAccountListPO() {
		return accountListPO;
	}

	public void setAccountListPO(AccountListPO accountListPO) {
		this.accountListPO = accountListPO;
	}


}
