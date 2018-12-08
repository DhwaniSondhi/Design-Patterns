package Problem5;

public class BrainRobotBuilder extends RobotBuilder {

	@Override
	public void makeHead(){this.robot.setHead("two");}
	
	@Override
	public void makeTorso(){this.robot.setTorso("one");}
	
	@Override
	public void makeArms(){this.robot.setArms("two");}
	
	@Override
	public void makeLegs(){this.robot.setLegs("two");}
	
	@Override
	public void makeBrain(){this.robot.setBrain("AI");}
}
