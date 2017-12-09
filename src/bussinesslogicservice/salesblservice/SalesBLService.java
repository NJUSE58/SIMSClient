package SIMSclient.src.bussinesslogicservice.salesblservice;

import java.util.*;

import SIMSclient.src.vo.PromotionVO;
import SIMSclient.src.vo.commodity.CommodityItemVO;
import SIMSclient.src.vo.commodity.CommodityVO;
import SIMSclient.src.vo.member.MemberVO;
import SIMSclient.src.vo.sale.SalesAddVO;
import SIMSclient.src.vo.sale.SalesVO;

public interface SalesBLService {

	/**
	 * 获取销售单ID和销售退货单ID
	 * @return ID
	 */
	public String getSaleID();
	public String getBackSaleID();
	
	/**
	 * 通过ID获取商品信息 
	 * @param ID
	 * @return 商品详细信息
	 */
	public CommodityVO getCommodityByID(int ID);

	/**
	 * 增加商品
	 * @param item
	 */
	public void addCommodities(CommodityItemVO item);
	
	/**
	 * 查看促销商品
	 * @param commodityID
	 * @return 促销商品列表
	 */
	public ArrayList<PromotionVO> getCommodityPromotionListByID(int commodityID);

	/**
	 * 获取客户信息
	 * @return 客户信息
	 */
	public MemberVO getMember();

	/**
	 * 创建提交销售(退货)单  
	 * (审批状态）
	 * @param mode
	 * @return 处理信息
	 */
	public SalesVO submit(SalesAddVO Info);

	/**
	 * 保存销售(退货)单 
	 * (草稿状态)
	 * @param Info
	 * @return 处理信息
	 */
	public SalesVO save(SalesAddVO Info);

	/**
	 * 结束销售单的制定
	 */
	public void endSales();
}
