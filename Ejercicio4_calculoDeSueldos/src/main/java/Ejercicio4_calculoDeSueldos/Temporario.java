package Ejercicio4_calculoDeSueldos;

public class Temporario extends Empleado{
	private int cantidadHorasDeTrabajo;
	private boolean estadoCivil;// true casado, false soltero
	private int cantidadHijos;
	
	public Temporario(int cantidadHorasDeTrabajo,boolean estadoCivil,int cantidadHijos) {
		this.cantidadHijos=cantidadHijos;
		this.estadoCivil=estadoCivil;
		this.cantidadHorasDeTrabajo = cantidadHorasDeTrabajo;
	}
	public int getCantidadHorasDeTrabajo() {
		return this.cantidadHorasDeTrabajo;
	}

	@Override
	public double getSueldo() {
		/*$ 20.000 + cantidad de horas que  trabajo * $ 300.*/
		return 20000 + this.cantidadHorasDeTrabajo * 300;
	}

	public boolean getEstadoCivil() {return this.estadoCivil;}
	public int getCantidadHijos() {return this.cantidadHijos;}
	@Override
	public double getAdicional() {
		/*$5.000 si está casado $2.000 por cada hijo*/
		double monto=this.getCantidadHijos() * 2000;
		if(this.getEstadoCivil())
			return (5000 + monto);
		else return (monto);
	}

}
