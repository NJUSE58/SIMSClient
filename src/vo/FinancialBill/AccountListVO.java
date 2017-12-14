package vo.FinancialBill;


public class AccountListVO {

	protected String accountID;//银行账户ID
	protected String money;//转账金额
	protected String note;//备注

	public AccountListVO(String accountID,String money,String note){
		this.accountID=accountID;
		this.money=money;
		this.note=note;
	}

	public String getAccountID() {
		return accountID;
	}

	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}



}
