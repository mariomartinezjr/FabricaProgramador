package Lista12.Teste.src.sobrecarga;

public class Estado {

	public String nome;
	public String uf;
	
     public Estado(){
		
	}
	
	public Estado(String nome, String uf) {
		super();
		this.nome = nome;
		this.uf = uf;
	}


	@Override
	public String toString() {
		return "Estado [nome=" + nome + ", uf=" + uf + "]";
	}
	
	
}
