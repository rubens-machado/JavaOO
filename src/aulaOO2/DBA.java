package aulaOO2;

public class DBA extends Funcionario {
	
	int senha;
	
	double getBonus() {
		return this.salario * 0.25;
	}	
	
	public boolean verificaSenha(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso autorizado");
			return true;
		} else {
			System.out.println("Acesso nao autorizado");
			return false;
		}
		
	}
}
