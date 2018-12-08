package Practice5;

public class DefensiveStrategy implements IBehaviour {

	@Override
	public int moveForward() {
		return -2;
	}
	
	@Override
	public String toString() {
		return "Defensive";
	}
}
