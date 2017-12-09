package SIMSclient.src.dataservice.accountdataservice;

import java.rmi.RemoteException;
import java.util.ArrayList;

import SIMSclient.src.dataenum.ResultMessage;
import SIMSclient.src.dataenum.findtype.FindAccountType;
import SIMSclient.src.dataservice.CommonDataService;
import SIMSclient.src.po.AccountPO;
import SIMSclient.src.po.PersistObject;

/**
 * 
 * @author 王灿灿
 * @version 2017-12-1
 */
/**
 * 
* @ClassName: AccountDataService 
* @author lijie
* @date 2017年12月3日 上午10:03:44 
*
 */
public interface AccountDataService extends CommonDataService<AccountPO>{
	
	public static final String NAME = "AccountData";
	public ArrayList<AccountPO> find(String keywords, FindAccountType type) throws RemoteException;
	public ArrayList<AccountPO> getAccountList();
	public ResultMessage enterItem(ArrayList<String> idList, ArrayList<String> moneyList);
	public ResultMessage newBuild(PersistObject po);
	public ResultMessage saveChange(ArrayList<PersistObject> persistObjects);
}
