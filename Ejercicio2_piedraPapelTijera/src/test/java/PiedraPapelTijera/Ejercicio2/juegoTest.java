package PiedraPapelTijera.Ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class juegoTest {
	
	private Mano piedra;
	private Mano tijera;
	private Mano papel;
	private Mano spock;
	private Mano lagarto;
	
	
	@BeforeEach
	public void setUp() {
		this.papel = new Papel();
		this.tijera = new Tijera();
		this.piedra = new Piedra();
		this.lagarto = new Lagarto();
		this.spock = new Spock();
	}
	
	@Test
	public void jugarContraTest() {
		assertEquals("Gano",this.papel.jugarContra(this.tijera));
		assertEquals("Pierdo",this.papel.jugarContra(this.piedra));
		assertEquals("Empato",this.papel.jugarContra(this.papel));
		assertEquals("Gano",this.papel.jugarContra(this.lagarto));
		assertEquals("Pierdo",this.papel.jugarContra(this.spock));
	}

}
