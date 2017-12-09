package SIMSclient.src.bussinesslogic.accountbl;

import SIMSclient.src.po.AccountPO;
import SIMSclient.src.vo.AccountVO;

public class AccountTransition {
		
	public AccountPO VOtoPO(AccountVO accountVO){
		String id=accountVO.getId();
		String name=accountVO.getName();
		String money=accountVO.getMoney();
		
		AccountPO accountPO=new AccountPO(id, name, money);
		return accountPO;
	}
	
	public AccountVO POtoVO(AccountPO accountPO){
		String id=accountPO.getID();
		String name=accountPO.getName();
		String money=accountPO.getMoney();
		
		AccountVO accountVO=new AccountVO(id, name, money);
		return accountVO;
	}
}
