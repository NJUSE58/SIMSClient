package presentation.salestockstaffui.controller;

import java.net.URL;
import java.util.ResourceBundle;

import bussiness_stub.PurchaseBLService_Stub;
import bussinesslogic.purchasebl.PurchaseController;
import bussinesslogicservice.purchaseblservice.PurchaseBLService;
import dataenum.BillState;
import dataenum.BillType;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import vo.UserVO;
import vo.commodity.CommodityItemVO;
import vo.purchase.PurchaseVO;

public class PurchaseCheckBillController extends SaleStockStaffController implements Initializable {

	PurchaseBLService service = new PurchaseBLService_Stub();
	ObservableList<PurchaseVO> list = FXCollections.observableArrayList();
	ObservableList<CommodityItemVO> commodityList = FXCollections.observableArrayList();
	UserVO user;
	BillType type;

	@FXML
	TableView<PurchaseVO> table;
	@FXML
	TableColumn<PurchaseVO,String> tableID;
	@FXML
	TableColumn<PurchaseVO,String> tableType;
	@FXML
	TableColumn<PurchaseVO,String> tableMember;
	@FXML
	TableColumn<PurchaseVO,String> tableWarehouse;
	@FXML
	TableColumn<PurchaseVO,Double> tableSum;
	@FXML
	TableColumn<PurchaseVO,String> tableOperator;
	@FXML
	TableColumn<PurchaseVO,String> tableNote;
	@FXML
	TableColumn<PurchaseVO,String> tableList;
	@FXML
	TableColumn<PurchaseVO,String> tableState;
	@FXML
	TableColumn<PurchaseVO,String> tableSubmit;
	@FXML
	TableColumn<PurchaseVO,String> tableRedo;
	@FXML
	TableColumn<PurchaseVO,String> tableDelete;

	@FXML
	TableView<CommodityItemVO> commodity;
	@FXML
	TableColumn<CommodityItemVO,String> commodityID;
	@FXML
	TableColumn<CommodityItemVO,String> commodityName;
	@FXML
	TableColumn<CommodityItemVO,String> commodityModel;
	@FXML
	TableColumn<CommodityItemVO,Integer> commodityNumber;
	@FXML
	TableColumn<CommodityItemVO,Double> commodityPrice;
	@FXML
	TableColumn<CommodityItemVO,Double> commodityMoney;
	@FXML
	TableColumn<CommodityItemVO,String> commodityNote;

	@FXML
	public void makePurchaseBill() throws Exception{
         changeStage("PurchaseMakeBillUI",user,type,null,null);
	}

	public void initData(UserVO user,BillType type) {
		this.user = user;
		this.type = type;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		list.addAll(service.show());
		table.setItems(list);
		manageInit();
		listInit();
	}


	public void manageInit(){
		tableID.setCellValueFactory(
                new PropertyValueFactory<PurchaseVO,String>("id"));
		tableType.setCellValueFactory(
                new PropertyValueFactory<PurchaseVO,String>("type"));
		tableMember.setCellValueFactory(
                new PropertyValueFactory<PurchaseVO,String>("supplier"));
		tableWarehouse.setCellValueFactory(
                new PropertyValueFactory<PurchaseVO,String>("warehouse"));
		tableSum.setCellValueFactory(
                new PropertyValueFactory<PurchaseVO,Double>("sum"));
		tableOperator.setCellValueFactory(
                new PropertyValueFactory<PurchaseVO,String>("operator"));
		tableNote.setCellValueFactory(
                new PropertyValueFactory<PurchaseVO,String>("remark"));
		tableState.setCellValueFactory(
                new PropertyValueFactory<PurchaseVO,String>("state"));
		checkInit();
		submitInit();
		redoInit();
        deleteInit();
	}

	public void checkInit(){

		tableList.setCellFactory((col) -> {
            TableCell<PurchaseVO, String> cell = new TableCell<PurchaseVO, String>() {

                @Override
                public void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty);
                    this.setText(null);
                    this.setGraphic(null);

                    if (!empty) {
                        Button delBtn = new Button("查看商品列表");
                        this.setGraphic(delBtn);
                        delBtn.setOnMouseClicked((me) -> {
                        	PurchaseVO clickedItem = this.getTableView().getItems().get(this.getIndex());
                            commodityList.clear();
                            commodityList.addAll(clickedItem.commodities);
                            commodity.setItems(commodityList);

                        });
                    }
                }

            };
            return cell;
        });

	}

	public void submitInit(){

		tableSubmit.setCellFactory((col) -> {
            TableCell<PurchaseVO, String> cell = new TableCell<PurchaseVO, String>() {

                @Override
                public void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty);
                    this.setText(null);
                    this.setGraphic(null);
              for(int i=0;i< this.getTableView().getItems().size();i++){
                   BillState clickedState = this.getTableView().getItems().get(i).state;
                    if (!empty&&clickedState == BillState.DRAFT) {
                        Button delBtn = new Button("提交");
                        this.setGraphic(delBtn);
                        delBtn.setOnMouseClicked((me) -> {
                        	PurchaseVO clickedItem = this.getTableView().getItems().get(this.getIndex());
                            service.submit(clickedItem);
                        });
                    }
                  }
                }

            };
            return cell;
        });

	}

	public void redoInit(){

		tableRedo.setCellFactory((col) -> {
            TableCell<PurchaseVO, String> cell = new TableCell<PurchaseVO, String>() {

                @Override
                public void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty);
                    this.setText(null);
                    this.setGraphic(null);
                    for(int i=0;i< this.getTableView().getItems().size();i++){
                   BillState clickedState = this.getTableView().getItems().get(i).state;
                    if (!empty&&(clickedState == BillState.DRAFT||clickedState == BillState.FAIL)) {
                        Button delBtn = new Button("重做");
                        this.setGraphic(delBtn);
                        delBtn.setOnMouseClicked((me) -> {
                        	PurchaseVO clickedItem = this.getTableView().getItems().get(this.getIndex());
                            try {
								changeStage("PurchaseMakeBillUI",user,clickedItem.type,clickedItem,null);
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
                        });
                    }
                    }
                }

            };
            return cell;
        });


	}


	public void deleteInit(){
		tableDelete.setCellFactory((col) -> {
            TableCell<PurchaseVO, String> cell = new TableCell<PurchaseVO, String>() {

                @Override
                public void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty);
                    this.setText(null);
                    this.setGraphic(null);
                    for(int i=0;i< this.getTableView().getItems().size();i++){
                    BillState clickedState = this.getTableView().getItems().get(i).state;
                    if (!empty&&(clickedState == BillState.DRAFT||clickedState == BillState.FAIL)) {
                        Button delBtn = new Button("删除");
                        this.setGraphic(delBtn);
                        delBtn.setOnMouseClicked((me) -> {
                        	PurchaseVO clickedItem = this.getTableView().getItems().get(this.getIndex());
                            list.remove(clickedItem);
                            table.setItems(list);

                        });
                    }
                }
              }
            };
            return cell;
        });
	}

	public void listInit(){
		commodityID.setCellValueFactory(
                new PropertyValueFactory<CommodityItemVO,String>("id"));
		commodityName.setCellValueFactory(
                new PropertyValueFactory<CommodityItemVO,String>("name"));
		commodityModel.setCellValueFactory(
                new PropertyValueFactory<CommodityItemVO,String>("model"));
		commodityNumber.setCellValueFactory(
                new PropertyValueFactory<CommodityItemVO,Integer>("numder"));
		commodityPrice.setCellValueFactory(
                new PropertyValueFactory<CommodityItemVO,Double>("price"));
		commodityMoney.setCellValueFactory(
                new PropertyValueFactory<CommodityItemVO,Double>("total"));
		commodityNote.setCellValueFactory(
                new PropertyValueFactory<CommodityItemVO,String>("remark"));
	}


}
