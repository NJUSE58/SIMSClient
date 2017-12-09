package SIMSclient.src.data_stub;

import java.rmi.RemoteException;

import SIMSclient.src.po.PersistObject;
import SIMSclient.src.po.commodity.CommodityPO;

public class CommodityDataService_Stub {
	public void insert(CommodityPO po) throws RemoteException{
		System.out.println("Insert Success.");
	}
	public void delete(CommodityPO po)throws RemoteException{
		System.out.println("Delete Success.");
	}
	public void update(CommodityPO po)throws RemoteException{
		System.out.println("Update Success.");
	}
	public void find(CommodityPO po)throws RemoteException{
		System.out.println("Find Success.");
	}
	public void init()throws RemoteException{
		System.out.println("Init Success.");
	}
	public void finish()throws RemoteException{
		System.out.println("Finish Success.");
	}
	public void giftInventoryReceiptsMaking(PersistObject po){
		System.out.println("Making Success.");
	}
	public void lossAndRevenueInventoryReceiptsMaking(PersistObject po){
		System.out.println("Making Success.");
	}
	public void warningInventoryReceiptsMaking(PersistObject po){
		System.out.println("Making Success.");
	}
}
