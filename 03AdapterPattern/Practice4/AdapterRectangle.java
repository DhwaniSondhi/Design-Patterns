package Practice4;

public class AdapterRectangle extends NewRectangle {

	private OldRectangle oldRectangle;
	
	public AdapterRectangle(OldRectangle oldRectangle){
		this.oldRectangle=oldRectangle;
	}
	@Override
	public void display(int x1, int y1, int x2, int y2){
		oldRectangle.display(x1, y1, x2, y2);
	}
}
