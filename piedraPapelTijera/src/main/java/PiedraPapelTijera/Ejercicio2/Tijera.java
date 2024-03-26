package PiedraPapelTijera.Ejercicio2;

public class Tijera extends Mano{

	
	public  String jugarContra(Mano oponente) {
		return (oponente.matchTijera());
	}
	
	public String matchPiedra() {
		return "Pierdo";
	}

	@Override
	public String matchTijera() {
		return "Empato";
	}

	@Override
	public String matchPapel() {
		return "Gano";
	}

	@Override
	public String matchLagarto() {
		// TODO Auto-generated method stub
		return "Gano";
	}

	@Override
	public String matchSpock() {
		// TODO Auto-generated method stub
		return "Pierdo";
	}



}
