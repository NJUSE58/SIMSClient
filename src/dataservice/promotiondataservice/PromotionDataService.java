package SIMSclient.src.dataservice.promotiondataservice;

import java.rmi.RemoteException;
import java.util.ArrayList;

import SIMSclient.src.dataenum.PromotionType;
import SIMSclient.src.dataservice.CommonDataService;
import SIMSclient.src.po.PromotionPO;


public interface PromotionDataService extends CommonDataService<PromotionPO>{

	public static final String NAME = "PromotionData";

	public ArrayList<PromotionPO> show(PromotionType type) throws RemoteException;

	
}
