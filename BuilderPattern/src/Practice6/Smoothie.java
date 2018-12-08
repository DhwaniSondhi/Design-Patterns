package Practice6;

public class Smoothie {
	
	private String flavor;
	private String milk;
	
	public String getFlavor(){
		return this.flavor;
	}
	public void setFlavor(String flavor){
		this.flavor=flavor;
	}
	public String getMilk(){
		return this.milk;
	}
	public void setMilk(String milk){
		this.milk=milk;
	}
	
	public String toString(){
		return "Milk: "+this.milk+"\nFlavor: "+this.flavor;
	}
}
