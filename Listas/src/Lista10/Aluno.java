package Lista10;

public class Aluno  extends PessoaFisica{

	
	private String nome;
	private String cpf;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", cpf=" + cpf + "]";
	}
	
	
	
}
