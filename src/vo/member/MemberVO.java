package vo.member;

import dataenum.MemberCategory;

import dataenum.MemberLevel;

public class MemberVO {
	public String ID;
	public MemberCategory category; // 客户分类：进货商和销售商
	public MemberLevel level; // 客户级别：五级，一级普通用户，五级VIP客户
	public String name; // 客户名字
	public String cellNumber; // 电话号码
	public String address;
	public String post; // 邮编
	public String email;
	public double receivableLimit; // 应收额度
	public double receivable; // 应收
	public double payable; // 应付
	public String saleMan; // 默认业务员

	/**
	 * @param category
	 * @param level
	 * @param name
	 * @param cellNumber
	 * @param address
	 * @param post
	 * @param email
	 * @param receivableLimit
	 * @param receivable
	 * @param payable
	 * @param saleMan
	 */
	public MemberVO(String ID, MemberCategory category, MemberLevel level, String name, String cellNumber,
			String address, String post, String email, double receivableLimit, double receivable, double payable,
			String saleMan) {
		super();
		this.ID = ID;
		this.category = category;
		this.level = level;
		this.name = name;
		this.cellNumber = cellNumber;
		this.address = address;
		this.post = post;
		this.email = email;
		this.receivableLimit = receivableLimit;
		this.receivable = receivable;
		this.payable = payable;
		this.saleMan = saleMan;
	}

}
