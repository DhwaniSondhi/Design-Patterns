package Practice4;

public class SmallComboMealBuilder extends ComboMealBuilder {
	
	@Override
	public void setFries(){
		comboMeal.setFrenchFries("Small French Fries");
	}
	
	@Override
	public void setCoke() {
		comboMeal.setCoke("Regular Coke");
	}
	
	@Override
	public void setBurger(){
		comboMeal.setBurgerSize("Burger with 1 chicken layer");
	}
}
