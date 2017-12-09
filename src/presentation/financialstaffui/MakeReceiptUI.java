package presentation.financialstaffui;

import java.net.URL;

import java.util.ResourceBundle;

import dataenum.BillType;
import dataenum.Remind;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;

public class MakeReceiptUI extends FinancialStaffUI implements Initializable{

	public static final Remind remind = Remind.BILL;
	@FXML
	ChoiceBox<String> receiptChoice;
	@FXML
	public void chooseReceipt() throws Exception{
		BillType type = BillType.getType(receiptChoice.getValue());
		switch(type){
		case SKD:new ReceiveMakeBillUI().start();break;
		case XJFYD:new PaymentMakeBillUI().start();break;
		default:break;
		}
	}

	public void start() throws Exception {
		   changeStage("MakeReceiptUI","MakeReceiptUI.fxml");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		receiptChoice.setItems(FXCollections.observableArrayList(BillType.SKD.value,BillType.XJFYD.value));
	}

}
