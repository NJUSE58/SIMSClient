package vo.purchase;

import java.util.ArrayList;



import dataenum.BillState;
import dataenum.BillType;
import dataenum.Warehouse;
import vo.ViewObject;
import vo.commodity.CommodityItemVO;

public class PurchaseVO extends ViewObject{

	private String supplier;  //供应商
	private Warehouse warehouse;
	private String warehouseString;
	private String operator;
	private ArrayList<CommodityItemVO> commodities;  //入库商品列表
	private Double sum;
	private String remark;
	private BillType type;
	private String typeString;
	private BillState state;
	private String stateString;



	public PurchaseVO(String id, String supplier, Warehouse warehouse, String operator,
			ArrayList<CommodityItemVO> commodities, String remark, Double sum, BillType type, BillState state) {
		super();
		this.id = id;
		this.supplier = supplier;
		this.warehouse = warehouse;
		this.operator = operator;
		this.commodities = commodities;
		this.sum = sum;
		this.remark = remark;
		this.type = type;
		this.state = state;
		warehouseString = warehouse.value;
		typeString = type.value;
		stateString = state.value;
	}

	public String getSupplier(){
		return supplier;
	}

	public Warehouse getWarehouse(){
		return warehouse;
	}

	public String getWarehouseString(){
		return warehouse.value;
	}

	public String getOperator(){
		return operator;
	}

	public ArrayList<CommodityItemVO> getCommodities(){
		return commodities;
	}

	public Double getSum(){
		return sum;
	}

	public String getRemark(){
		return remark;
	}

	public BillType getType(){
		return type;
	}

	public String getTypeString(){
		return type.value;
	}

	public BillState getState(){
		return state;
	}

	public String getStateString(){
		return state.value;
	}




}
