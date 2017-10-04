package banco;



public class Cliente2 {
	
	public String nome;
	public String telefone;
	public String cidade;
	public int idade;
	
	
	
	public Cliente2(String nome, String telefone, String cidade, int idade) {
		
		this.nome = nome;
		this.telefone = telefone;
		this.cidade = cidade;
		this.idade = idade;
	}
	
	public Cliente2() {
		
	}

	@Override
	public String toString() {
		return "Cliente2 [nome=" + nome + ", telefone=" + telefone + ", cidade=" + cidade + ", idade=" + idade + "]";
	}

	
}
