package vo.commodity;

import vo.ViewObject;

public class CommodityItemVO extends ViewObject {


	CommodityVO commodity;
	public String price;
	public String sum;  //总额
	public String remark;  //备注

	public CommodityItemVO(CommodityVO commodity, String remark) {
		this.commodity = commodity;
		this.remark = remark;
	}

	public void setPrice(String price){
		this.price = price;
	}

	@Override
	public String toString() {
		return "\r\n\t[商品ID=" + id + ", 商品名称=" + commodity.getName() + ", 商品型号=" + commodity.getModel() + ", 商品数量=" + commodity.getModel() + ", 商品单价=" + price
				+ ", 商品总价=" + sum + ", 备注=" + remark + "]";
	}
}
