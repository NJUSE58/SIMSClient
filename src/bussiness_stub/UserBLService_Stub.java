package SIMSclient.src.bussiness_stub;

import SIMSclient.src.vo.UserVO;

public class UserBLService_Stub {

    public void insert(UserVO vo){
    	System.out.println("Insert Success.");
    }
	public void delelte(UserVO vo){
		System.out.println("Delete Success.");
	}
	public void update(UserVO vo){
		System.out.println("Update Success.");
	}
	public void find(UserVO vo){
		System.out.println("Find Success.");
	}
}
