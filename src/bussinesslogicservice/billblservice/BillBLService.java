package bussinesslogicservice.billblservice;

import java.util.Date;

import dataenum.BillState;
import dataenum.BillType;

public interface BillBLService {

	public int getID();
	public Date getDate();
	public BillState getState();
	public BillType getType();
	public String getDescription();
}
