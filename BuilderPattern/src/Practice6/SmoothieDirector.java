package Practice6;

public class SmoothieDirector {

	private SmoothieBuilder smoothieBuilder;
	
	public void setSmoothieBuilder(SmoothieBuilder smoothieBuilder){
		this.smoothieBuilder=smoothieBuilder;
	}
	
	public Smoothie getSmoothie(){
		return this.smoothieBuilder.getSmoothie();
	}
	
	public void makeSmoothie(){
		smoothieBuilder.createSmoothie();
		smoothieBuilder.putMilk();
		smoothieBuilder.putFlavor();
	}
}
