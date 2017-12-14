package bussinesslogic.accountbookbl;

import bussinesslogicservice.accountbookblservice.AccountBookBLService;
import dataenum.ResultMessage;
import vo.AccountBookVO;

public class AccountBookController implements AccountBookBLService {
	AccountBookBL accountBookBL = new AccountBookBL();

	@Override
	public ResultMessage newBuild(AccountBookVO accountBookVO) {
		return accountBookBL.newBuild(accountBookVO);
	}

	@Override
	public ResultMessage delete(AccountBookVO accountBookVO) {
		return accountBookBL.delete(accountBookVO);
	}

	@Override
	public AccountBookVO find() {
		return accountBookBL.find();
	}

}
