package aulaOO;

public class Cliente {

	private int codigo;
	private String nome;
	private String cidade;
	
	
	public Cliente(String nome) {
		//this.codigo = codigo;
		this.nome = nome;
		this.cidade = "Rio de Janeiro";
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
	
}
