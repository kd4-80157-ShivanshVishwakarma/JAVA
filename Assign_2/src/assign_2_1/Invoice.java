package assign_2_1;


public class Invoice{
	String partNum;
	String desc;
	int quant;
	double priceItem;
	
	public Invoice(String partNum, String desc, int quant, double priceItem) {
//		super();
		this.partNum = partNum;
		this.desc = desc;
		if(quant>0) {
			this.quant=quant;
		}
		if(priceItem>0) {
			this.priceItem=priceItem;
		}
	}
	public String getPartNum() {
		return partNum;
	}

	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

	public double getPriceItem() {
		return priceItem;
	}

	public void setPriceItem(double priceItem) {
		this.priceItem = priceItem;
	}
	public double getTotal() {
		double total=this.getPriceItem()*this.getQuant();
		return total;
	}
//	public void accept() {
//		System.out.println("Enter ");
//	}
//	public void display {
//			
//	}
//	public void calculateInv(){
//		
//	}
	
}

