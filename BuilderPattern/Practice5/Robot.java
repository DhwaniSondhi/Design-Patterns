package Practice5;

public class Robot {
	
	private String head, torso, arms, legs, brain;
	
	public void setHead(String head){
		this.head=head;
	}
	public void setTorso(String torso){
		this.torso=torso;
	}
	public void setArms(String arms){
		this.arms=arms;
	}
	public void setLegs(String legs){
		this.legs=legs;
	}
	public void setBrain(String brain) {
		this.brain=brain;
	}
	
	public String toString(){
		return "Hi, I have "+this.head+" heads, "+this.torso+" torso, "+this.arms+" arms, "+this.legs+" legs and "+this.brain+" brain";
	}
}
