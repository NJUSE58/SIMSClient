package presentation.usermanagerui.controller;

import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.ResourceBundle;

import bussiness_stub.UserBLService_Stub;
import bussinesslogic.userbl.UserController;
import bussinesslogicservice.userblservice.UserBLService;
import dataenum.Remind;
import dataenum.ResultMessage;
import dataenum.UserRole;
import dataenum.findtype.FindUserType;
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
import presentation.common.EditingCell;
import presentation.common.EditingCellChoice;
import presentation.remindui.RemindExistUI;
import presentation.remindui.RemindPrintUI;
import vo.UserVO;

public class UserManagingController extends UserManagerController implements Initializable{

	 UserBLService service = new UserController();
		public static final Remind remind = Remind.USER;
	    ObservableList<UserVO> list = FXCollections.observableArrayList();
	    ObservableList<String> roleList = FXCollections.observableArrayList(UserRole.GENERAL_MANAGER.value,
             UserRole.FINANCIAL_MANAGER.value,
             UserRole.INVENTORY_MANAGER.value,
             UserRole.PUR_SALE_MANAGER.value,
             UserRole.USER_MANAGER.value);
	    @FXML
	    protected TextField idField;
	    @FXML
     protected TextField nameField;
	    @FXML
     protected TextField passwordField;
	    @FXML
	    protected TextField findingField;
	    @FXML
     protected ChoiceBox<String> roleChoice;
	    @FXML
	    protected ChoiceBox<String> findChoice;
 	@FXML
 	protected Label idLabel;


		@FXML
		protected TableView<UserVO> table;
		@FXML
		protected TableColumn<UserVO,String> tableID;
		@FXML
		protected TableColumn<UserVO,String> tablePassword;
		@FXML
		protected TableColumn<UserVO,String> tableName;
		@FXML
		protected TableColumn<UserVO,String> tableRole;
		@FXML
		protected TableColumn<UserVO,String> tableDelete;


		@FXML
		public void insert() throws RemoteException{
			 UserVO vo = new UserVO(idLabel.getText(), nameField.getText(), passwordField.getText(),UserRole.getRole(roleChoice.getValue()), image);
		        ResultMessage message = service.insert(vo);
		        Platform.runLater(new Runnable() {
		    	    public void run() {
		    	        try {
		    	        switch(message){
		    	        case ILLEGALINPUTNAME:new RemindPrintUI().start(message);break;
		    	        case ILLEAGLINPUTDATA:new RemindPrintUI().start(message);break;
		    	        case EXISTED:new RemindExistUI().start(remind,true);break;
		    	        case SUCCESS:list.add(vo);table.setItems(list);addID();break;
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
			ArrayList<UserVO> list = service.find(findingField.getText(),FindUserType.getType(findChoice.getValue()));
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
			try {
				list.addAll(service.getUserList());
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			table.setItems(list);
			nameField.setText("admin");
			passwordField.setText("admin");
			addID();
		}

		@Override
		public void initialize(URL location, ResourceBundle resources) {
			fresh();
			edit();
			manageInit();

		}

		public void edit(){
			Callback<TableColumn<UserVO, String>,
	            TableCell<UserVO, String>> cellFactory
	                = (TableColumn<UserVO, String> p) -> new EditingCell<UserVO>();
	        Callback<TableColumn<UserVO, String>,
		        TableCell<UserVO, String>> choiceFactory
		            = (TableColumn<UserVO, String> p) -> new EditingCellChoice<UserVO>(roleList);

	        tableName.setCellFactory(cellFactory);
	        tableName.setOnEditCommit(
	            (CellEditEvent<UserVO, String> t) -> {
	            	String tmp = t.getOldValue();
	               ((UserVO) t.getTableView().getItems().get(
	                        t.getTablePosition().getRow())
	                        ).setName(t.getNewValue());
	                UserVO newVO = ((UserVO) t.getTableView().getItems().get(
	                        t.getTablePosition().getRow()));
	               try {
					if(update(newVO)){
					       ((UserVO)t.getTableView().getItems().get(
					                t.getTablePosition().getRow())
					                ).setName(tmp);
					   }
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	        });

	        tablePassword.setCellFactory(cellFactory);
	        tablePassword.setOnEditCommit(
	            (CellEditEvent<UserVO, String> t) -> {
	            	String tmp = t.getOldValue();
		               ((UserVO) t.getTableView().getItems().get(
		                        t.getTablePosition().getRow())
		                        ).setPassword(t.getNewValue());
		                UserVO newVO = ((UserVO) t.getTableView().getItems().get(
		                        t.getTablePosition().getRow()));
		               try {
						if(!update(newVO))
						    	  (t.getTableView().getItems().get(
						                t.getTablePosition().getRow())
						                ).setPassword(tmp);
					} catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	        });

	        tableRole.setCellFactory(choiceFactory);
	        tableRole.setOnEditCommit(
	            (CellEditEvent<UserVO, String> t) -> {
	                ((UserVO) t.getTableView().getItems().get(
	                        t.getTablePosition().getRow())
	                        ).setRole(t.getNewValue());
	                UserVO newVO = ((UserVO) t.getTableView().getItems().get(
	                        t.getTablePosition().getRow()));
	                try {
						service.update(newVO);
					} catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	        });


		}

		public boolean update(UserVO vo) throws RemoteException{
			 ResultMessage message = service.update(vo);
			 Boolean result = message == ResultMessage.SUCCESS?true:false;
		        Platform.runLater(new Runnable() {
		    	    public void run() {
		    	        try {
		    	        switch(message){
		    	        case ILLEGALINPUTNAME:new RemindPrintUI().start(message);break;
		    	        case ILLEAGLINPUTDATA:new RemindPrintUI().start(message);break;
		    	        case SUCCESS:break;
		    	        default:break;
		    	        }
						} catch (Exception e) {
							e.printStackTrace();
						}
		    	    }
		    	});
		     return result;
		}

		public void manageInit(){
			tableID.setCellValueFactory(
	                new PropertyValueFactory<UserVO,String>("ID"));
	        tableName.setCellValueFactory(
	                new PropertyValueFactory<UserVO,String>("name"));
	        tablePassword.setCellValueFactory(
	                new PropertyValueFactory<UserVO,String>("password"));
	        tableRole.setCellValueFactory(
	                new PropertyValueFactory<UserVO,String>("roleName"));
	        deleteInit();
	        roleChoice.setItems(roleList);
	        findChoice.setItems(FXCollections.observableArrayList(FindUserType.ID.value,FindUserType.NAME.value,FindUserType.USERROLE.value));
		}

		public void deleteInit(){
			tableDelete.setCellFactory((col) -> {
	            TableCell<UserVO, String> cell = new TableCell<UserVO, String>() {

	                @Override
	                public void updateItem(String item, boolean empty) {
	                    super.updateItem(item, empty);
	                    this.setText(null);
	                    this.setGraphic(null);

	                    if (!empty) {
	                        Button delBtn = new Button("删除");
	                        this.setGraphic(delBtn);
	                        delBtn.setOnMouseClicked((me) -> {
	                            UserVO clickedUser = this.getTableView().getItems().get(this.getIndex());
	                            try {
									service.delete(clickedUser);
								} catch (RemoteException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
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
			  this.user = user;
		}

     public void addID(){
     	if(!list.isEmpty()){
		       String initID = addOne(list.get(list.size()-1).getID());
	           idLabel.setText(initID);
	        }else{
	           idLabel.setText("0000001");
	        }
     }

		/**
		 * 自动生成新id
		 * @param id
		 * @return 新id
		 */
		public String addOne(String id){
			int tmp = Integer.parseInt(id);
			int n = id.length();
			tmp++;
			String newID = String.valueOf(tmp);
			while(newID.length()<n)
				newID = "0"+newID;
			return newID;
		}



}
