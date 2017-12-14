package vo.promotion;
/**     
*  
* @author Lijie 
* @date 2017Äê12ÔÂ11ÈÕ    
*/

import java.util.ArrayList;

import dataenum.MemberLevel;
import vo.commodity.CommodityItemVO;

public class PromotionMemberVO extends PromotionVO {
	public String beginDate;
	public String endDate;
	public MemberLevel level;
	public double allowance;
	public double voucher;
	public ArrayList<CommodityItemVO> gifts;
	
	public PromotionMemberVO(String id, String beginDate, String endDate, MemberLevel level, double allowance, double voucher,
			ArrayList<CommodityItemVO> gifts) {
		super();
		this.id = id;
		this.beginDate = beginDate;
		this.endDate = endDate;
		this.level = level;
		this.allowance = allowance;
		this.voucher = voucher;
		this.gifts = gifts;
	}
	
	

}
