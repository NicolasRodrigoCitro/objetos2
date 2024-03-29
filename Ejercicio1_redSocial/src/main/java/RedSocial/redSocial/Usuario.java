package RedSocial.redSocial;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String nombre;
	private List<Post> misPost;
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Usuario(String nombre) {
		this.nombre = nombre;
		this.misPost = new ArrayList<>();
	}
	public boolean noExisteReTweetsDe(Tweet tweet) {

		// Consulta las referencias, buscando si algun retweet tiene la ref. del tweet
		// pasado por paramentro
		//podria filtrar los retweet y dsp preguntar dentro de esa coleccion.
		Post tweetAux = this.misPost.stream()
					.filter(tw -> (tw == tweet))
					.findFirst()
					.orElse(null);
		if(tweetAux == null) {
			return true;
		}
		return false;
	}
	public boolean existePost(Post unPost) {
		return (this.misPost.contains(unPost));
	}
	
	public boolean crearTweet(String unTextoHabilitado) {
		if(unTextoHabilitado.length() > 0 && unTextoHabilitado.length() < 16 ) {
			Post unTweet = new Tweet(unTextoHabilitado);
			this.agregarPost(unTweet);
			return true;
		} 
		return false;
	}
	
	public boolean crearReTweet(Tweet unReTweet) {
		if(unReTweet != null) {
			Post reTweet = new ReTweet(unReTweet);
			this.misPost.add(reTweet);
			return true;
		}
		return false;
	}
	
	//Lo dejo publico para los test, debe ser privado.
	public void agregarPost(Post unPost) {
		this.misPost.add(unPost);	
	}
	

	public void eliminarTweets() {
		this.misPost.clear();
	}
	//metodos para el test 
	public boolean coleccionIsEmpty() {
		return (this.misPost.isEmpty());
	}

}
