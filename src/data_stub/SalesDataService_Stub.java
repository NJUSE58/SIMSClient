package data_stub;

import java.util.ArrayList;

import bussinesslogic.commoditybl.CommodityItem;
import vo.PromotionVO;
import vo.commodity.CommodityVO;
import vo.member.MemberVO;
import vo.sale.SalesInputVO;
import vo.sale.SalesVO;

/**  
* 类说明   
*  
* @author ****  
* @date 2017年10月22日    
*/
public class SalesDataService_Stub {

	
	public String getSaleID() {
		System.out.println("getSaleID Succeed!\n");
		return null;
	}

	
	public String getBackID() {
		System.out.println("getBackID Succeed!\n");
		return null;
	}

	
	public CommodityVO getCommodityByID(int ID) {
		System.out.println("getCommodityByID Succeed!\n");
		return null;
	}

	
	public void addCommodities(CommodityItem item) {
		System.out.println("addCommodities Succeed!\n");
		
	}

	public ArrayList<PromotionVO> getCommodityPromotionListByID(int commodityID) {
		System.out.println("getCommodityPromotionListByID Succeed!\n");
		return null;
	}

	public MemberVO getMember() {
		System.out.println("getMember Succeed!\n");
		return null;
	}

	public SalesVO submit(SalesInputVO Info) {
		System.out.println("Submit Succeed!\n");
		return null;
	}

	public SalesVO save(SalesInputVO Info) {
		System.out.println("Save Succeed!\n");
		return null;
	}

	public void endSales() {
		System.out.println("End Succeed!\n");
		
	}


}
