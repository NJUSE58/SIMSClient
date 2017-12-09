package vo;

public class PromotionVO {

	public String BillID; // 单据ID
	public String clientID; // 客户ID
	public String clientName; // 客户名字
	public String cellNumber; // 电话号码
	public String user; // 操作员
	public String saleMan; // 业务员
	public double beforePrice; // 折让前价格
	public double allowance; // 折让金额
	public double voucher; // 代金券金额
	public double afterPrice; // 折让后金额
	public String remark; // 备注

	public PromotionVO(String BillID, String clientID, String clientName, String cellNumber, String user, String saleMan,
			double beforePrice, double allowance, double voucher, double afterPrice, String remark) {
		super();
		this.BillID = BillID;
		this.clientID = clientID;
		this.clientName = clientName;
		this.user = user;
		this.saleMan = saleMan;
		this.beforePrice = beforePrice;
		this.allowance = allowance;
		this.voucher = voucher;
		this.afterPrice = afterPrice;
		this.remark = remark;
	}

}
