package presentation.inventorymanagerui;

import java.util.Stack;


import dataenum.Remind;
import presentation.common.ControlledStage;
import presentation.common.StageController;
import presentation.mainui.MainUI;
import vo.UserVO;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class InventoryManagerUI implements ControlledStage{
	public static final String mainID = "InventoryManagerUI";
	public static final String pack = "../inventorymanagerui/fxml/";
	public static final String mainFXML = pack+"InventoryManagerUI.fxml";
	static String previous;
	static String current;
	static Stack<String> stack;
	public static final Remind remind = Remind.COMMODITY;
	UserVO user;

	static StageController stageController;

	public void setStageController(StageController controller) {
        stageController = controller;
    }
	@FXML
	private AnchorPane pane;
	@FXML
	private ImageView image;


	@FXML
	public void returnLast(){
        stageController.setStage(previous,current);
        if(!stack.isEmpty()){
        stack.pop();
        current = previous;
        }
        if(stack.size()>1)
            previous = stack.lastElement();
	}

	@FXML
	public void mainPage() throws Exception{
      stageController.setStage(mainID, current);
      previous = current;
      current = mainID;
      stack.push(current);
    }

	@FXML
	public void fresh(){
		stageController.setStage(current, current);
	}


	@FXML
	public void message(){

	}

	@FXML
	public void logout(){
		Platform.runLater(new Runnable() {
            public void run() {
                try {
                   new MainUI().start(new Stage());
               } catch (Exception e) {
                       e.printStackTrace();
                    }
            }
       });
		Stage stage = (Stage) pane.getScene().getWindow();
	    stage.close();
	}

	@FXML
	public void classManage() throws Exception{
       new ClassificationManageUI().start();
	}

	@FXML
	public void commodityManage() throws Exception{

	}

	@FXML
	public void inventoryCheck() throws Exception{

	}

	@FXML
	public void inventoryStock() throws Exception{

	}

	@FXML
	public void makeReceipt() throws Exception{

	}



	public void start(UserVO user) throws Exception {


		stageController = new StageController();
        stack = new Stack<>();

        stageController.loadStage(mainID, mainFXML);

        stageController.setStage(mainID);
        previous = current = mainID;
        stack.push(mainID);
        this.user = user;
   //     this.image = user.getImage();

	}

	public void changeStage(String currentID,String fxml){
   		stageController.loadStage(currentID, pack+fxml);
   		stageController.setStage(currentID,current);
   		previous = current;
   		current = currentID;
   		stack.push(currentID);
	}

}
