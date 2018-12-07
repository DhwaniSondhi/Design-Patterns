package Practice3;

public class AdapterBirdDuck implements Duck {
	
	private Sparrow spa;
	
	AdapterBirdDuck(Sparrow spa){
		this.spa=spa;
	}
	@Override
	public void squeak(String str){
		spa.makeSound(str);
	}
}
