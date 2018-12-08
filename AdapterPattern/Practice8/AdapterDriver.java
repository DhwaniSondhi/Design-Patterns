package Practice8;

public class AdapterDriver {
	
	public static void main(String[] args){
		UKElectricalSocket uKElectricalSocket=new UKElectricalSocket(); 
		GermanPlugConnector germanPlugConnector=new GermanPlugConnectorClass();
		UKPlugConnector uKPlugConnector=new GermanUKAdapter(germanPlugConnector);
		
		System.out.println("UK Plug Connector.......");
		uKElectricalSocket.plugIn(uKPlugConnector);;
	}
}
