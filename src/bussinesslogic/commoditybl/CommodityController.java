package SIMSclient.src.bussinesslogic.commoditybl;

import SIMSclient.src.bussinesslogicservice.commodityblservice.CommodityBLService;
import SIMSclient.src.vo.ValueObject;
import SIMSclient.src.vo.commodity.CommodityVO;

public class CommodityController implements CommodityBLService{

	private static CommodityController commodityController = new CommodityController();
	public static CommodityController getInstance(){
		return commodityController;
	}

	public CommodityBLService getCommodityBLService(){
		return (CommodityBLService)commodityController;
	}

	@Override
	public void setID(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setModel(String model) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setClassification(String classification) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getClassification() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNumber(int number) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPurPrice(double purPrice) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getPurPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setRetailedPrice(double retailedPrice) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getRetailedPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setRecentPurPrice(double recentPurPrice) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getRecentPurPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setRecentRetailedPrice(double recentRetailedPrice) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getRecentRetailedPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setWarmingValue(int warmingValue) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getWarmingValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void insert(CommodityVO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delelte(CommodityVO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(CommodityVO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void find(CommodityVO vo) {
		// TODO Auto-generated method stub

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
	public void giftInventoryReceiptsMaking(ValueObject vo) {
	}

	@Override
	public void lossAndRevenueInventoryReceiptsMaking(ValueObject vo) {
	}

	@Override
	public void warningInventoryReceiptsMaking(ValueObject vo) {
	}

}
