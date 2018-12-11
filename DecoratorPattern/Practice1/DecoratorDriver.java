package Practice1;

public class DecoratorDriver {

	public static void main(String[] args) {
		
		Coffee espresso=new Espresso();
		System.out.println("Espresso"+"\nCost: "+espresso.getCost()+"\nIngredients: "+espresso.getIngredients());
		espresso=new Milk(espresso);
		System.out.println("Espresso with Milk"+"\nCost: "+espresso.getCost()+"\nIngredients: "+espresso.getIngredients());
		espresso=new Sprinkles(espresso);
		System.out.println("Espresso with Sprinkles"+"\nCost: "+espresso.getCost()+"\nIngredients: "+espresso.getIngredients());

		Coffee simpleCoffee=new SimpleCoffee();
		System.out.println("SimpleCoffee"+"\nCost: "+simpleCoffee.getCost()+"\nIngredients: "+simpleCoffee.getIngredients());
		simpleCoffee=new Milk(simpleCoffee);
		System.out.println("SimpleCoffee with Milk"+"\nCost: "+simpleCoffee.getCost()+"\nIngredients: "+simpleCoffee.getIngredients());
		simpleCoffee=new Sprinkles(simpleCoffee);
		System.out.println("SimpleCoffee with Sprinkles"+"\nCost: "+simpleCoffee.getCost()+"\nIngredients: "+simpleCoffee.getIngredients());
	}
}
