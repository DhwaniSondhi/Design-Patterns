package Practice3;

public class RarStrategy implements CompressionStrategy{

	@Override
	public void compress(String folderName){
		System.out.println("Compressed into "+folderName+".rar");
	}
}
