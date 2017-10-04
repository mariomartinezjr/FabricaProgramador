package Lista3;

public class Funcionario {

	
	public Double calcularSalario(Double salario){
		Double ns =null;
		
		ns = (salario + (salario * 0.15)) ;
		ns =ns -(ns*0.08);
		return ns;
	}
}
