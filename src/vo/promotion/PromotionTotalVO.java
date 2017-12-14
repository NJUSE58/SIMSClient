package vo.promotion;
/**     
* 根据购买的商品总价，制定折让，赠品，赠送代金券
* @author Lijie 
* @date 2017年12月11日    
*/

import java.util.ArrayList;

public class PromotionTotalVO extends PromotionVO {

	public String beginDate;
	public String endDate;
	public double total;
	public double allowance;
	public double voucher;
	public ArrayList<PromotionGoodsVO> gifts;
	
	public PromotionTotalVO(String id, String beginDate, String endDate, double total, 
			double allowance, double voucher, ArrayList<PromotionGoodsVO> gifts) {
		this.id = id;
		this.allowance = allowance;
		this.beginDate = beginDate;
		this.endDate = endDate;
		this.voucher = voucher;
		this.gifts = gifts;
		this.total = total;
	}
	
}
