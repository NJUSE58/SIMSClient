package presentation.financialstaffui;

import java.net.URL;

import java.util.ArrayList;
import java.util.ResourceBundle;

import bussinesslogic.skdbl.SKDBL;
import bussinesslogicservice.mfdocblservice.skdblservice;
import dataenum.BillState;
import dataenum.BillType;
import dataenum.ResultMessage;
import dataenum.findtype.FindAccountType;
import presentation.common.EditingCell;
import presentation.remindui.RemindExistUI;
import presentation.remindui.RemindPrintUI;
import vo.AccountVO;
import vo.makefinancialdoc.EntryVO;
import vo.makefinancialdoc.PaymentBillVO;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;

public class PaymentMakeBillUI extends MakeReceiptUI{
	skdblservice service = SKDBL.getInstance().getSKDBLService();
	ObservableList<EntryVO> list = FXCollections.observableArrayList();
	@FXML
	Label idLabel;
	@FXML
	TextField accountField;
	@FXML
	TextField memberField;
	@FXML
	Label sumLabel;
	@FXML
	Label operatorLabel;

	@FXML
	TableView<EntryVO> table;
	@FXML
	TableColumn<EntryVO,String> tableItem;
	@FXML
	TableColumn<EntryVO,String> tableMoney;
	@FXML
	TableColumn<EntryVO,String> tableDescription;
	@FXML
	TableColumn<EntryVO,String> tableDelete;

	@FXML
	TextField itemField;
	@FXML
	TextField moneyField;
	@FXML
	TextArea descriptionArea;

	@FXML
	public void insert(){
		 EntryVO vo = new EntryVO(itemField.getText(), moneyField.getText(), descriptionArea.getText());
	        ResultMessage message = service;
	        Platform.runLater(new Runnable() {
	    	    public void run() {
	    	        try {
	    	        switch(message){
	    	        case ILLEGALINPUTNAME:new RemindPrintUI().start(message);break;
	    	        case ILLEAGLINPUTDATA:new RemindPrintUI().start(message);break;
	    	        case EXISTED:new RemindExistUI().start(remind,true);break;
	    	        case SUCCESS:list.add(vo);table.setItems(list);
	    	                     int result = Integer.parseInt(sumLabel.getText())+Integer.parseInt(moneyField.getText());
	    	                     sumLabel.setText(String.valueOf(result));break;
	    	        default:break;
	    	        }
					} catch (Exception e) {
						e.printStackTrace();
					}
	    	    }
	    	});
	}

	@FXML
	public void save(){
         PaymentBillVO vo = new PaymentBillVO(idLabel.getText(),operatorLabel.getText(),memberField.getText(),
        		            accountField.getText(),list,sumLabel.getText(),BillType.XJFYD,BillState.DRAFT);
	}

	@FXML
	public void cancel(){

	}

	@FXML
	public void fresh(){
		 accountField.setText(null);
         memberField.setText(null);
         itemField.setText(null);
         moneyField.setText(null);
         descriptionArea.setText(null);
	}

	@FXML
	public void checkBefore() throws Exception{
            new PaymentCheckBillUI().start();
	}

	public void start() throws Exception {
		   changeStage("PaymentMakeBillUI","PaymentMakeBillUI.fxml");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		idLabel.setText(service.);
		sumLabel.setText("0");
		fresh();
        operatorLabel.setText(user.getName());
	}

	public void edit(){
		Callback<TableColumn<EntryVO, String>,
            TableCell<EntryVO, String>> cellFactory
                = (TableColumn<EntryVO, String> p) -> new EditingCell<EntryVO>();

        tableItem.setCellFactory(cellFactory);
        tableItem.setOnEditCommit(
            (CellEditEvent<EntryVO, String> t) -> {
            	String tmp = t.getOldValue();
               ((EntryVO) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())
                        ).setEntryName(t.getNewValue());
               EntryVO newVO = ((EntryVO) t.getTableView().getItems().get(
                        t.getTablePosition().getRow()));
               if(update(newVO)){
                   ((EntryVO)t.getTableView().getItems().get(
  	                        t.getTablePosition().getRow())
  	                        ).setEntryName(tmp);
               }

        });

        tableMoney.setCellFactory(cellFactory);
        tableMoney.setOnEditCommit(
            (CellEditEvent<EntryVO, String> t) -> {
            	String tmp = t.getOldValue();
	               ((EntryVO) t.getTableView().getItems().get(
	                        t.getTablePosition().getRow())
	                        ).setTransferAmount(t.getNewValue());
	               EntryVO newVO = ((EntryVO) t.getTableView().getItems().get(
	                        t.getTablePosition().getRow()));
	               if(!update(newVO))
	                	  (t.getTableView().getItems().get(
	  	                        t.getTablePosition().getRow())
	  	                        ).setTransferAmount(tmp);
	               else{
	            	   String newTmp = newVO.getTransferAmount();
	            	   int result = Integer.parseInt(sumLabel.getText())-Integer.parseInt(tmp)+Integer.parseInt(newTmp);
	            	   sumLabel.setText(String.valueOf(result));
	               }
        });

        tableDescription.setCellFactory(cellFactory);
        tableDescription.setOnEditCommit(
            (CellEditEvent<EntryVO, String> t) -> {
            	String tmp = t.getOldValue();
	               ((EntryVO) t.getTableView().getItems().get(
	                        t.getTablePosition().getRow())
	                        ).setNote(t.getNewValue());
	               EntryVO newVO = ((EntryVO) t.getTableView().getItems().get(
	                        t.getTablePosition().getRow()));
	               if(!update(newVO))
	                	  (t.getTableView().getItems().get(
	  	                        t.getTablePosition().getRow())
	  	                        ).setNote(tmp);
        });
	}

	public boolean update(EntryVO vo){
		 ResultMessage message = service.;
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
		tableItem.setCellValueFactory(
                new PropertyValueFactory<EntryVO,String>("entryName"));
        tableMoney.setCellValueFactory(
                new PropertyValueFactory<EntryVO,String>("transferAmount"));
        tableDescription.setCellValueFactory(
                new PropertyValueFactory<EntryVO,String>("note"));
        deleteInit();
	}

	public void deleteInit(){
		tableDelete.setCellFactory((col) -> {
            TableCell<EntryVO, String> cell = new TableCell<EntryVO, String>() {

                @Override
                public void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty);
                    this.setText(null);
                    this.setGraphic(null);

                    if (!empty) {
                        Button delBtn = new Button("ɾ��");
                        this.setGraphic(delBtn);
                        delBtn.setOnMouseClicked((me) -> {
                        	EntryVO clickedItem = this.getTableView().getItems().get(this.getIndex());
                            list.remove(clickedItem);
                            table.setItems(list);
                            int tmp = Integer.parseInt(clickedItem.getTransferAmount());
                            int result = Integer.parseInt(sumLabel.getText())-tmp;
                            sumLabel.setText(String.valueOf(result));
                        });
                    }
                }

            };
            return cell;
        });
	}


}
