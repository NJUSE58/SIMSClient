package presentation.mainui;


import java.rmi.RemoteException;

import bussiness_stub.UserBLService_Stub;
import bussinesslogic.userbl.UserController;
import bussinesslogicservice.userblservice.UserBLService;
import dataenum.UserRole;
import dataenum.findtype.FindUserType;
import presentation.financialstaffui.FinancialStaffUI;
import presentation.generalmanagerui.GeneralManagerUI;
import presentation.inventorymanagerui.InventoryManagerUI;
import presentation.salestockstaffui.SaleStockStaffUI;
import presentation.usermanagerui.UserManagerUI;
import vo.UserVO;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainUI extends Application{

	@FXML
	TextField username;
	@FXML
	PasswordField password;
	@FXML
	AnchorPane pane;

	@FXML
	public void enterButton(ActionEvent event) throws RemoteException{
		login();
	}

	@FXML
	public void enterKey(KeyEvent event) throws RemoteException{
		if(event.getCode()==KeyCode.ENTER)
			login();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		    Parent root = FXMLLoader.load(getClass().getResource("fxml/Login.fxml"));
	        Scene scene = new Scene(root);
	        primaryStage.setScene(scene);
	        primaryStage.setTitle("µÇÂ¼½çÃæ");
	        primaryStage.show();
	}

    public void login() throws RemoteException{
		    String id = username.getText();
		    String passWord = password.getText();

		    UserBLService service = new UserBLService_Stub();

		    if(service.login(id,passWord)){

		    	Platform.runLater(new Runnable() {
		    	                public void run() {
		    	                   try {
		    	   UserVO user = service.find(id, FindUserType.ID).get(0);
		    	   UserRole role = user.getRole();
		    	                      switch(role){
		    	                         case GENERAL_MANAGER:new GeneralManagerUI().start(user);break;
		    	                         case FINANCIAL_MANAGER:new FinancialStaffUI().start(user);break;
		    	                         case PUR_SALE_MANAGER: new SaleStockStaffUI().start(user);break;
		    	                         case INVENTORY_MANAGER: new InventoryManagerUI().start(user);break;
				                         case USER_MANAGER: new UserManagerUI().start(user);break;
		    	                      }
													} catch (Exception e) {
														e.printStackTrace();
													}
 	                                         }
 	                                  });
 	                       Stage stage = (Stage) pane.getScene().getWindow();
			              stage.close();
                	}
		     else{
		    	username.setText(null);
		    	password.setText(null);
		    	Platform.runLater(new Runnable() {
		    	    public void run() {
		    	        try {
							new RemindUI().start(new Stage());
						} catch (Exception e) {
							e.printStackTrace();
						}
		    	    }
		    	});

		    }

	}

    public void run(String[] args){
		launch(args);
	}

}
