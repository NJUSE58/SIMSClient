package bussinesslogic.purchasebl;
/**     
*  
* @author Lijie 
* @date 2017Äê12ÔÂ1ÈÕ    
*/

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import dataenum.BillType;
import dataservice.purchasedataservice.PurchaseDataService;
import po.PurchasePO;

public class Purchase {

	private String id;
	private PurchaseDataService purchaseData;
	private PurchasePO po;
	private BillType type;
	private PurchaseList list;
	
	public Purchase() {
		this.list = new PurchaseList();
		purchaseData = getPurchaseData();
	}
	
	public PurchaseDataService getPurchaseData() {
		try {
			return (PurchaseDataService)Naming.lookup(PurchaseDataService.NAME);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
