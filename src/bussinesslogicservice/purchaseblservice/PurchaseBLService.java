package bussinesslogicservice.purchaseblservice;

import java.util.ArrayList;

import dataenum.ResultMessage;
import vo.PromotionVO;
import vo.commodity.CommodityItemVO;
import vo.commodity.CommodityVO;
import vo.purchase.PurchaseVO;

/**
* 类说明   进货
*
* @author ****
* @date 2017年10月22日
*/
public interface PurchaseBLService {

	public String getPurchaseID();
	public String getPurBackID();

	public CommodityVO getCommodityByID(int ID);

	public ArrayList<PromotionVO> getCommodityPromotionListByID(int commodityID);

	public ArrayList<PurchaseVO> show();

	public PurchaseVO submit(PurchaseVO Info);

	public PurchaseVO save(PurchaseVO Info);

	public void endSales();

	public ResultMessage isLegal(CommodityItemVO vo);
}
