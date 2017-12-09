package SIMSclient.src.dataservice.purchasedataservice;

import java.rmi.RemoteException;

import SIMSclient.src.dataservice.CommonDataService;
import SIMSclient.src.po.PurchasePO;

/**  
* 类说明   
*  
* @author ****  
* @date 2017年10月22日    
*/
public interface PurchaseDataService extends CommonDataService<PurchasePO> {

	public static final String NAME = "PurchaseData";
	
	public String getPurchaseID() throws RemoteException;
	
	public String getPurchaseBackID() throws RemoteException;
}
