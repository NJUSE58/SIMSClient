package vo.makefinancialdoc;

import java.util.ArrayList;

public class AccountListVO {

	protected String accountName;//银行账户名
	protected String money;//转账金额
	protected String note;//备注

	public AccountListVO(String accountName,String money,String note){
		this.accountName=accountName;
		this.money=money;
		this.note=note;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
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
