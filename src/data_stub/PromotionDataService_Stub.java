package SIMSclient.src.data_stub;

import java.rmi.RemoteException;

import SIMSclient.src.po.PromotionPO;

public class PromotionDataService_Stub {
	public void getbeforePrice(PromotionPO po) throws RemoteException{
    	System.out.println("getbeforePrice Success.");
    }
	public void getallowance(PromotionPO po) throws RemoteException{
    	System.out.println("getallowance Success.");
    }
	public void getvoucher(PromotionPO po) throws RemoteException{
    	System.out.println("getvoucher Success.");
    }
	public void getafterPrice(PromotionPO po) throws RemoteException{
    	System.out.println("getafterPrice Success.");
    }
}
