package Lista2;
import java.util.Scanner;

public class TestaClalculo {

	public static void main(String[] args) {
		
		CalculoFinanceiro cf = new CalculoFinanceiro();
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o valor 1");
		double valor1 = entrada.nextDouble();
		
		System.out.println("Digite a taxa");
		double taxa = entrada.nextDouble();
		
		System.out.println("Digite o salario");
		Float salario = entrada.nextFloat();
		
		System.out.println("Digite o valor do vale transporte");
		Float vt = entrada.nextFloat();
		
		System.out.println("Digite o valor do vale alimentação");
		Float va = entrada.nextFloat();
		
		System.out.println("Digite o valor do primeiro salario");
		Float sal1 = entrada.nextFloat();

		System.out.println("Digite o valor do segundo salario");
		Float sal2 = entrada.nextFloat();

		
		Double porc = cf.calculoPorcentagem(valor1, taxa);
		System.out.println(porc);
		
		System.out.println(cf.calculoSalario(salario, vt, va));
		
		System.out.println(cf.calculoMedia(sal1, sal2));
		
		System.out.println(cf.juntarNome("mario", "martinez"));
		
		entrada.close();
	}

}
