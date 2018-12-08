package Problem5;

public abstract class RobotBuilder {
	
	protected Robot robot;
	
	public Robot getRobot(){
		return this.robot;
	}
	public void createRobot(){
		robot=new Robot();
	}
	public abstract void makeHead();
	public abstract void makeTorso();
	public abstract void makeArms();
	public abstract void makeLegs();
	public abstract void makeBrain();
}
