package Practice2;

public class Burger implements Item{

	private String name;
	//private String packing;
	private int price;
	
	Burger(/*String packing*/){
		this.name="Burger";
		//this.packing=packing;
		this.price=20;
	}
	
	public String getName() {
		return this.name;
	}
	/*public String getPacking() {
		return this.packing;
	}*/
	public int getPrice() {
		return this.price;
	}
}

