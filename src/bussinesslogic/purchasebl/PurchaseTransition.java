package SIMSclient.src.bussinesslogic.purchasebl;

import java.util.ArrayList;

import SIMSclient.src.bussinesslogic.CommodityItemTran;
import SIMSclient.src.po.PurchasePO;
import SIMSclient.src.po.commodity.CommodityItemPO;
import SIMSclient.src.vo.commodity.CommodityItemVO;
import SIMSclient.src.vo.purchase.PurchaseVO;

/**     
*  用于PO与VO的互相转换
* @author Lijie 
* @date 2017年12月1日    
*/
public class PurchaseTransition {

	public static PurchasePO VOtoPO(PurchaseVO vo) {
		ArrayList<CommodityItemPO> commodities = CommodityItemTran.VOtoPO(vo.commodities);
		return new PurchasePO(vo.id, vo.supplierID, vo.supplier, vo.warehouse, 
				vo.operator, commodities, vo.sum, vo.remark, vo.state, vo.type);
	}
	
	public static PurchaseVO POtoVO(PurchasePO po) {
		ArrayList<CommodityItemVO> commodities = CommodityItemTran.POtoVO(po.getCommodities());
		return new PurchaseVO(po.getMemberId(), po.getMemberName(), po.getWarehouse(), 
				po.getOperator(), commodities, po.getSum(), po.getRemark(), po.getType(), po.getState());
	}
}
