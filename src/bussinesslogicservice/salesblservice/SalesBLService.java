package bussinesslogicservice.salesblservice;

import java.rmi.RemoteException;
import java.util.*;

import dataenum.ResultMessage;
import po.sales.SalesPO;
import vo.PromotionVO;
import vo.commodity.CommodityItemVO;
import vo.commodity.CommodityVO;
import vo.member.MemberVO;
import vo.promotion.PromotionMemberVO;
import vo.promotion.PromotionPricePacksVO;
import vo.promotion.PromotionTotalVO;
import vo.sale.SalesInputVO;
import vo.sale.SalesVO;

/**
 * 
* @ClassName: SalesBLService 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author lijie  
*
 */
public interface SalesBLService {

	public String getSaleID();
	public String getBackSaleID();
	
	public SalesPO createSale();

	public void addCommodities(CommodityItemVO item);
	
	public ArrayList<PromotionPricePacksVO> showPricePacks();
	
	public void addPricePacks(String id);
	
	public ArrayList<PromotionTotalVO> FindTotalPromotion();
	
	public ArrayList<PromotionMemberVO> FindMemberPromotion();
	
	public double setPromotion(String id);
	
	public void addMembers(String id);
	
	public SalesVO submit(SalesInputVO Info);
	public SalesVO save(SalesInputVO Info);
	public ResultMessage updateDraft(SalesVO vo);
	public ResultMessage submitDraft(String id);

}
