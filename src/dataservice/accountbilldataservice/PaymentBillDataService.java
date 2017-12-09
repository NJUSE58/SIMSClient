package SIMSclient.src.dataservice.accountbilldataservice;

import java.rmi.RemoteException;
import java.util.ArrayList;

import SIMSclient.src.dataenum.BillType;
import SIMSclient.src.dataservice.CommonDataService;
import SIMSclient.src.po.makefinancialdoc.PaymentBillPO;

/**  
* 类说明   
*  
* @author ****  
* @date 2017年11月12日    
*/
public interface PaymentBillDataService extends CommonDataService<PaymentBillPO> {

    public static final String NAME = "PaymentBillData";
	
	public ArrayList<PaymentBillPO> show(BillType type) throws RemoteException;
}
