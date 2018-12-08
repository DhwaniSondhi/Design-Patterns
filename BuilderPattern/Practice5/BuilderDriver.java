package Practice5;

public class BuilderDriver {
	
	public static void main(String[] args){
		RobotBuilder oldStyleRobotBuilder=new OldStyleRobotBuilder();
		RobotBuilder brainRobotBuilder=new BrainRobotBuilder();
		RobotDirector robotDirector=new RobotDirector();
		
		System.out.println("Old Robot......");
		robotDirector.setRobotBuilder(oldStyleRobotBuilder);
		robotDirector.makeRobot();
		System.out.println(robotDirector.getRobot());
		
		System.out.println("Brain Robot......");
		robotDirector.setRobotBuilder(brainRobotBuilder);
		robotDirector.makeRobot();
		System.out.println(robotDirector.getRobot());
	}
}
