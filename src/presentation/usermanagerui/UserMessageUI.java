package presentation.usermanagerui;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class UserMessageUI extends UserManagerUI implements Initializable{

	@FXML
	TableView<String> messageTable;
	@FXML
	TableColumn<String,String> messageList;

	public void start() throws Exception {
		   changeStage("UserMessageUI","UserMessageUI.fxml");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		messageTable.setItems(FXCollections.observableArrayList("chocolate", "salmon", "gold", "coral", "darkorchid",
	            "darkgoldenrod", "lightsalmon", "black", "rosybrown", "blue",
	            "blueviolet", "brown"));
		System.out.println();
	}


}
