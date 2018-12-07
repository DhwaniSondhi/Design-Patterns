package Practice2;

public class AdapterDriver {

	public static void main(String[] args){
		
		SquarePeg sqaurePeg=new SquarePeg();
		RoundPeg roundPeg=new RoundPeg();
		
		//client understands sqaurepeg-----> insert
		SquarePegInterface squarePegInterface=new PegAdapter(roundPeg);
		squarePegInterface.insert("Hiiiiiii");
		
		//client understands sqaurepeg-----> insertIntoHole
		RoundPegInterface roundPegInterface=new PegAdapter(sqaurePeg);
		roundPegInterface.insertIntoHole("Hiiiiiii");
	}
	
	
}
