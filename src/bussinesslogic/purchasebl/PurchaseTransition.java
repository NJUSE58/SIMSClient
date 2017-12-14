package bussinesslogic.purchasebl;

import java.util.ArrayList;

import bussinesslogic.common.CommodityItemTran;
import po.PurchasePO;
import po.commodity.CommodityItemPO;
import vo.commodity.CommodityItemVO;
import vo.purchase.PurchaseVO;

/**     
*  用于PO与VO的互相转换
* @author Lijie 
* @date 2017年12月1日    
*/
public class PurchaseTransition {

	public static PurchasePO VOtoPO(PurchaseVO vo) {
		ArrayList<CommodityItemPO> commodities = CommodityItemTran.VOtoPO(vo.commodities);
		return new PurchasePO(vo.getId(), vo.supplierID, vo.supplier, vo.warehouse, 
				vo.operator, commodities, vo.remark, vo.sum, vo.type, vo.state);
	}
	
	public static PurchaseVO POtoVO(PurchasePO po) {
		ArrayList<CommodityItemVO> commodities = CommodityItemTran.POtoVO(po.getCommodities());
		return new PurchaseVO(po.getId(), po.getMemberID(), po.getMember(), po.getWarehouse(), 
				po.getOperator(), commodities, po.getRemark(), po.getSum(), po.getType(), po.getState());
	}
}
