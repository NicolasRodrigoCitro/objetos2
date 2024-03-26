package PiedraPapelTijera.Ejercicio2;

public class Spock extends Mano {

	@Override
	public String matchPiedra() {
		// TODO Auto-generated method stub
		return "Gano";
	}

	@Override
	public String matchTijera() {
		// TODO Auto-generated method stub
		return "Gano";
	}

	@Override
	public String matchPapel() {
		// TODO Auto-generated method stub
		return "Pierdo";
	}

	@Override
	public String matchLagarto() {
		// TODO Auto-generated method stub
		return "Pierdo";
	}

	@Override
	public String matchSpock() {
		// TODO Auto-generated method stub
		return "Empato";
	}

	@Override
	public String jugarContra(Mano oponente) {
		return oponente.matchSpock();
	}

}
