package Practice1;

public class StrategyDriver {

	public static void main(String[] args){
		Calculator calculator=new Calculator();
		int a=4,b=5;
		
		System.out.println("Adding "+a+","+b+"......");
		calculator.setCalculatorStrategy(new Add());
		System.out.println(calculator.execute(a, b));
		
		System.out.println("Multiplying "+a+","+b+"......");
		calculator.setCalculatorStrategy(new Multiply());
		System.out.println(calculator.execute(a, b));
		
		System.out.println("Subtracting "+a+","+b+"......");
		calculator.setCalculatorStrategy(new Subtract());
		System.out.println(calculator.execute(a, b));
	}
}
