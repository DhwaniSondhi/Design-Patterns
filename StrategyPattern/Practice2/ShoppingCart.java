package Practice2;

public class ShoppingCart {

	private PaymentStrategy strategy;
	
	public void setPaymentStrategy(PaymentStrategy strategy){
		this.strategy=strategy;
	}
	
	public void pay(int amount){
		this.strategy.pay(amount);
	}
}
