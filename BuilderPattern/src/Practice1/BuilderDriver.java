package Practice1;

public class BuilderDriver {
	public static void main(String[] args){
		PolarShelterBuilder polarShelterBuilder=new PolarShelterBuilder();
		TropicalShelterBuilder tropicalShelterBuilder=new TropicalShelterBuilder();
		
		Explorer explorer=new Explorer();
		
		explorer.setShelterBuilder(tropicalShelterBuilder);
		explorer.buildShelter();
		Shelter pol=explorer.getShelter();
		
		System.out.println(pol);
	}
}
