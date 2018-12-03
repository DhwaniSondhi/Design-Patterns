package Practice2;
import java.util.ArrayList;

public abstract class MealBuilder {
	
	protected Meal meal;
	
	public void createMeal(){
		meal=new Meal();
	}
	public Meal getMeal() {
		return meal;
	}
	
	public abstract void addItem();
	public abstract int toGetPrice();
	public abstract ArrayList<Item> getItems();
	
}
