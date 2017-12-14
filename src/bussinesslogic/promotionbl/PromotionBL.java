package bussinesslogic.promotionbl;

import java.util.ArrayList;

import bussinesslogicservice.promotionblservice.PromotionBLService;
import dataenum.ResultMessage;
import po.PromotionPO;
import vo.promotion.PromotionVO;

public class PromotionBL implements PromotionBLService{
//1234567

		private static PromotionBL promotionBL=new PromotionBL();
		ResultMessage resultMessage = null;
		
		PromotionVO promotionVO;
		PromotionPO promotionPO;
		@Override
		public ArrayList<vo.PromotionVO> getCommodityPromotionListByID(int commodityID) {
			return null;
		}
		@Override
		public String getBillID() {
			return null;
		}
		@Override
		public String getclientID() {
			return null;
		}
		@Override
		public String getclientName() {
			return null;
		}
		@Override
		public String getcellNumber() {
			return null;
		}
		@Override
		public String getuser() {
			return null;
		}
		@Override
		public String getsaleMan() {
			return null;
		} 

}
