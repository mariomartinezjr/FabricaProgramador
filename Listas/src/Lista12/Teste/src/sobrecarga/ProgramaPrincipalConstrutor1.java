package Lista12.Teste.src.sobrecarga;

import java.util.Date;

public class ProgramaPrincipalConstrutor1 {

	
	public static void main(String[] args) {
	//exercicio 1
		//2 Sobrecarca do metodo soma
		System.out.println(Calculadora.soma(10,25));
		System.out.println(Calculadora.soma(10.6,25.6, 3.6));
		//2 sobrecargas de construtor
		System.out.println(new Cidade("Campo Grande", new Estado("Mato Grosso do Sul", "MS")));
		
		//exercicio 2
	Cliente cliente1 = new Cliente("Edson Silva de Souza", "904.567.973-88","0009264-86 SSP/MS",	new Cidade("Campo Grande", new Estado("Mato Grosso do Sul", "MS")));
	Cliente cliente2 = new Cliente("Z� Bento dos Santos", new Cidade("Campo Grande",new Estado("Mato Grosso do Sul", "MS")));
		
		
		System.out.println(cliente1);
		System.out.println(cliente2);
		
		//exercicio 3
		Matricula matricula = new Matricula(new Aluno("Jao da Silva"), new Curso("F�brica de Programador"), new Date());
		
		System.out.println(matricula);
		//System.out.println("teste");
		
		//exercicio 4
		double valor = Calculadora.multiplica ( Calculadora.soma(10, 20) , Calculadora.soma(10, 20, 15) );
				System.out.println(valor);

				
				//exercicio 5
				
				double salarioFuncionario = new Funcionario ("Z�",	100.5).getSalario();
						double salarioProgramador = new
						Programador("J�o",1000.4).getSalario();
						double diferenca = Calculadora.subtrair(salarioFuncionario,
						salarioProgramador);
						System.out.println(diferenca);
	
						
						//exercicio 6
						
						double salarioCalculado = new Funcionario ("Z�",
								1000.0).calcularSalario(Funcionario.MARGEM_PADRAO);
								System.out.println("mimi" + salarioCalculado);
								
	}
	
	
	
	

}
