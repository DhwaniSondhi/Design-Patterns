package Practice7;

public class VehicleChanger {
	
	private VehicleChanger(){}
	
	public static Vehicle getVehicle(String vehicleName){
		if("TwoWheels".equalsIgnoreCase(vehicleName)){
			return new TwoWheelerVehicle();
		}else if("FourWheels".equalsIgnoreCase(vehicleName)){
			return new FourWheelerVehicle();
		}
		return null;
	}
}
