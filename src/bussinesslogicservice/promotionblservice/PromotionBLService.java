package SIMSclient.src.bussinesslogicservice.promotionblservice;

import java.util.ArrayList;

import SIMSclient.src.vo.PromotionVO;

public interface PromotionBLService {
//dffff
	public ArrayList<PromotionVO> getCommodityPromotionListByID(int commodityID);
	public String getBillID(); // 单据ID
	public String getclientID(); // 客户ID
	public String getclientName(); // 客户名字
	public String getcellNumber(); // 电话号码
	public String getuser(); // 操作员
	public String getsaleMan(); // 业务员

}
