package bussinesslogicservice.accountbookblservice;

import dataenum.ResultMessage;
import vo.AccountBookVO;

public interface AccountBookBLService {
	
	public ResultMessage newBuild(AccountBookVO accountBookVO);//ÐÂ½¨
	
	public ResultMessage delete(AccountBookVO accountBookVO);//É¾³ý
	
	public AccountBookVO find();
	
}
