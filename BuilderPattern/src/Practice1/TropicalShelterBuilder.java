package Practice1;

public class TropicalShelterBuilder extends ShelterBuilder{
	
	public void buildRoof() {
		shelter.setRoof("Tropical Roof");
	}
	public void buildFloor() {
		shelter.setStructure("Tropical Structure");
	}
	public void buildStructure() {
		shelter.setFloor("Tropical Floor");
	}
}
