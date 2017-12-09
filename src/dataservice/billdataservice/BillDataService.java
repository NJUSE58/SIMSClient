package SIMSclient.src.dataservice.billdataservice;

import java.util.Date;

import SIMSclient.src.dataenum.BillState;
import SIMSclient.src.dataenum.BillType;

public interface BillDataService {

	public Date getDate();
	public BillType getType();
	public BillState getState();

}
