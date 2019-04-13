package aulaOO2;

public class TestaHeranca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario f1 = new Funcionario();
		f1.setSalario(1000);
		double salfunc = f1.getSalario();
		System.out.println("Salario do funcionario: " + salfunc);
		System.out.println("Bonus do funcionario: " + f1.getBonus());

		DBA d1 = new DBA();
		d1.setSalario(1000);
		double salfunc2 = d1.getSalario();
		System.out.println("Salario do funcionario: " + salfunc2);
		System.out.println("Bonus do funcionario: " + d1.getBonus());
		
	}

}
