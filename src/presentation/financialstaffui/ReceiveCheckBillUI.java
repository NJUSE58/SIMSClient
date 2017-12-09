package presentation.financialstaffui;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ReceiveCheckBillUI extends MakeReceiptUI{

	@FXML
	TableView table;
	@FXML
	TableColumn tableID;
	@FXML
	TableColumn tableMember;
	@FXML
	TableColumn tableSum;
	@FXML
	TableColumn tableOperator;
	@FXML
	TableColumn tableCheck;
	@FXML
	TableColumn tableState;
	@FXML
	TableColumn tableSubmit;
	@FXML
	TableColumn tableRedo;
	@FXML
	TableColumn tableDelete;


	@FXML
	TableView accountList;
	@FXML
	TableColumn tableAccount;
	@FXML
	TableColumn tableMoney;
	@FXML
	TableColumn tableDescription;


	@FXML
	public void makeReceiveBill(){

	}

	@FXML
	public void submit(){

	}

	public void start() throws Exception {
		   changeStage("ReceiveCheckBillUI","ReceiveCheckBillUI.fxml");
	}

}
