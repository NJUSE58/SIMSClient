package bussinesslogic.salesbl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import bussinesslogicservice.salesblservice.SalesBLService;
import bussinesslogicservice.salesblservice.SalesShowService;
import dataenum.ResultMessage;
import po.sales.SalesPO;
import vo.PromotionVO;
import vo.commodity.CommodityItemVO;
import vo.commodity.CommodityVO;
import vo.member.MemberVO;
import vo.promotion.PromotionMemberVO;
import vo.promotion.PromotionPricePacksVO;
import vo.promotion.PromotionTotalVO;
import vo.sale.SalesInputVO;
import vo.sale.SalesVO;

/*
 * 负责实现销售界面所需要的服务
 */
public class SalesController implements SalesBLService, SalesShowService{

	private Sales sale;
	private SaleShow saleshow;
	
	public SalesController() {
		sale = new Sales();
		saleshow = new SaleShow();
	}

	@Override
	public String getSaleID() {
		try {
			return sale.getSaleID();
		} catch (RemoteException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public String getBackSaleID() {
		try {
			return sale.getSaleBackID();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public SalesPO createSale() {
		try {
			return sale.createSale();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void addCommodities(CommodityItemVO item) {
		try {
			sale.addCommodities(item);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<PromotionPricePacksVO> showPricePacks() {
		try {
			return sale.showPricePacks();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void addPricePacks(String id) {
		try {
			sale.addPricePacks(id);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<PromotionTotalVO> FindTotalPromotion() {
		try {
			return sale.FindTotalPromotion();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<PromotionMemberVO> FindMemberPromotion() {
		try {
			return sale.FindMemberPromotion();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public double setPromotion(String id) {
		try {
			return sale.setPromotion(id);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public void addMembers(String id) {
		try {
			sale.addMembers(id);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	@Override
	public SalesVO submit(SalesInputVO Info) {
		try {
			return sale.save(Info);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public SalesVO save(SalesInputVO Info) {
		try {
			return sale.save(Info);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ResultMessage updateDraft(SalesVO vo) {
		try {
			return sale.updateDraft(vo);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ResultMessage submitDraft(String id) {
		try {
			return sale.submitDraft(id);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<SalesVO> showSale() {
		try {
			return saleshow.showAllSaleBill();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<SalesVO> showSaleBack() {
		try {
			return saleshow.showAllSaleBackBill();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<SalesVO> showSaleCommited() {
		try {
			return saleshow.showSaleCommited();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<SalesVO> showSaleBackCommited() {
		try {
			return saleshow.showSaleBackCommited();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<SalesVO> showSaleSuccess() {
		try {
			return saleshow.showSaleSuccess();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<SalesVO> showSaleBackSuccess() {
		try {
			return saleshow.showSaleBackSuccess();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<SalesVO> showSaleFail() {
		try {
			return saleshow.showSaleFail();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<SalesVO> showSaleBackFail() {
		try {
			return saleshow.showSaleBackFail();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<SalesVO> showSaleDraft() {
		try {
			return saleshow.showSaleDraft();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<SalesVO> showSaleBackDraft() {
		try {
			return saleshow.showSaleBackDraft();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	
	
}
