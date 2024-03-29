package MediaPlayer.Ejercicio5;

public class MediaPlayer {
	private Media media;
	
	
	public MediaPlayer(Media media) {
		this.media = media;
	}

	public Media getMedia() {
		return this.media;
	}
	public String play() {
		return this.media.play();
	}
}
