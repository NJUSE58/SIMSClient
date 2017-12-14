package bussinesslogicservice.memberblservice;

import java.util.ArrayList;

import dataenum.ResultMessage;
import dataenum.findtype.FindMemberType;
import vo.member.MemberVO;

public interface MemberBLService {

	public String getId();

	public ArrayList<MemberVO> show();

	public ArrayList<MemberVO> find(String keyword, FindMemberType type);

	public ResultMessage insert(MemberVO vo);

	public ResultMessage update(MemberVO vo);

	public ResultMessage delete(String id);

}
