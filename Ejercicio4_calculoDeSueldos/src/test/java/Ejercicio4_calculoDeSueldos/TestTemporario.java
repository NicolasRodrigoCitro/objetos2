package Ejercicio4_calculoDeSueldos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTemporario {

	private Temporario temporario;
	private Temporario temporarioVacio;
	
	@BeforeEach
	public void setUp() {
		this.temporarioVacio = new Temporario(0,false,0);
		this.temporario = new Temporario(2,true,3);
	}
	
	
	@Test
	public void sueldoBasicoTest() {
		assertEquals(20000 + 2 * 300,this.temporario.getSueldo());
		assertEquals(20000,this.temporarioVacio.getSueldo());
	}
	
	@Test
	public void adicionalTest() {
		assertEquals(11000, this.temporario.getAdicional());
		assertEquals(0,temporarioVacio.getAdicional());
		
	}
	
	
}
