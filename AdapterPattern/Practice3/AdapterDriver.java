package Practice3;

public class AdapterDriver {
	
	public static void main(String[] args){
		Sparrow spa=new Sparrow();
		Duck duck=new WhiteDuck();
		
		Duck duckBirdAdapter=new AdapterBirdDuck(spa);
		duck.squeak("");
		duckBirdAdapter.squeak(" Hey I am squeaking");
		
	}
}
