package aulaOO2;

public class TestaConta5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta c1 = new Conta();
		c1.nome = "Joao";
		
		Conta c2 = new Conta();
		c2.nome = "Joao";
		
		if (c1 == c2) {
			
			System.out.println("As contas são iguais");
			
		} else {
			
			System.out.println("As contas são diferentes");
			
		}

	}

}
