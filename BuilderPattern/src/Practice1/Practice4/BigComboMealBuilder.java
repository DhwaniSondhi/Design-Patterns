package Practice4;

public class BigComboMealBuilder extends ComboMealBuilder {
	
	@Override
	public void setFries(){
		comboMeal.setFrenchFries("Large French Fries");
	}
	
	@Override
	public void setCoke() {
		comboMeal.setCoke("Large Coke");
	}
	
	@Override
	public void setBurger(){
		comboMeal.setBurgerSize("Burger with extra cheese and 2 chicken layers");
	}
}
