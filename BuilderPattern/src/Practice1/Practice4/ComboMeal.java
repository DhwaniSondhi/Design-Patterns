package Practice4;

public class ComboMeal {
	
	private String frenchFries;
	private String burgerSize;
	private String coke;
	
	public String getFrenchFries(){
		return this.frenchFries;
	}
	public void setFrenchFries(String frenchFries){
		this.frenchFries=frenchFries;
	}
	public String getBurgerSize(){
		return this.burgerSize;
	}
	public void setBurgerSize(String burgerSize){
		this.burgerSize=burgerSize;
	}
	public String getCoke(){
		return this.coke;
	}
	public void setCoke(String coke){
		this.coke=coke;
	}
	
	public String toString(){
		return "Burger: "+this.getBurgerSize()+"\nCoke: "+this.getCoke()+"\nFries: "+this.getFrenchFries();
	}
}
