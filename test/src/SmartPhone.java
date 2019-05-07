public class SmartPhone {
	

//field 

	private String maker;
	private String name;
	private int price;
	private int discountRate;


//명시적 Constructor
	public SmartPhone(String name, String maker , int price){
		//super();
		this.maker = maker;
		this.name = name;
		this.price = price;

	}

	public SmartPhone(String name, String maker, int price, int discountRate){
		//super();
		this.maker = maker;
		this.name = name;
		this.price = price;
		this.discountRate = discountRate;
	}


//method
	public int calculateDiscount(){
			
		return (int)(price * (1.0 - (double) discountRate /100));
		
	}

	@Override
	public String toString(){
		String str = name + "[" + maker + "]" + " \n가격 : " + price; 
			if(discountRate != 0 ) str += "\n할인가격 : " + calculateDiscount(); 
				str += "\n-----------------";
		return str;
	}
}
