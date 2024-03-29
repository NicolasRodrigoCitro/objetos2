package Ejercicio4_calculoDeSueldos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPlanta {
	
	private Planta planta;
	private Planta plantaVacio;
	
	@BeforeEach
	public void setUp() {
		//estado civil, cant hijos, antiguedad
		this.plantaVacio = new Planta(false,0,0);
		this.planta = new Planta(true,2,10);
	}
	
	
	@Test
	public void sueldoBasicoTest() {
		assertEquals(50000,this.planta.getSueldo());
		assertEquals(50000,this.plantaVacio.getSueldo());
	}
	
	@Test
	public void adicionalTest() {
		//$5.000 si está casado $2.000 por cada hijo $2.000 por cada año de antigüedad
		assertEquals(5000 + 2000*2 + 2000*10, this.planta.getAdicional());
		assertEquals(0, this.plantaVacio.getAdicional());
		
	}
	

}
