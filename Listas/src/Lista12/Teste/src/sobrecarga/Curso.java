package Lista12.Teste.src.sobrecarga;

public class Curso {
	
	public String descricao;
	
	
	public Curso(){
		
	}
	
	public Curso(String descricao) {
		super();
		this.descricao=descricao;
	}

	@Override
	public String toString() {
		return "Curso [descricao=" + descricao + "]";
	}
	
	

}
