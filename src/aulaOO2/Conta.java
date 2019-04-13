package aulaOO2;

public class Conta {

	int numero;
	String nome;
	double saldo;
	double limite;

	boolean sacar(double valor) {
		if((this.saldo + this.limite)<valor){
			return false;
		}
		this.saldo -= valor;
		return true;
	}

	void depositar(double valor) {
		this.saldo += valor;
	}

}





