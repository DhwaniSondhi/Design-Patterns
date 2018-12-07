package Practice4;

public class AdapterDriver {
	
	public static void main(String[] args){
		OldRectangle oldRectangle=new OldRectangle();
		NewRectangle newRectangle=new NewRectangle();
		System.out.println("Using NewRectangle display....");
		newRectangle.display(1,2,3,4);
		NewRectangle newRectangleOldAdapter=new AdapterRectangle(oldRectangle);
		System.out.println("Using OldRectangle display....");
		newRectangleOldAdapter.display(1,2,3,4);
	}
}
