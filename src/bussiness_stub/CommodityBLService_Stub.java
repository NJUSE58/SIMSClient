package bussiness_stub;

import java.util.ArrayList;

import bussinesslogicservice.commodityblservice.CommodityBLService;
import dataenum.ResultMessage;
import dataenum.findtype.FindCommodityType;
import vo.commodity.ClassificationVO;
import vo.commodity.CommodityVO;

public class CommodityBLService_Stub implements CommodityBLService{

	@Override
	public ResultMessage insert(CommodityVO vo) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

	@Override
	public void delelte(CommodityVO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public ResultMessage update(CommodityVO vo) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

	@Override
	public ArrayList<CommodityVO> find(String info, FindCommodityType properties) {
		ArrayList<CommodityVO> list = new ArrayList<>();
		ClassificationVO classification = new ClassificationVO("00001","°×µÆÀà",null,null,null);
        CommodityVO commodity1 = new CommodityVO("00001","°×³ãµÆ","L",classification,20,25,45,500);
        CommodityVO commodity2 = new CommodityVO("00002","Ì¨µÆ","S",classification,30,30,50,500);
        list.add(commodity1);
        list.add(commodity2);
		return list;
	}

	@Override
	public ArrayList<CommodityVO> getCommodityList() {
		ArrayList<CommodityVO> list = new ArrayList<>();
		ClassificationVO classification = new ClassificationVO("00001","°×µÆÀà",null,null,null);
        CommodityVO commodity1 = new CommodityVO("00001","°×³ãµÆ","L",classification,20,25,45,500);
        CommodityVO commodity2 = new CommodityVO("00002","Ì¨µÆ","L",classification,30,30,50,500);
        list.add(commodity1);
        list.add(commodity2);
		return list;
	}

	@Override
	public void check() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stock() {
		// TODO Auto-generated method stub

	}

}
