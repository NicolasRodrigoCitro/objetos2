package PiedraPapelTijera.Ejercicio2;

public class Lagarto extends Mano{

	@Override
	public String matchPiedra() {
		// TODO Auto-generated method stub
		return "Pierdo";
	}

	@Override
	public String matchTijera() {
		// TODO Auto-generated method stub
		return "Pierdo";
	}

	@Override
	public String matchPapel() {
		// TODO Auto-generated method stub
		return "Gano";
	}

	@Override
	public String matchLagarto() {
		// TODO Auto-generated method stub
		return "Empato";
	}

	@Override
	public String matchSpock() {
		// TODO Auto-generated method stub
		return "Gano";
	}

	@Override
	public String jugarContra(Mano oponente) {
		return oponente.matchLagarto();
	}

}
