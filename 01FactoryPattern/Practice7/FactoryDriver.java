package Practice7;

public class FactoryDriver {

	public static void main(String[] args){
		Vehicle vehicle1=VehicleChanger.getVehicle("TwoWheels");
		vehicle1.hasWheels();
		
		Vehicle vehicle2=VehicleChanger.getVehicle("FourWheels");
		vehicle2.hasWheels();
	}
}
