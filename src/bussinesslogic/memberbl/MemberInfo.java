package bussinesslogic.memberbl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import bussinesslogicservice.salesblservice.Sale_MemberInfo;
import dataservice.accountdataservice.Member_AccountInfo;
import po.MemberPO;

/**     
*  
* @author Lijie 
* @date 2017Äê12ÔÂ11ÈÕ    
*/
public class MemberInfo implements Sale_MemberInfo, Member_AccountInfo{

	@Override
	public String getMember(String id) throws RemoteException {
		return null;
	}

	@Override
	public String getSaleMan(String id) throws RemoteException {
		return null;
	}

	@Override
	public void changePayable(String memberID, double afterPrice) throws RemoteException {
	}

	@Override
	public boolean isLimit(String memberID, double money) throws RemoteException {
		return false;
	}

	@Override
	public void setPayable(String id, double payable) {
	}

	@Override
	public void setReceivable(String id, double receivable) {
	}

	@Override
	public ArrayList<MemberPO> getMembers() {
		return null;
	}

	@Override
	public String getName(String id) {
		return null;
	}

	@Override
	public String getId(String id) {
		return null;
	}

}
