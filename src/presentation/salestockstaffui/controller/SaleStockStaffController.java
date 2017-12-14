package presentation.salestockstaffui.controller;

import java.util.Stack;

import dataenum.BillType;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import presentation.common.StageController;
import presentation.mainui.MainUI;
import presentation.salestockstaffui.MakeReceiptUI;
import presentation.salestockstaffui.MemberManageUI;
import presentation.salestockstaffui.PurchaseCheckBillUI;
import presentation.salestockstaffui.PurchaseMakeBillUI;
import presentation.salestockstaffui.SaleStockStaffUI;
import vo.UserVO;
import vo.purchase.PurchaseVO;
import vo.sale.SalesVO;

public class SaleStockStaffController {


	public static final String mainID = "SaleStockStaffUI";
	static String previous;
	static String current;
	static Stack<String> stack;
	UserVO user;
	BillType type;

	@FXML
	protected AnchorPane pane;
	@FXML
	private ImageView image;


	@FXML
	public void returnLast() throws Exception{
        startUI(previous,user,null,null,null);
        if(!stack.isEmpty()){
        stack.pop();
        current = previous;
        }
        if(stack.size()>1)
            previous = stack.lastElement();
	}

	@FXML
	public void mainPage() throws Exception{
		changeStage(mainID,user,type,null,null);

    }

	@FXML
	public void fresh() throws Exception{
		startUI(current,user,type,null,null);
	}


	@FXML
	public void message() throws Exception{

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
	public void memberManage() throws Exception{
         changeStage("MemberManageUI",user,type,null,null);
	}

	@FXML
	public void makeReceipt() throws Exception{
		 changeStage("MakeReceiptUI",user,type,null,null);
	}


	public void initData(UserVO user) throws Exception {
        stack = new Stack<>();
        previous = current = mainID;
        stack.push(mainID);
        this.user = user;
     //   image = user.getImage();
	}


	public void changeStage(String currentID,UserVO user,BillType type,PurchaseVO purchase,SalesVO sales) throws Exception{

   	    startUI(currentID,user,type,purchase,sales);
	    previous = current;
	    current = currentID;
	    stack.push(current);
	}

	public void startUI(String currentID,UserVO user,BillType type,PurchaseVO purchase,SalesVO sales){
	    Stage stage = (Stage) pane.getScene().getWindow();
	    stage.close();
			Platform.runLater(new Runnable() {
            public void run() {
                try {
                   switch(currentID){
   		            case mainID:new SaleStockStaffUI().start(user);break;
   		            case "MemberManageUI":new MemberManageUI().start(user);break;
   		            case "MakeReceiptUI":new MakeReceiptUI().start(user);break;
   		            case "PurchaseMakeBillUI":new PurchaseMakeBillUI().start(user,type,purchase);break;
   		            case "PurchaseCheckBillUI":new PurchaseCheckBillUI().start(user,type);break;
   		           }
               } catch (Exception e) {
                       e.printStackTrace();
                    }
            }
       });

	}



}
