package presentation.financialstaffui;

import java.net.URL;

import java.util.ResourceBundle;

import dataenum.TableType;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;

public class ViewTableUI extends FinancialStaffUI implements Initializable{

	@FXML
	ChoiceBox<String> tableChoice;

	@FXML
	public void chooseTable(){
        TableType type = TableType.getType(tableChoice.getValue());

        switch(type){
        case BUSINESS_HISTORY_SCHEDULE:
        case SALE_SCHEDULE:
        case STATEMENT_OF_OPERATION:
        default:break;
        }
	}

	public void start() throws Exception {
		   changeStage("ViewTableUI","ViewTableUI.fxml");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		tableChoice.setItems(FXCollections.observableArrayList(TableType.BUSINESS_HISTORY_SCHEDULE.value,TableType.SALE_SCHEDULE.value,TableType.STATEMENT_OF_OPERATION.value));

	}

}
