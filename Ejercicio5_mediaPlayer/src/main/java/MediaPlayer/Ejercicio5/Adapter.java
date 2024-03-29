package MediaPlayer.Ejercicio5;

public class Adapter extends Media {
	private VideoStream video;
	
	public Adapter() {
		this.video = new VideoStream();
	}
	public String play() {
		return this.video.reproduce();
	}
}
