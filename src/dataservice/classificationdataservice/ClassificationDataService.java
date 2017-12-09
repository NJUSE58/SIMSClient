package SIMSclient.src.dataservice.classificationdataservice;

import java.rmi.RemoteException;

import SIMSclient.src.dataservice.CommonDataService;
import SIMSclient.src.po.ClassificationPO;



public interface ClassificationDataService extends CommonDataService<ClassificationPO> {

	public static final String NAME = "ClassificationData";
	
	public String getID(String fatherID) throws RemoteException;
}
