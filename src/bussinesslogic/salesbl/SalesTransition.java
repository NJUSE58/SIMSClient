package SIMSclient.src.bussinesslogic.salesbl;

import java.util.ArrayList;
import java.util.Date;

import SIMSclient.src.dataenum.BillState;
import SIMSclient.src.dataenum.BillType;
import SIMSclient.src.dataenum.Warehouse;
import SIMSclient.src.po.commodity.CommodityItemPO;
import SIMSclient.src.po.sales.SalesPO;
import SIMSclient.src.vo.commodity.CommodityItemVO;
import SIMSclient.src.vo.sale.SalesVO;

/**
 * 用于PO与VO的相互转换
 */
public class SalesTransition {

	public static SalesPO VOtoPO(SalesVO vo) {
		String id = vo.id;
		String retailerId = vo.retailerID;
		String retailer = vo.retailer; // 销售商客户
		String saleMan = vo.saleMan; // 业务员
		String operator = vo.operator; // 操作员
		Warehouse warehouse = vo.warehouse;
		ArrayList<CommodityItemPO> commodity = null;
		double beforePrice = vo.beforePrice;
		double allowance = vo.allowance; // 折让
		double voucher = vo.voucher; // 使用代金券金额
		double afterPrice = vo.afterPrice;
		String remark = vo.remark; // 备注
		BillType type = vo.type;
		return new SalesPO(id, retailerId, retailer, saleMan, operator, warehouse, commodity, beforePrice,
				allowance, voucher, afterPrice, remark, type);
	}

	public static SalesVO POtoVO(SalesPO po) {
		String id = po.getID();
		String retailerId = po.getClientId();
		String retailer = po.getClientName();
		String salesMan = po.getSaleMan();
		String operator = po.getOperator();
		Warehouse warehouse = po.getWarehouse();
		ArrayList<CommodityItemVO> commodity = null;
		double beforePrice = po.getBeforePrice();
		double allowance = po.getAllowance(); // 折让
		double voucher = po.getVoucher(); // 使用代金券金额
		double afterPrice = po.getAfterPrice();
		String remark = po.getRemark(); // 备注
		BillType type = po.getType();
		BillState state = po.getState();
		return new SalesVO(id, retailerId, retailer, salesMan, 
				operator, warehouse, commodity, beforePrice, allowance, voucher, afterPrice, remark, state, type);
	}
}
