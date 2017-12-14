package bussinesslogic.memberbl;

import java.util.ArrayList;

import bussinesslogicservice.memberblservice.MemberBLService;
import dataenum.ResultMessage;
import dataenum.findtype.FindMemberType;
import dataservice.memberdataservice.MemberDataService;
import rmi.RemoteHelper;
import vo.member.MemberVO;

/**     
*  
* @author Lijie 
* @date 2017Äê12ÔÂ13ÈÕ    
*/
public class MemberController implements MemberBLService{

	private MemberDataService member;
	
	public MemberController() {
		member = RemoteHelper.getInstance().getMemeberDataService();
	}
	@Override
	public String getId() {
		return null;
	}

	@Override
	public ArrayList<MemberVO> show() {
		return null;
	}

	@Override
	public ArrayList<MemberVO> find(String keyword, FindMemberType type) {
		return null;
	}

	@Override
	public ResultMessage insert(MemberVO vo) {
		return null;
	}

	@Override
	public ResultMessage update(MemberVO vo) {
		return null;
	}

	@Override
	public ResultMessage delete(String id) {
		return null;
	}

}
