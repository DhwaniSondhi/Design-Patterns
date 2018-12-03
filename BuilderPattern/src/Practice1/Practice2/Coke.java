package Practice2;

public class Coke implements Item{

	private String name;
	//private String packing;
	private int price;
	
	
	Coke(/*String packing*/){
		this.name="Coke";
		//this.packing=packing;
		this.price=10;
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
