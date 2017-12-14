package bussinesslogic.utilitybl;

import java.util.ArrayList;

import bussinesslogicservice.utilityblservice.UtilityBLService;

public class UtilityBL implements UtilityBLService{

	private static UtilityBL utilityBL = new UtilityBL();
	public static UtilityBL getInstance(){
		return utilityBL;
	}

	public UtilityBLService getUtilityBLService(){
		return (UtilityBLService)utilityBL;
	}

	@Override
	public boolean isPrintLegal(ArrayList<String> list) {
		return false;
	}

}
