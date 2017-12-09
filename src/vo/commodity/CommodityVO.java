package vo.commodity;

public class CommodityVO {

		private String id;   //商品编号
		private String name;
		private String model; //商品型号
		private ClassificationVO classification;
		private String number; //商品数量
		private String purPrice; //进价
		private String retailedPrice; //零售价
		private String recentPurPrice; //最新进价
		private String recentRetailedPrice; //最新零售价
		private String warmingValue; //警戒值

		public void setID(String id){
			this.id = id;
		}

		public String getID(){
			return id;
		}

		public void setName(String name){
			this.name = name;
		}

		public String getName(){
			return name;
		}

	    public void setModel(String model){
	    	this.model = model;
	    }

		public String getModel(){
			return model;
		}

		public void setClassification(ClassificationVO classification){
			this.classification = classification;
		}

		public ClassificationVO getClassification(){
			return classification;
		}

		public void setNumber(String number){
			this.number = number;
		}

		public String getNumber(){
			return number;
		}

	    public void setPurPrice(String purPrice){
	    	this.purPrice = purPrice;
	    }

		public String getPurPrice(){
			return purPrice;
		}

		public void setRetailedPrice(String retailedPrice){
			this.retailedPrice = retailedPrice;
		}

		public String getRetailedPrice(){
			return retailedPrice;
		}

		public void setRecentPurPrice(String recentPurPrice){
			this.recentPurPrice = recentPurPrice;
		}

		public String getRecentPurPrice(){
			 return recentPurPrice;
		}

		public void setRecentRetailedPrice(String recentRetailedPrice){
			this.recentRetailedPrice = recentRetailedPrice;
		}

		public String getRecentRetailedPrice(){
			return recentRetailedPrice;
		}

		public void setWarmingValue(String warmingValue){
			this.warmingValue = warmingValue;
		}

		public String getWarmingValue(){
			return warmingValue;
		}




}
