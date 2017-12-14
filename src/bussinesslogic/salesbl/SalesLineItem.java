package bussinesslogic.salesbl;

import java.rmi.RemoteException;

import bussinesslogic.commoditybl.Info.CommodityInfo;
import bussinesslogicservice.salesblservice.Sale_CommodityInfo;

/*
 * 销售单的出货商品清单的细列项目
 * 销售单通过审批后，系统自动更改客户的应收应付和库存数据
 * 编号,
 * 名称（从商品选择界面选择）,
 * 型号,
 * 数量（手工输入）,
 * 单价（默认为商品信息里的销售价，可修改）,
 * 金额（自动生成），商品备注
 */
public class SalesLineItem {

	private String id;
	private String name;
	private String model;  //商品型号
	private int number;  //商品数量
	private double price;
	private double sum;  //总额
	private String remark;  //备注
	private Sale_CommodityInfo info;
	
	public SalesLineItem() {
		
	}

	/**
	 * @param id
	 * @param name
	 * @param model
	 * @param numbers
	 * @param price
	 * @param sum
	 * @param remark
	 */
	public SalesLineItem(String id, int number, double price, String remark) throws RemoteException {
		super();
		info = new CommodityInfo();
		this.id = id;
		this.name = info.getName(id);
		this.model = info.getModel(id);
		this.number = number;
		this.price = price;
		this.sum = number * price;
		this.remark = remark;
		info.setDelete(id, false);
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getModel() {
		return model;
	}

	public int getNumber() {
		return number;
	}

	public double getPrice() {
		return price;
	}

	public double getSum() {
		return sum;
	}

	public String getRemark() {
		return remark;
	}
	
	
}
