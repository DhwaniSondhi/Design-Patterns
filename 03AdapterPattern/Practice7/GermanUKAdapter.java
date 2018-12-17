package Practice8;

public class GermanUKAdapter implements UKPlugConnector {
	private GermanPlugConnector germanPlugConnector;
	
	public GermanUKAdapter(GermanPlugConnector germanPlugConnector){
		this.germanPlugConnector=germanPlugConnector;
	}
	
	@Override
	public void provideElectricity(){
		germanPlugConnector.giveElectricity();
	}
	
}
