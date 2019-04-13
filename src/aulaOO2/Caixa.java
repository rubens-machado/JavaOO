package aulaOO2;

public class Caixa extends Funcionario {
	int senha;
	
	double getBonus() {
		return super.getBonus() + 10;		
	}
	

	public boolean verificaSenha(int senha) {
		return false;
	}
	
}