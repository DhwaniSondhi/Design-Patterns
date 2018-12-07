package Practice3;

public class Sparrow implements Bird {
	
	@Override
	public void fly(String str){
		System.out.println("The sparrow flies"+str);
	}
	@Override
	public void makeSound(String str){
		System.out.println("The sparrow chin chin"+str);
	}
}
