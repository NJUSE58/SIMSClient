package rmi;

import java.net.MalformedURLException;

import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

import dataservice.accountbilldataservice.PaymentBillDataService;
import dataservice.accountbilldataservice.ReceiptDataService;
import dataservice.accountbookdataservice.AccountBookDataService;
import dataservice.accountdataservice.AccountDataService;
import dataservice.billdataservice.BillDataService;
import dataservice.checktabledataservice.BusinessHistoryScheduleDataService;
import dataservice.checktabledataservice.SaleScheduleDataService;
import dataservice.checktabledataservice.StatementOfOperationDataService;
import dataservice.classificationdataservice.ClassificationDataService;
import dataservice.commoditydataservice.CommodityDataService;
import dataservice.memberdataservice.MemberDataService;
import dataservice.promotiondataservice.PromotionDataService;
import dataservice.salesdataservice.SalesDataService;
import dataservice.userdataservice.UserDataService;

/**
 *
 * @author Íõ²Ó²Ó
 * @version 2017-11-26
 *
 */

public class RemoteHelper {

	private Remote remote;

	private static RemoteHelper remoteHelper = new RemoteHelper();

	public static RemoteHelper getInstance(){
		return remoteHelper;

	}

	private RemoteHelper(){
	}

	public void setRemote(Remote remote){
		this.remote=remote;
	}

	public AccountDataService getAccountDataService(){
		return (AccountDataService)remote;
	}

	public BillDataService getBilldataService(){
		return (BillDataService)remote;
	}

	public BusinessHistoryScheduleDataService getbusinessHistoryScheduleDataService(){
		return (BusinessHistoryScheduleDataService)remote;
	}

	public SaleScheduleDataService getsaleScheduleDataService(){
		return (SaleScheduleDataService)remote;
	}

	public StatementOfOperationDataService getstatementOfOperationDataService(){
		return (StatementOfOperationDataService)remote;
	}

	public ClassificationDataService getClassificationDataService(){
		return (ClassificationDataService)remote;
	}

	public CommodityDataService getCommodityDataService(){
		return (CommodityDataService)remote;
	}

	public MemberDataService getMemeberDataService(){
		return (MemberDataService)remote;
	}

	public ReceiptDataService getReceiptDataService(){
		return (ReceiptDataService)remote;
	}

	public PaymentBillDataService getPaymentDataService(){
		return (PaymentBillDataService)remote;
	}

	public PromotionDataService getPromotionDataService(){
		return (PromotionDataService)remote;
	}

	public SalesDataService getSalesDataService(){
		return (SalesDataService)remote;
	}

	public AccountBookDataService getSetUpAccountDataService(){
		return (AccountBookDataService)remote;
	}

	public UserDataService getUserDataService(){
		return (UserDataService)remote;
	}
}
