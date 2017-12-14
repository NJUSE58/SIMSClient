package bussinesslogic.purchasebl;

import java.util.ArrayList;

import bussinesslogicservice.purchaseblservice.PurchaseBLService;
import dataenum.ResultMessage;
import vo.PromotionVO;
import vo.commodity.CommodityItemVO;
import vo.commodity.CommodityVO;
import vo.purchase.PurchaseVO;

/**
*
* @author Lijie
* @date 2017Äê12ÔÂ1ÈÕ
*/
public class PurchaseController implements PurchaseBLService{

	@Override
	public String getPurchaseID() {
		return null;
	}

	@Override
	public String getPurBackID() {
		return null;
	}

	@Override
	public CommodityVO getCommodityByID(int ID) {
		return null;
	}

	@Override
	public ArrayList<PromotionVO> getCommodityPromotionListByID(int commodityID) {
		return null;
	}

	@Override
	public PurchaseVO submit(PurchaseVO Info) {
		return null;
	}

	@Override
	public PurchaseVO save(PurchaseVO Info) {
		return null;
	}

	@Override
	public void endSales() {
	}

	@Override
	public ResultMessage isLegal(CommodityItemVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

}
