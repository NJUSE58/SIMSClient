package SIMSclient.src.bussinesslogicservice.accountblservice;

import java.util.ArrayList;

import SIMSclient.src.dataenum.ResultMessage;
import SIMSclient.src.dataenum.findtype.FindAccountType;
import SIMSclient.src.vo.AccountVO;
import SIMSclient.src.vo.makefinancialdoc.FinancialDocVO;


/**
 *
 * @author 王灿灿
 * @version 2017-12-1
 *
 */
public interface AccountBLService {
	
	/**
	 * @param message 用户查找时输入的keywords
	 * @param findType 选择的查找类型
	 * @return 账户list
	 */
	public ArrayList<AccountVO> find(String message,FindAccountType findType);

	/**
	 * @param id 账户id
	 * @param name 账户名称
	 * @param money 账户余额
	 */
	public ResultMessage newBuild(String id,String name,String money);
		
	/**
	 * @param accountVOs为待保存的账户列表
	 */
	public ResultMessage saveChange(ArrayList<AccountVO> accountVOs);

	/**
	 * @param 
	 */
	public ResultMessage judgeLegal(AccountVO accountVO);

	public ArrayList<AccountVO> getAccountList();  //改了一下接口，返回一个账户list
	
	public ResultMessage enterItem(FinancialDocVO financialDocVO); //收款单、付款单 入账


}
