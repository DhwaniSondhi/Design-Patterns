package Practice1;

public abstract class ShelterBuilder {
	Shelter shelter;
	
	public Shelter getShelter(){
		return shelter;
	}
	public void createShelter() {
		this.shelter=new Shelter();
	}
	public abstract void buildRoof();
	public abstract void buildStructure();
	public abstract void buildFloor();
}
