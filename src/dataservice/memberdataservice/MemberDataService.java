package SIMSclient.src.dataservice.memberdataservice;

import java.rmi.RemoteException;
import java.util.ArrayList;

import SIMSclient.src.dataenum.findtype.FindMemberType;
import SIMSclient.src.dataservice.CommonDataService;
import SIMSclient.src.po.MemberPO;


public interface MemberDataService extends CommonDataService<MemberPO>{

	public static final String NAME = "MemberData";  //rmiµÄÃû³Æ
	
	
	public ArrayList<MemberPO> find(String keyword, FindMemberType type) throws RemoteException;

}
