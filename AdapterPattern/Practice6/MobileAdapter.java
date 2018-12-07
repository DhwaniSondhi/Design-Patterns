package Practice6;

public class MobileAdapter extends WallSocket {
	
	private MobileChargingSocket mobileChargingSocket;
	public MobileAdapter(MobileChargingSocket mobileChargingSocket){
		this.mobileChargingSocket=mobileChargingSocket;
	}
	
	@Override
	public void chargeWith120Volts(){
		mobileChargingSocket.chargeWithThreeVolts();
	}
}
