package bussinesslogicservice.purchaseblservice;

import java.util.ArrayList;

import dataenum.ResultMessage;
import po.PurchasePO;
import vo.PromotionVO;
import vo.commodity.CommodityItemVO;
import vo.commodity.CommodityVO;
import vo.purchase.PurchaseVO;

/**
* 类说明   进货
*
* @author ****
* @date 2017年10月22日
*/
public interface PurchaseBLService {

	public String getPurchaseID();
	public String getPurChaseBackID();

	public PurchasePO createPurcashe();
	
	public void addCommodities(CommodityItemVO item);
	
	public void addMembers(String id);
	

	public PurchaseVO submit(PurchaseVO Info);

	public PurchaseVO save(PurchaseVO Info);

	public ResultMessage updateDraft(PurchaseVO vo);
	
	public ResultMessage submitDraft(PurchaseVO vo);

	public ResultMessage isLegal(CommodityItemVO vo);
	
	/**
	 * 显示单据
	 */
	public ArrayList<PurchaseVO> show();
}
