package Lista10;

public class Curso {
	
	private String nome;
	private int cargaHoraria;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", cargaHoraria=" + cargaHoraria + "]";
	}
	
	
	

}
