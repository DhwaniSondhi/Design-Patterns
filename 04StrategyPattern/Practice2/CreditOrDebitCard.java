package Practice2;

public class CreditOrDebitCard implements PaymentStrategy {

	@Override
	public void pay(int amount){
		System.out.println(amount+"cad payment is through Credit/Debit Card.");
	}
}
