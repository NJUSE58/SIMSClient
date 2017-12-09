package SIMSclient.src.bussinesslogicservice.memberblservice;

import java.util.ArrayList;

import SIMSclient.src.dataenum.ResultMessage;
import SIMSclient.src.vo.member.MemberVO;

public interface MemberBLService {

	/**
	 * 获取用户ID
	 * @return ID
	 */
	public String getID();

	/**
	 * 显示客户信息
	 * @return 客户列表
	 */
	public ArrayList<MemberVO> show();

	/**
	 * 模糊查找用户
	 * @param keyword
	 * @return 所有符合条件的客户列表
	 */
	public ArrayList<MemberVO> fuzzySearch(String keyword);

	/**
	 * 精确查找用户
	 * @param ID
	 * @return 精确客户
	 */
	public MemberVO exactSearch(String ID);

	/**
	 * 增加客户
	 * @return 处理信息
	 */
	public ResultMessage add();

	/**
	 * 更新客户
	 * @return 处理信息
	 */
	public ResultMessage update();

	/**
	 * 删除客户
	 * @return 处理信息
	 */
	public ResultMessage delete();

}
