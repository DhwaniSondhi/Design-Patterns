package Practice6;

public class BuilderDriver {
	
	public static void main(String[] args){
		SmoothieBuilder mangoSmoothieBuilder=new MangoSmoothieBuilder();
		SmoothieBuilder peachSmoothieBuilder=new PeachSmoothieBuilder();
		SmoothieBuilder vanillaSmoothieBuilder=new VanillaSmoothieBuilder();
		SmoothieDirector smoothieDirector=new SmoothieDirector();
		
		System.out.println("MangoSmoothie.......");
		smoothieDirector.setSmoothieBuilder(mangoSmoothieBuilder);
		smoothieDirector.makeSmoothie();
		System.out.println(smoothieDirector.getSmoothie());
		
		System.out.println("PeachSmoothie.......");
		smoothieDirector.setSmoothieBuilder(peachSmoothieBuilder);
		smoothieDirector.makeSmoothie();
		System.out.println(smoothieDirector.getSmoothie());
		
		System.out.println("VanillaSmoothie.......");
		smoothieDirector.setSmoothieBuilder(vanillaSmoothieBuilder);
		smoothieDirector.makeSmoothie();
		System.out.println(smoothieDirector.getSmoothie());
		
	}
}
