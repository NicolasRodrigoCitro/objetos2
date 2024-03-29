package Ejercicio4_calculoDeSueldos;

public abstract class Empleado {
	
	
	
	public double sueldo() {
		return this.getSueldo() +
			   this.getAdicional() -
			   this.getDescuento();
	}
	public double getDescuento() {
		return this.getSueldo() * 0.13 + this.getAdicional() * 0.05;
	}
	
	public abstract double getSueldo();
	public abstract double getAdicional();
}
