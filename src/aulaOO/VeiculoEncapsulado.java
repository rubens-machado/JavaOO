package aulaOO;

//Encapsulamento
public class VeiculoEncapsulado {
	public static void main(String[] args) {
		Veiculo v1;
		v1 = new Veiculo();
		v1.nome = "Gol";
		System.out.println(v1.nome);
		//v1.mostravelocidade();
		for (int i = 1; i <= 5; i++) {
			v1.acelera();
			//v1.mostravelocidade();
//			System.out.println(v1.velocidade);
		}
	}
}

