package Practice6;

public class PeachSmoothieBuilder extends SmoothieBuilder {

	@Override
	public void putMilk(){
		this.smoothie.setMilk("2L");
	}
	
	@Override
	public void putFlavor(){
		this.smoothie.setFlavor("Peach");
	}
}
