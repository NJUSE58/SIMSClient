package bussinesslogicservice.salesblservice;
import java.rmi.RemoteException;
import java.util.ArrayList;

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
public interface Sale_PromotionInfo {

	public ArrayList<PromotionCommodityVO> findFitPromotionCommodity(String id, ArrayList<String> commodityIDs, ArrayList<Integer> commodityNumber) throws RemoteException;

	public ArrayList<PromotionMemberVO> findMemberPromotion(String id, String memberID) throws RemoteException;
	
	public ArrayList<PromotionTotalVO> findTotalPromotion(String id, double beforePrice) throws RemoteException;
	
	public ArrayList<PromotionPricePacksVO> showPricePacks() throws RemoteException;

	public PromotionPricePacksVO findPricePacks(String id) throws RemoteException;
	
	public double getAllowance(String ID) throws RemoteException;
	public double getVoucher(String ID) throws RemoteException;
	public ArrayList<CommodityItemPO> getGifts(String ID) throws RemoteException;
	

}