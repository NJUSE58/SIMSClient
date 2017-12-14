package bussiness_stub;

import java.util.ArrayList;

import bussinesslogicservice.purchaseblservice.PurchaseBLService;
import dataenum.BillState;
import dataenum.BillType;
import dataenum.ResultMessage;
import dataenum.Warehouse;
import vo.PromotionVO;
import vo.commodity.CommodityItemVO;
import vo.commodity.CommodityVO;
import vo.purchase.PurchaseVO;

public class PurchaseBLService_Stub implements PurchaseBLService{

	@Override
	public String getPurchaseID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPurBackID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CommodityVO getCommodityByID(int ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<PromotionVO> getCommodityPromotionListByID(int commodityID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<PurchaseVO> show() {
		ArrayList<PurchaseVO> list = new ArrayList<>();
		ArrayList<CommodityItemVO> commodities = new ArrayList<>();
		CommodityItemVO commodity = new CommodityItemVO("001","°×³ãµÆ","L",89,45.0,"cnjwdfcj");
		commodities.add(commodity);
		PurchaseVO purchase1 = new PurchaseVO("0001","Àî½Ü",Warehouse.WAREHOUSE1,"Panxy",commodities,
				"ncibwcfhbwvhu",500.0,BillType.PURCHASEBILL,BillState.DRAFT);
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
	public void endSales() {
		// TODO Auto-generated method stub

	}

	@Override
	public ResultMessage isLegal(CommodityItemVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

}
