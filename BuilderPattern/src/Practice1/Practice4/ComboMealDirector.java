package Practice4;

public class ComboMealDirector {
	
	ComboMealBuilder comboMealBuilder;
	
	ComboMealDirector(ComboMealBuilder comboMealBuilder){
		this.comboMealBuilder=comboMealBuilder;
	}
	
	public void buildMeal(){
		comboMealBuilder.createComboMeal();
		comboMealBuilder.setFries();
		comboMealBuilder.setBurger();
		comboMealBuilder.setCoke();
	}
	
	public ComboMeal getComboMeal(){
		return this.comboMealBuilder.getComboMeal();
	}
}
