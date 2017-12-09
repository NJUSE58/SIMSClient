package presentation.remindui;

import dataenum.ResultMessage;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class RemindPrintUI {

	public void start(ResultMessage message) throws Exception {
		    FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/RemindPrintUI.fxml"));
	        Stage primaryStage = new Stage();
	        primaryStage.setScene( new Scene((Pane) loader.load()));
	        RemindPrintController controller = loader.<RemindPrintController>getController();
	        controller.initData(message);
	        primaryStage.show();
	}




}
