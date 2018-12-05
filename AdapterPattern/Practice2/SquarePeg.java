 package Practice2;

public class SquarePeg implements SquarePegInterface {

	@Override
	public void insert(String str){
		System.out.println("In squarePeg: "+str);
	}
}
