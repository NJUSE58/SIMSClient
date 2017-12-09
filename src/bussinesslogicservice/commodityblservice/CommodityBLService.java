package SIMSclient.src.bussinesslogicservice.commodityblservice;
import java.util.ArrayList;

import SIMSclient.src.dataenum.ResultMessage;
import SIMSclient.src.dataenum.findtype.FindCommodityType;
import SIMSclient.src.vo.commodity.CommodityVO;

public interface CommodityBLService {

	public ResultMessage insert(CommodityVO vo);

	public void delelte(CommodityVO vo);

	public ResultMessage update(CommodityVO vo);

	public ArrayList<CommodityVO> find(String info,FindCommodityType properties);

	public ArrayList<CommodityVO> getCommodityList();

	public void check();   //ø‚¥Ê≤Èø¥

	public void stock();   //ø‚¥Ê≈Ãµ„
}
