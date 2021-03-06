package SIMSclient.src.bussinesslogic;
/**     
*  
* @author Lijie 
* @date 2017��12��1��    
*/

import java.util.ArrayList;

import SIMSclient.src.po.commodity.CommodityItemPO;
import SIMSclient.src.vo.commodity.CommodityItemVO;

public class CommodityItemTran {

	public static ArrayList<CommodityItemPO> VOtoPO(ArrayList<CommodityItemVO> vo) {
		ArrayList<CommodityItemPO> itemPO = new ArrayList<>();
		for(CommodityItemVO c : vo) {
			CommodityItemPO po = new CommodityItemPO(c.id, c.name, c.number, c.price, c.remark);
			itemPO.add(po);
		}
		return itemPO;
	}
	
	public static ArrayList<CommodityItemVO> POtoVO(ArrayList<CommodityItemPO> po) {
		ArrayList<CommodityItemVO> itemVO = new ArrayList<>();
		for(CommodityItemPO c : po) {
			CommodityItemVO vo = new CommodityItemVO(c.getId(), c.getName(), c.getModel(), c.getNumber(), c.getPrice(), c.getRemark());
			itemVO.add(vo);
		}
		return itemVO;
	}
}
