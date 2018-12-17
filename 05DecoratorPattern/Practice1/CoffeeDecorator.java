package Practice1;

public abstract class CoffeeDecorator extends Coffee {

	protected final Coffee coffee;
	protected CoffeeDecorator(Coffee coffee) {this.coffee=coffee;}
	public double getCost() {
		return coffee.getCost();
	}
	public String getIngredients() {
		return coffee.getIngredients();
	}

}
