package Practice4;
public class StrategyDriver {

	public static void main(String[] args) {
		TransportToAirport transportToAirport=new TransportToAirport();
		
		System.out.println("Taking city bus.........");
		transportToAirport.setStrategy(new CityBus());
		transportToAirport.travelling();
		
		System.out.println("Taking personal car.........");
		transportToAirport.setStrategy(new PersonalCar());
		transportToAirport.travelling();
		
		System.out.println("Taking taxi.........");
		transportToAirport.setStrategy(new Taxi());
		transportToAirport.travelling();
		
	}
}
