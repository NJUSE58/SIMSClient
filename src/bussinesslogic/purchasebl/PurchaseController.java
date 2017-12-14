package bussinesslogic.purchasebl;

import java.util.ArrayList;

import bussinesslogicservice.purchaseblservice.PurchaseBLService;
import dataenum.ResultMessage;
import po.PurchasePO;
import vo.PromotionVO;
import vo.commodity.CommodityItemVO;
import vo.commodity.CommodityVO;
import vo.purchase.PurchaseVO;

/**
*
* @author Lijie
* @date 2017Äê12ÔÂ1ÈÕ
*/
public class PurchaseController implements PurchaseBLService{

	@Override
	public String getPurchaseID() {
		return null;
	}

	@Override
	public String getPurChaseBackID() {
		return null;
	}

	@Override
	public PurchasePO createPurcashe() {
		return null;
	}

	@Override
	public void addCommodities(CommodityItemVO item) {
	}

	@Override
	public void addMembers(String id) {
	}

	@Override
	public PurchaseVO submit(PurchaseVO Info) {
		return null;
	}

	@Override
	public PurchaseVO save(PurchaseVO Info) {
		return null;
	}

	@Override
	public ResultMessage updateDraft(PurchaseVO vo) {
		return null;
	}

	@Override
	public ResultMessage submitDraft(PurchaseVO vo) {
		return null;
	}

	@Override
	public ResultMessage isLegal(CommodityItemVO vo) {
		return null;
	}

	@Override
	public ArrayList<PurchaseVO> showPurchase() {
		return null;
	}

	@Override
	public ArrayList<PurchaseVO> showPurchaseBack() {
		return null;
	}

	@Override
	public ArrayList<PurchaseVO> showPurchaseCommited() {
		return null;
	}

	@Override
	public ArrayList<PurchaseVO> showPurchaseBackCommited() {
		return null;
	}

	@Override
	public ArrayList<PurchaseVO> showPurchaseSuccess() {
		return null;
	}

	@Override
	public ArrayList<PurchaseVO> showPurchaseBackSuccess() {
		return null;
	}

	@Override
	public ArrayList<PurchaseVO> showPurchaseDraft() {
		return null;
	}

	@Override
	public ArrayList<PurchaseVO> showPurchaseBackDraft() {
		return null;
	}

	@Override
	public ArrayList<PurchaseVO> showPurchaseFail() {
		return null;
	}

	@Override
	public ArrayList<PurchaseVO> showPurchaseBackFail() {
		return null;
	}

}
