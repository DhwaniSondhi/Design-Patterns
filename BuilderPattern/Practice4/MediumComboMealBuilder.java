package Practice4;

public class MediumComboMealBuilder extends ComboMealBuilder {

	@Override
	public void setFries(){
		comboMeal.setFrenchFries("Medium French Fries");
	}
	
	@Override
	public void setCoke() {
		comboMeal.setCoke("Medium Coke");
	}
	
	@Override
	public void setBurger(){
		comboMeal.setBurgerSize("Burger with extra cheese and 1 chicken layer");
	}
}
