package SIMSclient.src.bussinesslogic.salesbl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import SIMSclient.src.po.sales.SalesPO;
import SIMSclient.src.vo.commodity.CommodityItemVO;
import SIMSclient.src.vo.sale.SalesVO;
import SIMSclient.src.dataenum.BillType;
import SIMSclient.src.dataservice.salesdataservice.SalesDataService;

/**
 * 
* @ClassName: Sales 
* @Description: 处理销售事务，创建销售（退货）单
* @date 2017年12月1日 下午7:00:29 
*
 */
public class Sales {

	private SalesPO po;
	private BillType type;
	private String ID;
	private ArrayList<String> commodityNames;  
	private ArrayList<Integer> commodityNumber;
	private SalesList list;  //销售单
	private SalesDataService saleData;  //销售单数据
	
	public Sales() {
		this.commodityNames = new ArrayList<>();
		this.commodityNumber = new ArrayList<>();
		this.list = new SalesList();
		this.saleData = getSalesData();
	}
	
	/*建立销售单*/
	public SalesPO createSale() throws RemoteException {
		String memberID = null;
		String salesMan = null;
		String operator = null;
		return new SalesPO(ID, memberID, memberID, salesMan, 
				operator, list.getWareHouse(), list.getCommodities(), list.getBeforePrice(), 
				list.getAllowance(), list.getVoucher(), list.getAfterPrice(), list.getRemark(), type);
	}
	                          
	public SalesDataService getSalesData() {
		try {
			return (SalesDataService) Naming.lookup(SalesDataService.NAME);
		}  catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String getSaleID() throws RemoteException {
        this.type = BillType.SALESBILL;
        this.ID = this.saleData.getSaleID();
        return ID;
    }

    public String getSaleBackID() throws RemoteException {
        this.type = BillType.SALESBACKBILL;
        this.ID = this.saleData.getSaleBackID();
        return ID;
    }
    
    public void addCommodities(CommodityItemVO vo) throws RemoteException {
        SalesLineItem item = new SalesLineItem(vo.name, vo.number, vo.price, vo.remark);
        this.list.add(item);
        this.commodityNames.add(vo.name);
        this.commodityNumber.add(vo.number);
    }
    
    public SalesVO save() {
		return null;
    	
    }
    
    public SalesVO submit() {
		return null;
    	
    }
}
