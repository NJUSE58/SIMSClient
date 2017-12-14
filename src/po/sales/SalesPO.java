package po.sales;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import dataenum.BillState;
import dataenum.BillType;
import dataenum.Warehouse;
import po.PersistObject;
import po.commodity.CommodityItemPO;


public class SalesPO implements Serializable {

	private static final long serialVersionUID = -2078643903406807067L;
	private String id;
	private String clientId;
	private String clientName; // 客户姓名
	private String operator; // 操作员
	private String saleMan; // 业务员
	private Warehouse warehouse; // 仓库
	private Double beforePrice; // 折让前价格
	private Double allowance; // 折让金额
	private Double voucher; // 代金券金额
	private Double afterPrice; // 折让后金额
	private String remark; // 备注
	private ArrayList<CommodityItemPO> commodities; // 商品清单
	private BillState state;
	private BillType type;
	private String date;

	/**
	 * @param id
	 * @param clientId
	 * @param clientName
	 * @param operator
	 * @param saleMan
	 * @param warehouse
	 * @param beforePrice
	 * @param allowance
	 * @param voucher
	 * @param afterPrice
	 * @param remark
	 * @param commodities
	 * @param state
	 * @param type
	 */
	public SalesPO(String id, String clientId, String clientName, String saleMan, String operator, Warehouse warehouse,
			ArrayList<CommodityItemPO> commodities, Double beforePrice, Double allowance, Double voucher,
			Double afterPrice, String remark, BillType type, BillState state) {
		this.id = id;
		this.clientId = clientId;
		this.clientName = clientName;
		this.operator = operator;
		this.saleMan = saleMan;
		this.warehouse = warehouse;
		this.beforePrice = beforePrice;
		this.allowance = allowance;
		this.voucher = voucher;
		this.afterPrice = afterPrice;
		this.remark = remark;
		this.commodities = commodities;
		this.state = state;
		this.type = type;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		this.date = sdf.format(new Date());
	}
	
	public String getDate() {
		return this.date;
	}
	
	public String getId() {
		return id;
	}
	
	public void setState(BillState state) {
		this.state = state;
	}

	public String getClientId() {
		return clientId;
	}

	public String getClientName() {
		return clientName;
	}

	public String getOperator() {
		return operator;
	}

	public String getSaleMan() {
		return saleMan;
	}

	public Warehouse getWarehouse() {
		return warehouse;
	}

	public double getBeforePrice() {
		return beforePrice;
	}

	public double getAllowance() {
		return allowance;
	}

	public double getVoucher() {
		return voucher;
	}

	public double getAfterPrice() {
		return afterPrice;
	}

	public String getRemark() {
		return remark;
	}

	public ArrayList<CommodityItemPO> getCommodities() {
		return commodities;
	}

	public BillState getState() {
		return state;
	}

	public BillType getType() {
		return type;
	}

	@Override
	public String toString() {
		return "SalesPO [ID=" + this.id + ", clientID=" + this.clientId + ", client=" + this.clientName + ", salesman="
				+ this.saleMan + ", operator=" + this.operator + ", Warehouse=" + this.warehouse + ", commodities="
				+ this.commodities + ", beforePrice=" + this.beforePrice + ", allowance=" + this.allowance
				+ ", voucher=" + this.voucher + ", afterPrice=" + this.afterPrice + ", remark=" + this.remark
				+ ", type=" + this.type + ", state=" + this.state + "]";
	}

}
