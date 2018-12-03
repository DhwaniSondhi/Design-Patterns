package Practice2;

/**
 * Director
 */
public class Explorer {
	private MealBuilder mealBuilder;
	
	public void setMealBuilder(MealBuilder mealBuilder){
		this.mealBuilder=mealBuilder;
	}
	
	public void makeMeal() {
		mealBuilder.createMeal();
		mealBuilder.addItem();
	}
	public Meal getMealDetails() {
		return mealBuilder.getMeal();
	}
}
