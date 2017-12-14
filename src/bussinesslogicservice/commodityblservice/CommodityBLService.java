package bussinesslogicservice.commodityblservice;
import java.util.ArrayList;

import dataenum.ResultMessage;
import dataenum.findtype.FindCommodityType;
import vo.commodity.CommodityVO;

public interface CommodityBLService {

	public ResultMessage insert(CommodityVO vo);

	public void delelte(CommodityVO vo);

	public ResultMessage update(CommodityVO vo);

	public ArrayList<CommodityVO> find(String info,FindCommodityType properties);

	public ArrayList<CommodityVO> getCommodityList();

	public void check();   //ø‚¥Ê≤Èø¥

	public void stock();   //ø‚¥Ê≈Ãµ„
}
