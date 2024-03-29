package Ejercicio4_calculoDeSueldos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPasante {

	
	private Pasante pasante;
	private Pasante pasanteVacio;
	
	@BeforeEach
	public void setUp() {
		//cantExamenesRendidos
		this.pasanteVacio = new Pasante(0);
		this.pasante = new Pasante(5);
	}
	
	
	@Test
	public void sueldoBasicoTest() {
		assertEquals(20000,this.pasante.getSueldo());
		assertEquals(20000,this.pasanteVacio.getSueldo());
	}
	
	@Test
	public void adicionalTest() {
		assertEquals(10000, this.pasante.getAdicional());
		assertEquals(0, this.pasanteVacio.getAdicional());
		
	}
	
	
	
	
	
}
