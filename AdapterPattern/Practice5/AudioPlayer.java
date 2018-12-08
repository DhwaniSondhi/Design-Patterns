package Practice5;

public class AudioPlayer implements MediaPlayer {

	public void play(String audioType, String fileName){
		if("Mp3".equalsIgnoreCase(audioType))	System.out.println("Playing Mp3..."+fileName);
		else if("Mp4".equalsIgnoreCase(audioType))		new MediaAdapter(new Mp4Player()).play(audioType, fileName);
		else if("Vlc".equalsIgnoreCase(audioType))		new MediaAdapter(new VlcPlayer()).play(audioType, fileName);
	}
	
	/*public void play(String audioType, String fileName){
		if("Mp3".equalsIgnoreCase(audioType))	System.out.println("Playing Mp3..."+fileName);
		else if("Mp4".equalsIgnoreCase(audioType) || "Vlc".equalsIgnoreCase(audioType))		new MediaAdapter(audioType).play(audioType, fileName);
	}
	*/
}
