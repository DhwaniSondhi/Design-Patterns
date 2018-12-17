package Practice3;

public class StrategyDriver {

	public static void main(String[] args){
		Folder folder=new Folder();
		folder.setName("Dhwani");
		
		System.out.println("To compress in Rar file.........");
		folder.setCompressionStrategy(new RarStrategy());
		folder.compress();
		
		System.out.println("To compress in Zip file.........");
		folder.setCompressionStrategy(new ZipStrategy());
		folder.compress();
		
	}
}
