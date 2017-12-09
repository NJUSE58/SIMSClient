package SIMSclient.src.data_stub;

import java.util.ArrayList;

import SIMSclient.src.dataenum.ResultMessage;
import SIMSclient.src.vo.member.MemberVO;

/**  
* 类说明   
*  
* @author ****  
* @date 2017年10月22日    
*/
public class MemberDataService_Stub {

	
	public String getID() {
		System.out.println("getID Succeed!\n");
		return null;
	}

	public ArrayList<MemberVO> show() {
		System.out.println("Show Succeed!\n");
		return null;
	}

	public ArrayList<MemberVO> fuzzySearch(String keyword) {
		System.out.println("fuzzySearch Succeed!\n");
		return null;
	}

	public MemberVO exactSearch(String ID) {
		System.out.println("exactSearch Succeed!\n");
		return null;
	}

	
	public ResultMessage add() {
		System.out.println("ADD Succeed!\n");
		return null;
	}


	public ResultMessage update() {
		System.out.println("UPDATE Succeed!\n");
		return null;
	}

	public ResultMessage delete() {
		System.out.println("DELETE Succeed!\n");
		return null;
	}

}
