package Ejercicio4_calculoDeSueldos;

public class Planta extends Empleado {

	private boolean estadoCivil;// true casado, false soltero
	private int cantidadHijos;
	private int antiguedad;

	public Planta(boolean estadoCivil, int cantidadHijos, int antiguedad) {
		this.estadoCivil = estadoCivil;
		this.cantidadHijos = cantidadHijos;
		this.antiguedad = antiguedad;
	}

	@Override
	public double getSueldo() {
		/* $ 50.000 */
		return 50000;
	}

	@Override
	public double getAdicional() {
		/*
		 * $5.000 si está casado $2.000 por cada hijo $2.000 por cada año de antigüedad
		 */
		double monto = 2000 * this.getCantidadHijos() + 2000 * this.getAntiguedad();
		if (this.getEstadoCivil()) {
			return 5000 + monto;
		} else
			return monto;

	}

	public boolean getEstadoCivil() {
		return this.estadoCivil;
	}

	public int getCantidadHijos() {
		return this.cantidadHijos;
	}

	public int getAntiguedad() {
		return this.antiguedad;
	}

}
