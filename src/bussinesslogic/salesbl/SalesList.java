package bussinesslogic.salesbl;

import java.util.ArrayList;

import dataenum.Warehouse;
import po.commodity.CommodityItemPO;

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

	private String memberID;
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
	
	/*转换成PO*/
	public ArrayList<CommodityItemPO> getCommodities() {
		ArrayList<CommodityItemPO> list = new ArrayList<CommodityItemPO>();
		for(SalesLineItem s : commodityList) {
			CommodityItemPO po = new CommodityItemPO(s.getId(), s.getName(), s.getModel(), s.getNumber(), s.getPrice(), s.getRemark());
			list.add(po);
		}
		return list;
	}
	
	
	public String getMemberID() {
		return memberID;
	}

	public void setMemberID(String id) {
		this.memberID = id;
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
		else return afterPrice;
	}


	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
