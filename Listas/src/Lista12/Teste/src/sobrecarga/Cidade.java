package Lista12.Teste.src.sobrecarga;

public class Cidade {
	
	public String nome;
	public Estado estado;
	
	
	
	public Cidade(String nome, Estado estado) {
		super();
		this.nome = nome;
		this.estado = estado;
	}



	@Override
	public String toString() {
		return "Cidade [nome=" + nome + ", estado=" + estado + "]";
	}
	
	

}
