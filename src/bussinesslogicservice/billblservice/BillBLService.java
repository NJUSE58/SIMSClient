package SIMSclient.src.bussinesslogicservice.billblservice;

import java.util.Date;

import SIMSclient.src.dataenum.BillState;
import SIMSclient.src.dataenum.BillType;

public interface BillBLService {

	public int getID();
	public Date getDate();
	public BillState getState();
	public BillType getType();
	public String getDescription();
}
