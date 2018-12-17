package Practice5;

public class StrategyDriver {

	public static void main(String[] args){
		Robot robot1=new Robot();
		Robot robot2=new Robot();
		Robot robot3=new Robot();
		
		System.out.println("When robot is aggressive.....");
		robot1.setName("Big Robot");
		robot1.setStratergy(new AggressiveStrategy());
		robot1.moveForward();
		
		System.out.println("When robot is defensive.....");
		robot2.setName("George v.2.1");
		robot2.setStratergy(new DefensiveStrategy());
		robot2.moveForward();
		
		System.out.println("When robot is normal.....");
		robot3.setName("R2");
		robot3.setStratergy(new NormalStrategy());
		robot3.moveForward();
		
		
	}
}
