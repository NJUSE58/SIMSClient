package presentation.salestockstaffui.controller;

import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.ResourceBundle;

import bussiness_stub.MemberBLService_Stub;
import bussinesslogicservice.memberblservice.MemberBLService;
import dataenum.MemberCategory;
import dataenum.MemberLevel;
import dataenum.Remind;
import dataenum.ResultMessage;
import dataenum.findtype.FindMemberType;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;
import presentation.common.EditingCellChoice;
import presentation.remindui.RemindExistUI;
import presentation.remindui.RemindPrintUI;
import vo.UserVO;
import vo.member.MemberVO;

public class MemberManageController extends SaleStockStaffController implements Initializable {

       MemberBLService service = new MemberBLService_Stub();
		public static final Remind remind = Remind.MEMBER;
	    ObservableList<MemberVO> list = FXCollections.observableArrayList();
	    ObservableList<String> classList = FXCollections.observableArrayList(MemberCategory.RETAILER.value,MemberCategory.SUPPLIER.value,MemberCategory.BOTH.value);
	    ObservableList<String> levelList = FXCollections.observableArrayList(MemberLevel.LEVEL1.value,MemberLevel.LEVEL2.value,MemberLevel.LEVEL3.value,MemberLevel.LEVEL4.value,MemberLevel.LEVEL5.value);
        UserVO user;
	    @FXML
	    protected ChoiceBox<String> findChoice;
	    @FXML
	    protected TextField findingField;
	    @FXML
 	    protected Label idLabel;
	    @FXML
	    protected ChoiceBox<String> classChoice;
	    @FXML
	    protected ChoiceBox<String> levelChoice;
	    @FXML
        protected TextField nameField;
	    @FXML
        protected TextField phoneField;
	    @FXML
        protected TextField addressField;
	    @FXML
        protected TextField zipcodeField;
	    @FXML
        protected TextField emailField;
	    @FXML
        protected TextField amountField;
	    @FXML
        protected TextField receiveField;
	    @FXML
        protected TextField payField;
	    @FXML
	    protected Label operatorLabel;

		@FXML
		protected TableView<MemberVO> table;
		@FXML
		protected TableColumn<MemberVO,String> tableID;
		@FXML
		protected TableColumn<MemberVO,String> tableCategory;
		@FXML
		protected TableColumn<MemberVO,String> tableLevel;
		@FXML
		protected TableColumn<MemberVO,String> tableName;
		@FXML
		protected TableColumn<MemberVO,String> tablePhone;
		@FXML
		protected TableColumn<MemberVO,String> tableAddress;
		@FXML
		protected TableColumn<MemberVO,String> tableZipcode;
		@FXML
		protected TableColumn<MemberVO,String> tableEmail;
		@FXML
		protected TableColumn<MemberVO,String> tableAmount;
		@FXML
		protected TableColumn<MemberVO,String> tableReceive;
		@FXML
		protected TableColumn<MemberVO,String> tablePay;
		@FXML
		protected TableColumn<MemberVO,String> tableOperator;
		@FXML
		protected TableColumn<MemberVO,String> tableDelete;


		@FXML
		public void insert() throws RemoteException{
			 MemberVO vo = new MemberVO(idLabel.getText(),MemberCategory.getCategory(classChoice.getValue()),MemberLevel.getLevel(levelChoice.getValue()),
					 nameField.getText(), phoneField.getText(),addressField.getText(),zipcodeField.getText(),
					 emailField.getText(),amountField.getText(),receiveField.getText(),payField.getText(),
					 operatorLabel.getText());
		        ResultMessage message = service.insert(vo);
		        Platform.runLater(new Runnable() {
		    	    public void run() {
		    	        try {
		    	        switch(message){
		    	        case ILLEGALINPUTNAME:new RemindPrintUI().start(message);break;
		    	        case ILLEAGLINPUTDATA:new RemindPrintUI().start(message);break;
		    	        case EXISTED:new RemindExistUI().start(remind,true);break;
		    	        case SUCCESS:list.add(vo);table.setItems(list);break;
		    	        default:break;
		    	        }
						} catch (Exception e) {
							e.printStackTrace();
						}
		    	    }
		    	});
		}


		@FXML
		public void find() throws RemoteException{
			ArrayList<MemberVO> list = service.find(findingField.getText(),FindMemberType.getMemberType(findChoice.getValue()));
		       if(list==null){
		    	   Platform.runLater(new Runnable() {
			    	    public void run() {
			    	        try {
			    	        	new RemindPrintUI().start(ResultMessage.ILLEAGLINPUTDATA);
							} catch (Exception e) {
								e.printStackTrace();
							}
			    	    }
			    	});
		       }
		       else{
		    	   table.getItems().clear();
		    	   table.getItems().addAll(list);
		       }
		}

		@FXML
		public void fresh(){
			findingField.setText(null);
			list.clear();
			list.addAll(service.show());
			idLabel.setText(service.getId());
			classChoice.setValue(null);
			levelChoice.setValue(null);
			table.setItems(list);
			nameField.setText(null);
			phoneField.setText(null);
			addressField.setText(null);
			zipcodeField.setText(null);
			emailField.setText(null);
			amountField.setText(null);
			receiveField.setText(null);
			payField.setText(null);
		}

		@Override
		public void initialize(URL location, ResourceBundle resources) {
			fresh();
			edit();
			manageInit();

		}

		public void edit(){
	        Callback<TableColumn<MemberVO, String>,
		        TableCell<MemberVO, String>> choiceFactory
		            = (TableColumn<MemberVO, String> p) -> new EditingCellChoice<MemberVO>(levelList);

	        tableLevel.setCellFactory(choiceFactory);
	        tableLevel.setOnEditCommit(
	            (CellEditEvent<MemberVO, String> t) -> {
	                ((MemberVO) t.getTableView().getItems().get(
	                        t.getTablePosition().getRow())
	                        ).setLevel(t.getNewValue());
	               MemberVO vo = ((MemberVO) t.getTableView().getItems().get(
	                        t.getTablePosition().getRow())
	                        );
	                service.update(vo);
	        });


		}


		public void manageInit(){
			tableID.setCellValueFactory(
	                new PropertyValueFactory<MemberVO,String>("ID"));
			tableCategory.setCellValueFactory(
	                new PropertyValueFactory<MemberVO,String>("categoryString"));
			tableLevel.setCellValueFactory(
	                new PropertyValueFactory<MemberVO,String>("levelString"));
	        tableName.setCellValueFactory(
	                new PropertyValueFactory<MemberVO,String>("name"));
	        tablePhone.setCellValueFactory(
	                new PropertyValueFactory<MemberVO,String>("cellNumber"));
	        tableAddress.setCellValueFactory(
	                new PropertyValueFactory<MemberVO,String>("address"));
	        tableZipcode.setCellValueFactory(
	                new PropertyValueFactory<MemberVO,String>("post"));
	        tableEmail.setCellValueFactory(
	                new PropertyValueFactory<MemberVO,String>("email"));
	        tableAmount.setCellValueFactory(
	                new PropertyValueFactory<MemberVO,String>("receivableLimit"));
	        tableReceive.setCellValueFactory(
	                new PropertyValueFactory<MemberVO,String>("receivable"));
	        tablePay.setCellValueFactory(
	                new PropertyValueFactory<MemberVO,String>("payable"));
	        tableOperator.setCellValueFactory(
	                new PropertyValueFactory<MemberVO,String>("saleMan"));
	        deleteInit();
	        classChoice.setItems(classList);
	        levelChoice.setItems(levelList);
	        findChoice.setItems(FXCollections.observableArrayList(FindMemberType.ID.value,FindMemberType.NAME.value,
	        		FindMemberType.KIND.value,FindMemberType.ADDRESS.value,FindMemberType.EMAIL.value,FindMemberType.LEVEL.value,
	        		FindMemberType.PHONE.value,FindMemberType.POST.value,FindMemberType.PAYABLE.value,FindMemberType.RECEIVABLE.value,
	        		FindMemberType.RECEIVABLELIMIT.value,FindMemberType.SALESMAN.value));
		}

		public void deleteInit(){
			tableDelete.setCellFactory((col) -> {
	            TableCell<MemberVO, String> cell = new TableCell<MemberVO, String>() {

	                @Override
	                public void updateItem(String item, boolean empty) {
	                    super.updateItem(item, empty);
	                    this.setText(null);
	                    this.setGraphic(null);

	                    if (!empty) {
	                        Button delBtn = new Button("É¾³ý");
	                        this.setGraphic(delBtn);
	                        delBtn.setOnMouseClicked((me) -> {
	                        	MemberVO clickedUser = this.getTableView().getItems().get(this.getIndex());
	                            service.delete(clickedUser.getID());
	                            list.remove(clickedUser);
	                            table.setItems(list);
	                        });
	                    }
	                }

	            };
	            return cell;
	        });
		}

		public void initData(UserVO user) throws Exception {
			operatorLabel.setText(user.getName());
		}

}
