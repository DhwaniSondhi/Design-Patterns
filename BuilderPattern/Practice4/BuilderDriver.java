package Practice4;

public class BuilderDriver {
	
	public static void main(String[] args){
		
		BigComboMealBuilder bigComboMealBuilder=new BigComboMealBuilder();
		MediumComboMealBuilder mediumComboMealBuilder=new MediumComboMealBuilder();
		SmallComboMealBuilder smallComboMealBuilder=new SmallComboMealBuilder();
		
		ComboMealDirector comboMealDirector=new ComboMealDirector(bigComboMealBuilder);
		comboMealDirector.buildMeal();
		System.out.println(comboMealDirector.getComboMeal());
	}
}
