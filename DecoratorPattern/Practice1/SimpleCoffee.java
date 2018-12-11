package Practice1;

public class SimpleCoffee extends Coffee  {

	@Override 
	public double getCost() {
		return 1.10;
	}
	@Override
	public String getIngredients() {
		return "Coffee";
	}
}
