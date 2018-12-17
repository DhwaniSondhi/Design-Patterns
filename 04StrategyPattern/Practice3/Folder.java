package Practice3;

public class Folder {

	private String name;
	private CompressionStrategy strategy;
	
	public void setName(String name){
		this.name=name;
	}
	public void setCompressionStrategy(CompressionStrategy strategy){
		this.strategy=strategy;
	}
	
	public void compress(){
		this.strategy.compress(this.name);
	}
}
