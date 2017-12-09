package vo;

public class AccountBookVO {
	String date;
	String clerkID;

	public AccountBookVO(String d, String c) {
		date = d;
		clerkID = c;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getClerkID() {
		return clerkID;
	}

	public void setClerkID(String clerkID) {
		this.clerkID = clerkID;
	}
}
