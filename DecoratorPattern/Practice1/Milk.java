package Practice1;

public class Milk extends CoffeeDecorator{

	protected Milk(Coffee coffee) {super(coffee);}
	@Override 
	public double getCost() {
		return super.getCost()+1;
	}
	@Override 
	public String getIngredients() {
		return super.getIngredients()+" + Milk";
	}
}
