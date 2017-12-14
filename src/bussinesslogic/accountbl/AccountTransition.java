package bussinesslogic.accountbl;

import po.AccountPO;
import vo.AccountVO;

public class AccountTransition {
		
	public AccountPO VOtoPO(AccountVO accountVO){
		String id=accountVO.getId();
		String name=accountVO.getName();
		Double money=Double.valueOf(accountVO.getMoney());
		
		AccountPO accountPO=new AccountPO(id, name, money);
		return accountPO;
	}
	
	public AccountVO POtoVO(AccountPO accountPO){
		String id=accountPO.getId();
		String name=accountPO.getName();
		String money=Double.toString(accountPO.getMoney());
		
		AccountVO accountVO=new AccountVO(id, name, money);
		return accountVO;
	}
}
