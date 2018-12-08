package Practice5;

public class Robot {

	private IBehaviour strategy;
	private String robotName;
	
	public void setName(String robotName){
		this.robotName=robotName;
	}
	
	public void setStratergy(IBehaviour strategy){
		this.strategy=strategy;
	}
	
	public void moveForward() {
		int s=this.strategy.moveForward();
		if(s!=0)	System.out.println("......"+this.robotName+" has "+this.strategy+" behavoir and thus, moves "+(s>0?"forward":"backward"));
		else	System.out.println("......"+this.robotName+" has "+this.strategy+" behavoir and thus, does not move");
		
	}
}
