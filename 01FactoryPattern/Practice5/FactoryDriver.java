package Practice5;

public class FactoryDriver {
	
	public static void main(String[] args){
		
		EncrptDecider encrptDecider=new EncrptDecider();
		Encryption encryption=encrptDecider.chooseEncryption("right");
		encryption.encrpt();
	}
}
