package RedSocial.redSocial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class TestRedSocial {
	
	private Tweeter sistema;
	private Usuario usuario;
	private Tweet tweet1;
	
	@BeforeEach
	public void setUp() {
		this.sistema = new Tweeter();
		this.usuario = new Usuario("Rodrigo");
		tweet1 = new Tweet(" asdasd ");
	}
	
	
	
	@Test
	public void eliminarUsuario() {
		Usuario usuarioAux = new Usuario("Enzo");
		Usuario usuarioAux2 = new Usuario("Franco");
		this.sistema.agregarUsuario(usuarioAux2);
		this.sistema.agregarUsuario(usuarioAux);
		
		assertTrue(this.sistema.existeUsuario(usuarioAux2));
		this.sistema.eliminarUsuario(usuarioAux2);
		assertFalse(this.sistema.existeUsuario(usuarioAux2));
	}
 
	@Test
	public void eliminarTodasLasReferenciasDeTweetTest() {
		Usuario usuarioAux = new Usuario("Enzo");
		Usuario usuarioAux2 = new Usuario("Franco");
		Usuario usuarioAux3 = new Usuario("Rocio");
		this.sistema.agregarUsuario(usuarioAux3);
		this.sistema.agregarUsuario(usuarioAux2);
		this.sistema.agregarUsuario(usuarioAux);
		
		
		Post tweet01 = new Tweet("a");
		Post tweet02 = new Tweet("b");
		Post tweet03 = new Tweet("c");
		Post reTweet01 = new ReTweet(tweet01);
		
		usuarioAux.agregarPost(tweet01);
		
		usuarioAux2.agregarPost(reTweet01);
		usuarioAux2.agregarPost(tweet03);
		
		usuarioAux3.agregarPost(reTweet01);
		usuarioAux3.agregarPost(tweet02);
		
		//Elimino usuarioAux
		this.sistema.eliminarUsuario(usuarioAux);
		//chequeo que se eliminaron las referencias
		assertTrue(usuarioAux2.noExisteReTweetsDe(tweet1));
	}
	


	@Test
	public void usuarioConNombreExistenteTest() {
		Usuario usuarioAux = new Usuario("Nicolas");
		assertTrue(this.sistema.agregarUsuario(usuario));
		assertFalse(this.sistema.agregarUsuario(usuario));
	}
	
	@Test
	public void postearTweetTest() {
		String unTextoHabilitado = "1234";
		String unTextoSinCaracter = "";
		String unTextoConUnCaracter ="1";
		String unTextoSuperiorAlPedido = "ddddddddddddddddd";
		
		assertTrue(this.usuario.crearTweet(unTextoHabilitado));
		assertTrue(this.usuario.crearTweet(unTextoConUnCaracter));
		assertFalse(this.usuario.crearTweet(unTextoSinCaracter));
		assertFalse(this.usuario.crearTweet(unTextoSuperiorAlPedido));
		
		
	}
	
	@Test
	public void eliminarTweetsTest() {
		Post tweet01 = new Tweet("a");
		Post tweet02 = new Tweet("b");
		Post reTweet01 = new ReTweet(this.tweet1);
		this.usuario.agregarPost(tweet01);
		this.usuario.agregarPost(tweet02);
		this.usuario.agregarPost(reTweet01);
		
		this.usuario.eliminarTweets();
		assertFalse(this.usuario.existePost(tweet02));
		assertTrue(this.usuario.coleccionIsEmpty());
	}

}
