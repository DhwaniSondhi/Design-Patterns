package Practice2;

public class AdapterDriver {

	public static void main(String[] args){
		
		SquarePeg sqaurePeg=new SquarePeg();
		RoundPeg roundPeg=new RoundPeg();
		
		//client understands sqaurepeg-----> insert
		PegAdapter pegAdapter=new PegAdapter(roundPeg);
		//sqaurePeg.insert("Hiiiiiii");
		pegAdapter.insert("Hiiiiiii");
		
		//client understands sqaurepeg-----> insertIntoHole
		pegAdapter=new PegAdapter(sqaurePeg);
		//roundPeg.insertIntoHole("Hiiiiiii");
		pegAdapter.insertIntoHole("Hiiiiiii");
	}
	
	
}
