package Practice1;

public class AdapterDriver {

	public static void main(String[] args){
		
		SqaurePeg sqaurePeg=new SqaurePeg();
		RoundPeg roundPeg=new RoundPeg();
		
		PegAdapter pegAdapter=new PegAdapter(roundPeg);
		
		sqaurePeg.insert("Hiiiiiii");
		pegAdapter.insert("Hiiiiiii");
	}
	
	
}
