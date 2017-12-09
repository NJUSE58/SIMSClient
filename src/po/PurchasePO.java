package SIMSclient.src.po;


import java.util.ArrayList;

import SIMSclient.src.dataenum.BillState;
import SIMSclient.src.dataenum.BillType;
import SIMSclient.src.dataenum.Warehouse;
import SIMSclient.src.po.commodity.CommodityItemPO;

public class PurchasePO extends PersistObject{

	private static final long serialVersionUID = 1L;
	private String MemberId;
	private String MemberName; // 客户姓名
	private Warehouse warehouse; // 仓库
	private String operator; // 操作员
	private ArrayList<CommodityItemPO> commodities; // 商品清单
	private double sum; // 总额
	private String remark; // 备注
	private BillState state;
	private BillType type;
	
	
	
	/** 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @param id
	* @param @param memberId
	* @param @param memberName
	* @param @param warehouse
	* @param @param operator
	* @param @param commodities
	* @param @param sum
	* @param @param remark
	* @param @param state
	* @param @param type    设定文件 
	* @return   返回类型 
	* @throws 
	*/
	public PurchasePO(String id, String memberId, String memberName, Warehouse warehouse, String operator,
			ArrayList<CommodityItemPO> commodities, double sum, String remark, BillState state, BillType type) {
		super(id);
		MemberId = memberId;
		MemberName = memberName;
		this.warehouse = warehouse;
		this.operator = operator;
		this.commodities = commodities;
		this.sum = sum;
		this.remark = remark;
		this.state = state;
		this.type = type;
	}

	public String getMemberId() {
		return MemberId;
	}

	public String getMemberName() {
		return MemberName;
	}

	public Warehouse getWarehouse() {
		return warehouse;
	}

	public String getOperator() {
		return operator;
	}

	public double getSum() {
		return sum;
	}

	public String getRemark() {
		return remark;
	}

	public BillState getState() {
		return state;
	}

	public BillType getType() {
		return type;
	}
	
	public ArrayList<CommodityItemPO> getCommodities() {
		return commodities;
	}
	
	
}
