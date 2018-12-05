package Practice4;

public abstract class ComboMealBuilder {
	
	ComboMeal comboMeal;
	
	public void createComboMeal(){
		comboMeal=new ComboMeal();
	}
	
	public ComboMeal getComboMeal(){
		return this.comboMeal;
	}
	public abstract void setFries();
	public abstract void setCoke();
	public abstract void setBurger();
}
