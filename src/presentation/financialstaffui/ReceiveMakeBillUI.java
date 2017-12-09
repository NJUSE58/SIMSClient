package presentation.financialstaffui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ReceiveMakeBillUI extends MakeReceiptUI implements Initializable{

	@FXML
	Label idLabel;
	@FXML
	TextField memberField;
	@FXML
	TextField sumField;
	@FXML
	Label operatorLabel;

	@FXML
	TableView table;
	@FXML
	TableColumn tableAccount;
	@FXML
	TableColumn tableMoney;
	@FXML
	TableColumn tableDescription;

	@FXML
	TextField accountField;
	@FXML
	TextField moneyField;
	@FXML
	TextArea descriptionArea;

	@FXML
	public void insert(){

	}

	@FXML
	public void submit(){

	}

	@FXML
	public void save(){

	}

	@FXML
	public void checkBefore(){

	}

	public void start() throws Exception {
		   changeStage("ReceiveMakeBillUI","ReceiveMakeBillUI.fxml");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
        operatorLabel.setText(user.getName());
	}


}
