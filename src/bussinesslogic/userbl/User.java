package SIMSclient.src.bussinesslogic.userbl;
/**     
*  
* @author Lijie 
* @date 2017年11月26日    
*/

import SIMSclient.src.IOHelper;
import SIMSclient.src.dataservice.userdataservice.UserDataService;
import SIMSclient.src.po.UserPO;

public class User {

	private UserDataService userData;
	private UserPO currentUser; //当前用户
	private IOHelper<UserPO> userName;  
	private IOHelper<UserPO> userInfo;
	
	static {
		
	}
	
}
