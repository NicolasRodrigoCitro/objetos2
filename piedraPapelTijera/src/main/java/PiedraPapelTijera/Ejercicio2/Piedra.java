package PiedraPapelTijera.Ejercicio2;

public class Piedra extends Mano {

	public  String jugarContra(Mano oponente) {
		return (oponente.matchPiedra());
	}

	@Override
	public String matchPiedra() {
		return "Empato";
	}

	@Override
	public String matchTijera() {
		return "Gano";
	}

	@Override
	public String matchPapel() {
		return "Pierdo";
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
