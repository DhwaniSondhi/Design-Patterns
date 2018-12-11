package Practice1;

public class Sprinkles extends CoffeeDecorator{

	protected Sprinkles(Coffee coffee) {super(coffee);}
	@Override 
	public double getCost() {
		return super.getCost()+0.50;
	}
	@Override 
	public String getIngredients() {
		return super.getIngredients()+" + Sprinkles";
	}
}
