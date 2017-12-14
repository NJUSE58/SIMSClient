package vo.promotion;
/**     
*  
* @author Lijie 
* @date 2017Äê12ÔÂ11ÈÕ    
*/

import java.util.ArrayList;

import vo.commodity.CommodityItemVO;

public class PromotionCommodityVO extends PromotionVO{

	public String beginDate;
	public String endDate;
	public double allowance;
	public double voucher;
	public ArrayList<CommodityItemVO> gifts;
	public ArrayList<PromotionGoodsVO> goods;
	
	public PromotionCommodityVO(String id, String beginDate, String endDate, double allowance, double voucher,
			ArrayList<CommodityItemVO> gifts, ArrayList<PromotionGoodsVO> goods) {
		super();
		this.id = id;
		this.beginDate = beginDate;
		this.endDate = endDate;
		this.allowance = allowance;
		this.voucher = voucher;
		this.gifts = gifts;
		this.goods = goods;
	}
	
	
}
