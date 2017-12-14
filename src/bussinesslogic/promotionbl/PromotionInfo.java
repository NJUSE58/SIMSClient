package bussinesslogic.promotionbl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import bussinesslogicservice.salesblservice.Sale_PromotionInfo;
import po.commodity.CommodityItemPO;
import vo.promotion.PromotionCommodityVO;
import vo.promotion.PromotionMemberVO;
import vo.promotion.PromotionPricePacksVO;
import vo.promotion.PromotionTotalVO;

/**     
*  
* @author Lijie 
* @date 2017Äê12ÔÂ11ÈÕ    
*/
public class PromotionInfo implements Sale_PromotionInfo{

	@Override
	public ArrayList<PromotionCommodityVO> findFitPromotionCommodity(String id, ArrayList<String> commodityIDs,
			ArrayList<Integer> commodityNumber) throws RemoteException {
		return null;
	}

	@Override
	public ArrayList<PromotionMemberVO> findMemberPromotion(String id, String memberID) throws RemoteException {
		return null;
	}

	@Override
	public ArrayList<PromotionTotalVO> findTotalPromotion(String id, double beforePrice) throws RemoteException {
		return null;
	}

	@Override
	public ArrayList<PromotionPricePacksVO> showPricePacks() throws RemoteException {
		return null;
	}

	@Override
	public PromotionPricePacksVO findPricePacks(String id) throws RemoteException {
		return null;
	}

	@Override
	public double getAllowance(String ID) throws RemoteException {
		return 0;
	}

	@Override
	public double getVoucher(String ID) throws RemoteException {
		return 0;
	}

	@Override
	public ArrayList<CommodityItemPO> getGifts(String ID) throws RemoteException {
		return null;
	}

}
