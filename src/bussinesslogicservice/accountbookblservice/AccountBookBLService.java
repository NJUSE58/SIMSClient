package SIMSclient.src.bussinesslogicservice.accountbookblservice;

import SIMSclient.src.dataenum.ResultMessage;
import SIMSclient.src.vo.AccountBookVO;

public interface AccountBookBLService {
	
	public ResultMessage newBuild(AccountBookVO accountBookVO);//ÐÂ½¨
	
	public ResultMessage delete(AccountBookVO accountBookVO);//É¾³ý
	
	public AccountBookVO find();
	
}
