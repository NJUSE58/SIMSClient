package bussinesslogic.commoditybl.Info;

import java.rmi.RemoteException;

import bussinesslogicservice.salesblservice.Sale_CommodityInfo;
import dataenum.BillType;

/**     
*  
* @author Lijie 
* @date 2017年12月11日    
*/
public class CommodityInfo implements Sale_CommodityInfo{

	/**
	 * 审批的时候，检查现在商品的数量是否够
	 */
	@Override
	public boolean checkNumber(String id, int i) throws RemoteException {
		return false;
	}
    
	/**
	 * 将商品设置成是否可删除
	 */
	@Override
	public void setDelete(String id, boolean canDelete) throws RemoteException {
	}

	@Override
	public String getName(String id) throws RemoteException {
		return null;
	}

	@Override
	public String getModel(String id) throws RemoteException {
		return null;
	}

	@Override
	public void changeCommodityInfo(String id, int number, double price, BillType billType) throws RemoteException {
	}

}
