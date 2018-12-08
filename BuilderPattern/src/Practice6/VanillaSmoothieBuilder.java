package Practice6;

public class VanillaSmoothieBuilder extends SmoothieBuilder{

	@Override
	public void putMilk(){
		this.smoothie.setMilk("2.5L");
	}
	
	@Override
	public void putFlavor(){
		this.smoothie.setFlavor("Vanilla");
	}
}
