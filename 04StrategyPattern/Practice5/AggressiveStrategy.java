package Practice5;

public class AggressiveStrategy implements IBehaviour {

	@Override
	public int moveForward() {
		return 2;
	}
	
	@Override
	public String toString() {
		return "Aggressive";
	}
}
