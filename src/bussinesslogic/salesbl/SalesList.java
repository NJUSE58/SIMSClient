package SIMSclient.src.bussinesslogic.salesbl;

import java.util.ArrayList;

import SIMSclient.src.dataenum.Warehouse;
import SIMSclient.src.po.commodity.CommodityItemPO;

/*
 * 销售单，包括：
 * 单据编号（XSD-yyyyMMdd-xxxxx），
 * 客户（仅显示销售商），
 * 业务员（和这个客户打交道的公司员工，可以设置一个客户的默认业务员），
 * 操作员（当前登录系统的用户），
 * 仓库，
 * 出货商品清单，
 * 折让前总额，
 * 折让，
 * 使用代金卷金额，
 * 折让后总额，
 * 备注
 */
public class SalesList {

	private String ID;
	private String Name;
	private Warehouse warehouse;
	private ArrayList<SalesLineItem> commodityList; // 商品列表清单
	private double beforePrice;
	private double allowance;
	private double voucher;
	private double afterPrice;
	private String remark;

	public SalesList() {
		commodityList = new ArrayList<>();
		beforePrice = 0;
	}

	/*添加商品*/
	public void add(SalesLineItem item) {
		commodityList.add(item);
	}
	
	/*进行PO的转换*/
	public ArrayList<CommodityItemPO> getCommodities() {
		ArrayList<CommodityItemPO> commoditiesPO = new ArrayList<CommodityItemPO>();
		for(SalesLineItem commodity : commodityList) {
			CommodityItemPO po = new CommodityItemPO(commodity.getId(), commodity.getName(),
					commodity.getNumber(), commodity.getPrice(), commodity.getRemark());
			commoditiesPO.add(po);
		}
		return commoditiesPO;
	}
	
	
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Warehouse getWareHouse() {
		return warehouse;
	}

	public void setWareHouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}


	/*计算折让前价格*/
	public double getBeforePrice() {
		if (beforePrice > 0) {
			return beforePrice;
		}
		for(int i = 0; i < commodityList.size(); i++) {
			beforePrice += commodityList.get(i).getSum();
		}
		return beforePrice;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	public double getVoucher() {
		return voucher;
	}

	public void setVoucher(double voucher) {
		this.voucher = voucher;
	}

	/*计算折让后价格*/
	public double getAfterPrice() {
		this.afterPrice = beforePrice - voucher - allowance;
		if (this.afterPrice < 0) {
			return 0;
		}
		return afterPrice;
	}


	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
