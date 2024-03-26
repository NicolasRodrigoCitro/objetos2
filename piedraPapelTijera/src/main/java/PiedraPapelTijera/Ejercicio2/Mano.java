package PiedraPapelTijera.Ejercicio2;

public abstract class Mano {
	

	
	public abstract String matchPiedra();
	public abstract String matchTijera();
	public abstract  String matchPapel();
	public abstract String matchLagarto();;
	public abstract String  matchSpock();
	
	public abstract String jugarContra(Mano oponente) ;

}
