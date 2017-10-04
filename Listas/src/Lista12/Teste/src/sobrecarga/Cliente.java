package Lista12.Teste.src.sobrecarga;

public class Cliente {

	public String nome;
	public String cpf;
	public Cidade cidade;
	public String rg;
	
	public Cliente () {
		
	}
	
	public Cliente(String nome, String cpf,String rg, Cidade cidade) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg= rg;
		this.cidade = cidade;
	}
	
	public Cliente (String nome, Cidade cidade) {
		super();
		this.nome=nome;
		this.cidade=cidade;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", cidade=" + cidade + ", rg=" + rg + "]";
	}
	
	
	
}
