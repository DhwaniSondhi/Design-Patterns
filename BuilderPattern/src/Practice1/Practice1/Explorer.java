package Practice1;
/**
 * Director
 */
public class Explorer {
	ShelterBuilder shelterBuilder;
	
	public void setShelterBuilder(ShelterBuilder shelterBuilder){
		this.shelterBuilder=shelterBuilder;
	}
	public ShelterBuilder getShelterBuilder() {
		return shelterBuilder;
	}
	public void buildShelter() {
		shelterBuilder.createShelter();
		shelterBuilder.buildRoof();
		shelterBuilder.buildFloor();
		shelterBuilder.buildStructure();
	}
	public Shelter getShelter() {
		return shelterBuilder.getShelter();
	}
}
