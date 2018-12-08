package Practice6;

public abstract class SmoothieBuilder {

	protected Smoothie smoothie;
	public void createSmoothie(){
		smoothie=new Smoothie();
	}
	public Smoothie getSmoothie(){
		return this.smoothie;
	}
	public abstract void  putMilk();
	public abstract void putFlavor();
}
