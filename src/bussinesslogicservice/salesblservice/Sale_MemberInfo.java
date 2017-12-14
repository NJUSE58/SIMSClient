package bussinesslogicservice.salesblservice;

import java.rmi.RemoteException;

/**     
*  
* @author Lijie 
* @date 2017Äê12ÔÂ11ÈÕ    
*/
public interface Sale_MemberInfo {

	public String getMember(String id) throws RemoteException;
	
	public String getSaleMan(String id) throws RemoteException;
	
	public void changePayable(String memberID, double afterPrice) throws RemoteException;
	
	public boolean isLimit(String memberID, double money) throws RemoteException;
	
}
