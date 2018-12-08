package Practice2;

public class PayPal implements PaymentStrategy {

	@Override
	public void pay(int amount){
		System.out.println(amount+"cad payment is through PayPal.");
	}
}
