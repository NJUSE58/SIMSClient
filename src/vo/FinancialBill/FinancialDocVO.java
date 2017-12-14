package vo.FinancialBill;

import java.io.Serializable;

import dataenum.BillState;
import dataenum.BillType;
import vo.BillVO;


/**
 *
 * @author 王灿灿
 *@version 2017-12-2
 *
 */
@SuppressWarnings("serial")
public class FinancialDocVO extends BillVO implements Serializable {
	protected String docID;//单据编号
	protected String userID;//当前登录用户的ID
	protected String customerID;//客户ID

	public FinancialDocVO(String docID,String userID,String customerID,
			BillType billType,BillState billState){
		super(billType, billState);
		this.docID=docID;
		this.userID=userID;
		this.customerID=customerID;
		this.billType=billType;
		this.billState=billState;

	}

	public String getDocID() {
		return docID;
	}

	public void setDocID(String docID) {
		this.docID = docID;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}


	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}


	public BillType getBillType() {
		return billType;
	}

	public void setBillType(BillType billType) {
		this.billType = billType;
	}

	public BillState getBillState() {
		return billState;
	}

	public void setBillState(BillState billState) {
		this.billState = billState;
	}


}
