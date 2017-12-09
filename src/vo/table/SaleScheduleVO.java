package vo.table;

public class SaleScheduleVO {
	//筛选条件
	String date;//时间,精确到天
	String tradeName;//商品名
	String customer;//客户
	int clerkID;//业务员
	String repertory;//仓库

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTradeName() {
		return tradeName;
	}

	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public int getClerkID() {
		return clerkID;
	}

	public void setClerkID(int clerkID) {
		this.clerkID = clerkID;
	}

	public String getRepertory() {
		return repertory;
	}

	public void setRepertory(String repertory) {
		this.repertory = repertory;
	}

	public SaleScheduleVO(String d,String t,String cu,int cl,String r){
		date=d;
		tradeName=t;
		customer=cu;
		clerkID=cl;
		repertory=r;
	}

}
