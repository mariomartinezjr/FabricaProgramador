package Lista12.Teste.src.sobrecarga;

public class Funcionario {
	
	public static final Double  MARGEM_PADRAO = 124d;
	private String nome;
	private Double salario;
	
	
	public String getNome() {
		return nome;
	}
	
	public Funcionario() {
	
	}
	
	public Funcionario(String nome, Double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public double calcularSalario(Double margemPadrao) {
		
		
		return salario = salario + (salario * margemPadrao);
	}
	
	

}
