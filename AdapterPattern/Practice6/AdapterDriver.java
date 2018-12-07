package Practice6;

public class AdapterDriver {

	public static void main(String[] args){
		WallSocket wallSocket=new WallSocket();
		MobileChargingSocket mobileChargingSocket=new MobileChargingSocket();
		
		WallSocket voltAdapted=new MobileAdapter(mobileChargingSocket);
		voltAdapted.chargeWith120Volts();
	}
}
