package Practice1;

public class Multiply implements CalculatorStrategy  {

	@Override
	public int execute(int a, int b){
		return a*b;
	}
}
