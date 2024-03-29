package Ejercicio4_calculoDeSueldos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCalculoDeSueldo {

	private Empleado empleadoPasante;
	private Empleado empleadoPlanta;
	private Empleado empleadoTemporario;

	@BeforeEach
	public void setUp() {
		// cantidad examenes
		this.empleadoPasante = new Pasante(2);
		// casado,hijos,antiguedad
		this.empleadoPlanta = new Planta(true, 3, 10);
		// horas, estadocivil, cantidadhijos
		this.empleadoTemporario = new Temporario(2, true, 3);
	}

	@Test
	public void descuentoTest() {
		assertEquals(20600 * 0.13 + 11000 * 0.05, empleadoTemporario.getDescuento());
	}

	@Test
	public void sueldoTest() {

		assertEquals(21200, this.empleadoPasante.sueldo());
		assertEquals(72950, this.empleadoPlanta.sueldo());
		assertEquals(28372, this.empleadoTemporario.sueldo());
	}

}
