package po;

public class PromotionPO extends PersistObject{

	private static final long serialVersionUID = 1L;
	
	public PromotionPO(String id) {
		super(id);
	}
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
	
}
