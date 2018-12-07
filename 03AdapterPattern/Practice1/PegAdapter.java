package Practice1;

public class PegAdapter extends SqaurePeg  {

	private RoundPeg roundPeg;
	
	public PegAdapter(RoundPeg roundPeg){
		this.roundPeg=roundPeg;
	}
	
	@Override
	public void insert(String str){
		roundPeg.insertIntoHole(str);
	} 
}
