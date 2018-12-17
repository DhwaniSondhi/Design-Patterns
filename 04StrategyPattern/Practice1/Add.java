package Practice1;

public class Add implements CalculatorStrategy {

	@Override
	public int execute(int a, int b){
		return a+b;
	}
}
