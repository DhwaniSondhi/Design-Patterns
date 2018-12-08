package Practice3;

public class ZipStrategy implements CompressionStrategy{

	@Override
	public void compress(String folderName){
		System.out.println("Compressed into "+folderName+".zip");
	}
}
