package Lista3;
import java.util.Scanner;
public class TestaFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		Funcionario f1 = new Funcionario();
		
		System.out.println("Digite o salario:");
		Double salario = entrada.nextDouble();
		
		System.out.println("Salario atualizado:" + f1.calcularSalario(salario));
		
	}

}
