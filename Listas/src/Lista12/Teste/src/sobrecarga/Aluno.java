package Lista12.Teste.src.sobrecarga;

public class Aluno {
	
	public String nome;
	
	public Aluno() {
		
	}
	
	public Aluno(String nome) {
		super();
		this.nome=nome;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + "]";
	}
	
	

}
