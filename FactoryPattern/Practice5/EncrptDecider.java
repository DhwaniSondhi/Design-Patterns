package Practice5;

public class EncrptDecider {

	public Encryption chooseEncryption(String encryptName) {
		if("Left".equalsIgnoreCase(encryptName)) {
			return new LeftEncryption();
		}else if("Right".equalsIgnoreCase(encryptName)){
			return new RightEncryption();
		}
		return null;
	}
}
