package Practice2;

public class BuilderDriver {

	public static void main(String[] args) {
		BurgerMealBuilder burgerMealBuilder=new BurgerMealBuilder();
		CokeMealBuilder cokeMealBuilder=new CokeMealBuilder();
		BurgerCokeMealBuilder burgerCokeMealBuilder=new BurgerCokeMealBuilder();
		
		
		Explorer explorer=new Explorer();
		explorer.setMealBuilder(burgerCokeMealBuilder);
		explorer.makeMeal();
		System.out.println(explorer.getMealDetails());
		
	}
}
