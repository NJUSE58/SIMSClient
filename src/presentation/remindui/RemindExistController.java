package presentation.remindui;

import dataenum.Remind;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class RemindExistController {

	@FXML
	Button button;
	@FXML
	AnchorPane pane;
	@FXML
	Label info;

	@FXML
	public void confirm(){
	   exit();
	}

	@FXML
	public void exitKey(KeyEvent event){
		if(event.getCode()==KeyCode.ENTER)
			exit();
	}

	public void exit(){
		Stage stage = (Stage) button.getScene().getWindow();
	    stage.close();
	}

	public void initData(Remind remind,Boolean isExist) {
		String isOrNot = isExist?"已":"不";
		info.setText("		该"+remind.value+isOrNot+"存在");

	}
}
