package Practice2;

public class PegAdapter implements SquarePegInterface, RoundPegInterface{
	
	SquarePeg squarePeg;
	RoundPeg roundPeg;
	
	public PegAdapter(SquarePeg squarePeg){
		this.squarePeg=squarePeg;
	}
	public PegAdapter(RoundPeg roundPeg){
		this.roundPeg=roundPeg;
	}
	@Override
	public void insert(String str){
		roundPeg.insertIntoHole(str);
	}
	
	@Override
	public void insertIntoHole(String str){
		squarePeg.insert(str);
	}
}
