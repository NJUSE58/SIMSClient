package SIMSclient.src.dataservice.accountbilldataservice;

import java.rmi.RemoteException;
import java.util.ArrayList;

import SIMSclient.src.dataenum.BillType;
import SIMSclient.src.dataservice.CommonDataService;
import SIMSclient.src.po.makefinancialdoc.ReceiptBillPO;


/**  
* 类说明   
*  
* @author ****  
* @date 2017年11月12日    
*/
public interface ReceiptDataService extends CommonDataService<ReceiptBillPO>{

	public static final String NAME = "ReceiptBillData";
	
	public ArrayList<ReceiptBillPO> show(BillType type) throws RemoteException;

}
