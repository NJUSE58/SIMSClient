package bussinesslogic.userbl;

import dataenum.UserRole;
import po.UserPO;

/**     
*  
* @author Lijie 
* @date 2017Äê12ÔÂ11ÈÕ    
*/
public class UserInfo {
	private UserPO po;

	public String getOperator() {
		return po.getName();
	}
	
	public UserRole getRole() {
		return po.getRole();
	}
}
