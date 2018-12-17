package Practice1;

public class Espresso extends Coffee {

	@Override 
	public double getCost() {
		return 1.25;
	}
	@Override
	public String getIngredients() {
		return "Strong Coffee";
	}
}
