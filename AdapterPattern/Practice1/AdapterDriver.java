package Practice1;

public class AdapterDriver {

	public static void main(String[] args){
		
		SqaurePeg sqaurePeg=new SqaurePeg();
		RoundPeg roundPeg=new RoundPeg();
		
		sqaurePeg.insert("Hiiiiiii");
		
		SqaurePeg sqaurePegAda=new PegAdapter(roundPeg);
		sqaurePegAda.insert("Hiiiiiii");
	}
	
	
}
