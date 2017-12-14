package bussiness_stub;

import java.util.ArrayList;

import bussinesslogicservice.purchaseblservice.PurchaseBLService;
import dataenum.BillState;
import dataenum.BillType;
import dataenum.ResultMessage;
import dataenum.Warehouse;
import po.PurchasePO;
import vo.PromotionVO;
import vo.commodity.CommodityItemVO;
import vo.commodity.CommodityVO;
import vo.purchase.PurchaseVO;

public class PurchaseBLService_Stub implements PurchaseBLService{

	@Override
	public String getPurchaseID() {
		// TODO Auto-generated method stub
		return "JHD-20171214-00001";
	}



	@Override
	public ArrayList<PurchaseVO> show() {
		ArrayList<PurchaseVO> list = new ArrayList<>();
		ArrayList<CommodityItemVO> commodities = new ArrayList<>();
		CommodityItemVO commodity = new CommodityItemVO("001","°×³ãµÆ","L",89,45.00,"cnjwdfcj");
		commodities.add(commodity);
		PurchaseVO purchase1 = new PurchaseVO("0001","Àî½Ü",Warehouse.WAREHOUSE1,"Panxy",commodities,
				"ncibwcfhbwvhu",45.00,BillType.PURCHASEBILL,BillState.FAIL);
		list.add(purchase1);
		return list;
	}

	@Override
	public PurchaseVO submit(PurchaseVO Info) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PurchaseVO save(PurchaseVO Info) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage isLegal(CommodityItemVO vo) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}



	@Override
	public String getPurChaseBackID() {
		// TODO Auto-generated method stub
		return "JHTHD-20171214-00002";
	}



	@Override
	public PurchasePO createPurcashe() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void addCommodities(CommodityItemVO item) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void addMembers(String id) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public ResultMessage updateDraft(PurchaseVO vo) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public ResultMessage submitDraft(PurchaseVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

}
