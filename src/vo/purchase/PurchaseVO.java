package vo.purchase;

import java.util.ArrayList;



import dataenum.BillState;
import dataenum.BillType;
import dataenum.Warehouse;
import vo.ViewObject;
import vo.commodity.CommodityItemVO;

public class PurchaseVO extends ViewObject{

	public String supplierID;
	public String supplier;  //供应商
	public Warehouse warehouse;
	public String operator;
	public ArrayList<CommodityItemVO> commodities;  //入库商品列表
	public double sum;
	public String remark;
	public BillType type;
	public BillState state;


	/**
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param supplierID
	* @param @param supplier
	* @param @param warehouse
	* @param @param operator
	* @param @param commodities
	* @param @param sum
	* @param @param remark
	* @param @param type
	* @param @param state    设定文件
	* @return   返回类型
	* @throws
	*/
	public PurchaseVO(String supplierID, String supplier, Warehouse warehouse, String operator,
			ArrayList<CommodityItemVO> commodities, double sum, String remark, BillType type, BillState state) {
		super();
		this.supplierID = supplierID;
		this.supplier = supplier;
		this.warehouse = warehouse;
		this.operator = operator;
		this.commodities = commodities;
		this.sum = sum;
		this.remark = remark;
		this.type = type;
		this.state = state;
	}





	@Override
	public String toString() {
		return 	"[单据ID=" + id + ", 客户ID=" + supplierID + ", 客户姓名=" + supplier
				+ ", 仓库=" + warehouse.value + ", 操作员=" + operator + ", 商品列表="
				+ commodities + ",\r\n商品总价=" + sum + ", 备注="
				+ remark + ", 单据类型=" + type.value + ", 单据状态=" + state.value
				+ "]";
	}



}
