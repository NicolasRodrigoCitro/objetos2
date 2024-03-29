package MediaPlayer.Ejercicio5;

public class Main {

	public static void main(String[] args) {
		Audio audio = new Audio();
		VideoFile videoFile = new VideoFile();
			
		Adapter adapter = new Adapter();
		
		MediaPlayer mediaPlayer1 = new MediaPlayer(audio);
		MediaPlayer mediaPlayer2 = new MediaPlayer(videoFile);
		MediaPlayer mediaPlayer3 = new MediaPlayer(adapter);
		System.out.println(mediaPlayer1.play());
		System.out.println(mediaPlayer2.play());
		System.out.println(mediaPlayer3.play());

	}

}
