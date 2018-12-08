package Practice9;

public class AdapterDriver {
	 public static void main(String[] args) {
		    MediaPlayer mediaPlayer = new MP3();
		    mediaPlayer.play("ABC.mp3");

		    mediaPlayer = new FormatAdapter(new MP4());
		    mediaPlayer.play("ABC.mp4");

		    mediaPlayer = new FormatAdapter(new VLC());
		    mediaPlayer.play("ABC.avi");
		 }
}
