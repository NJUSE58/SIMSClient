package data_stub;

import java.rmi.RemoteException;

import po.UserPO;

public class UserDataService_Stub {
	public void insert(UserPO po) throws RemoteException{
    	System.out.println("Insert Success.");
    }
	public void delelte(UserPO po) throws RemoteException{
		System.out.println("Delete Success.");
	}
	public void update(UserPO po) throws RemoteException{
		System.out.println("Update Success.");
	}
	public void find(UserPO po) throws RemoteException{
		System.out.println("Find Success.");
	}
}
