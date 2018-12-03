package Practice2;

import java.util.ArrayList;

public class BurgerMealBuilder extends MealBuilder {

	@Override
	public void addItem() {
		meal.addItems(new Burger());
	}
	
	@Override
	public int toGetPrice() {
		return meal.getPrice();
	}
	
	@Override
	public ArrayList<Item> getItems(){
		return meal.checkItems();
	}
}
