package Practice2;

public class StrategyDriver {

	public static void main(String[] args){
		
		ShoppingCart shoppingCart=new ShoppingCart();
		int amount=10;
		
		System.out.println("Selected Credit/Debit Card................");
		shoppingCart.setPaymentStrategy(new CreditOrDebitCard());
		shoppingCart.pay(amount);
		
		System.out.println("Selected PayPal................");
		shoppingCart.setPaymentStrategy(new PayPal());
		shoppingCart.pay(amount);
		
	}
}
