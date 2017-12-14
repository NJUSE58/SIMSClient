package bussinesslogic.commoditybl;

import java.util.ArrayList;

import bussinesslogicservice.commodityblservice.CommodityBLService;
import dataenum.ResultMessage;
import dataenum.findtype.FindCommodityType;
import vo.ViewObject;
import vo.commodity.CommodityVO;

public class CommodityController implements CommodityBLService{

	private static CommodityController commodityController = new CommodityController();
	public static CommodityController getInstance(){
		return commodityController;
	}

	public CommodityBLService getCommodityBLService(){
		return (CommodityBLService)commodityController;
	}

	@Override
	public void check() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stock() {
		// TODO Auto-generated method stub

	}

	@Override
	public ResultMessage insert(CommodityVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delelte(CommodityVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ResultMessage update(CommodityVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<CommodityVO> find(String info, FindCommodityType properties) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<CommodityVO> getCommodityList() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
