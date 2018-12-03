package Practice2;

import java.util.ArrayList;

public class CokeMealBuilder extends MealBuilder {

	@Override
	public void addItem() {
		meal.addItems(new Coke());
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
