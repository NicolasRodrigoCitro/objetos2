package Ejercicio4_calculoDeSueldos;

public class Pasante extends Empleado{
	private int cantidadExamenesRendidos;
	
	public Pasante(int cantidadExamenesRendidos) {
		this.cantidadExamenesRendidos=cantidadExamenesRendidos;
	}
	@Override
	public double getSueldo() {
		/*$20.000*/
		return 20000;
	}

	@Override
	public double getAdicional() {
		/*$2.000 por examen que rindió*/
		return this.cantidadExamenesRendidos * 2000;
	}

}
