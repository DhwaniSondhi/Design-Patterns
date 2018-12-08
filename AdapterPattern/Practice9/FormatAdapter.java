package Practice9;


public class FormatAdapter implements MediaPlayer{
	
	private MediaPackage mediaPackage;
	
	public FormatAdapter(MediaPackage mediaPackage){
		this.mediaPackage=mediaPackage;
	}
	
	public void play(String filename){
		mediaPackage.playFile(filename);
	}
}
