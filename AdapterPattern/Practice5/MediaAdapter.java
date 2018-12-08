package Practice5;

public class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer advancedMediaPlayer;
	
	public MediaAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
		this.advancedMediaPlayer=advancedMediaPlayer;
	}

/*Or this code will be added for commented code in AudioPlayer
	public MediaAdapter(String str) {
		if("Mp4".equalsIgnoreCase(str))		advancedMediaPlayer=new Mp4Player();
		else if("Vlc".equalsIgnoreCase(str))	advancedMediaPlayer=new VlcPlayer();
	}*/

	
	@Override
	public void play(String audioType, String fileName){
		if("Mp4".equalsIgnoreCase(audioType))		advancedMediaPlayer.playMp4(fileName);
		else if("Vlc".equalsIgnoreCase(audioType))		advancedMediaPlayer.playVlc(fileName);
		
	}
	
}
