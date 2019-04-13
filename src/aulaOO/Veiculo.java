package aulaOO;

public class Veiculo {

	String nome;
	double velocidade;

	public void acelera() {
		if (velocidade <= 10) {
			velocidade++;
		}
	}

	public void frear() {
		if (velocidade > 0) {
			velocidade--;
		}
	}
}
