package Practice1;

public class Calculator {
	CalculatorStrategy strategy;
	
	public void setCalculatorStrategy(CalculatorStrategy strategy){
		this.strategy=strategy;
	}
	
	public int execute(int a, int b){
		return this.strategy.execute(a,b);
	}
}
