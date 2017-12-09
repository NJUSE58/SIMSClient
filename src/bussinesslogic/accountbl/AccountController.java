package SIMSclient.src.bussinesslogic.accountbl;

import java.util.ArrayList;

import SIMSclient.src.bussinesslogicservice.accountblservice.AccountBLService;
import SIMSclient.src.dataenum.ResultMessage;
import SIMSclient.src.dataenum.findtype.FindAccountType;
import SIMSclient.src.vo.AccountVO;
import SIMSclient.src.vo.makefinancialdoc.FinancialDocVO;

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
	AccountVO accountVO;

	@Override
	public ResultMessage enterItem(FinancialDocVO financialDocVO) {
		return accountBL.enterItem(financialDocVO);
	}

	@Override
	public ArrayList<AccountVO> getAccountList() {
        return accountBL.getAccountList();
	}

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

}
