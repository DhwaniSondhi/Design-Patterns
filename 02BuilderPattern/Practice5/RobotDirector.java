package Practice5;

public class RobotDirector {

	private RobotBuilder robotBuilder;
	
	public void setRobotBuilder(RobotBuilder robotBuilder){
		this.robotBuilder=robotBuilder;
	}
	public Robot getRobot(){
		return this.robotBuilder.getRobot();		
	}
	public void makeRobot(){
		robotBuilder.createRobot();
		robotBuilder.makeHead();
		robotBuilder.makeTorso();
		robotBuilder.makeArms();
		robotBuilder.makeLegs();
		robotBuilder.makeBrain();
	}
}
