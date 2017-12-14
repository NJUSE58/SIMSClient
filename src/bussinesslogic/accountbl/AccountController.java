package bussinesslogic.accountbl;

import java.util.ArrayList;

import bussinesslogicservice.accountblservice.AccountBLService;
import dataenum.BillType;
import dataenum.ResultMessage;
import dataenum.findtype.FindAccountType;
import vo.AccountVO;
import vo.FinancialBill.FinancialDocVO;

/**
 *
 * @author Íõ²Ó²Ó
 * @version 2017-12-2
 *
 * AccountBLÄ£¿éµÄcontroller
 *
 */
public class AccountController implements AccountBLService{

	AccountBL accountBL=new AccountBL();
	
	@Override
	public ArrayList<AccountVO> find(String message, FindAccountType findType) {
		return accountBL.find(message, findType);
	}
	@Override
	public ResultMessage newBuild(String id, String name, String money) {
		return accountBL.newBuild(id, name, money);
	}
	@Override
	public ResultMessage saveChange(ArrayList<AccountVO> accountVOs) {
		return accountBL.saveChange(accountVOs);
	}
	@Override
	public ResultMessage judgeLegal(AccountVO accountVO) {
		return accountBL.judgeLegal(accountVO);
	}
	@Override
	public ArrayList<AccountVO> getAccountList() {
		return accountBL.getAccountList();
	}
	@Override
	public ResultMessage enterItem(FinancialDocVO financialDocVO,BillType billType) {
		return accountBL.enterItem(financialDocVO,billType);
	}

	

}
