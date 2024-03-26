package PiedraPapelTijera.Ejercicio2;

public class Papel extends Mano {


	public  String jugarContra(Mano oponente) {
		return (oponente.matchPapel());
	}

	@Override
	public String matchPiedra() {
		return "Gano";
	}

	@Override
	public String matchTijera() {
		return "Pierdo";
	}

	@Override
	public String matchPapel() {
		return "Empato";
	}

	@Override
	public String matchLagarto() {
		// TODO Auto-generated method stub
		return "Pierdo";
	}

	@Override
	public String matchSpock() {
		// TODO Auto-generated method stub
		return "Gano";
	}

	
}
