package vo.sale;
/**
* 类说明
*
* @author ****
* @date 2017年10月21日
*/

import dataenum.Warehouse;

public class SalesInputVO {

	public Warehouse warehouse;
	public Double allowance;
	public Double voucher;
	public String remark;
	
	
	public SalesInputVO(Warehouse warehouse, Double allowance, Double voucher, String remark) {
		super();
		this.warehouse = warehouse;
		this.allowance = allowance;
		this.voucher = voucher;
		this.remark = remark;
	}
	
	
}
