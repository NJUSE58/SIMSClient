package presentation.financialstaffui;

import java.util.Stack;
import presentation.common.ControlledStage;
import presentation.common.StageController;
import presentation.mainui.MainUI;
import vo.UserVO;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class FinancialStaffUI implements ControlledStage{

	public static final String mainID = "FinancialStaffUI";
	public static final String pack = "../financialstaffui/fxml/";
	public static final String mainFXML = pack+"FinancialStaffUI.fxml";
	static String previous;
	static String current;
	static Stack<String> stack;
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
        if(stack.size()>=1)
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
	public void message(){

	}

	@FXML
	public void fresh(){
		stageController.setStage(current, current);
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
	public void accountManage() throws Exception{
		new AccountManageUI().start();
	}
	@FXML
	public void makeReceipt() throws Exception{
		new MakeReceiptUI().start();
	}
	@FXML
	public void viewTable() throws Exception{
		new ViewTableUI().start();
	}
	@FXML
	public void initAccount() throws Exception{
		new InitAccountUI().start();
	}

	public void start(UserVO user) throws Exception {


		stageController = new StageController();
        stack = new Stack<>();

        stageController.loadStage(mainID, mainFXML);

        stageController.setStage(mainID);
        previous = current = mainID;
        stack.push(mainID);
        this.user = user;
     //   this.image = user.getImage();

	}

	public void changeStage(String currentID,String fxml){
   		stageController.loadStage(currentID, pack+fxml);
   		stageController.setStage(currentID,current);
   		previous = current;
   		current = currentID;
   		stack.push(currentID);
	}


}
