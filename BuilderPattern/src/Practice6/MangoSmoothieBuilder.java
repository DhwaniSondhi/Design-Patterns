package Practice6;

public class MangoSmoothieBuilder extends SmoothieBuilder {

	
	@Override
	public void putMilk(){
		this.smoothie.setMilk("3L");
	}
	
	@Override
	public void putFlavor(){
		this.smoothie.setFlavor("Mango");
	}
}
