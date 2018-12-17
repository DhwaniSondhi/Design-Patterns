package Practice4;

public class TransportToAirport {

	private TravelStratergy strategy;
	
	void setStrategy(TravelStratergy strategy){
		this.strategy=strategy;
	}
	
	public void travelling() {
		this.strategy.travelling();
	}
	
}
