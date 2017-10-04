package Lista5;

import java.util.Scanner;
import Lista2.Cliente;

public class ProgramaPrincipalLoja {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		// Instanciando um objeto Loja

		Loja lojinhaDaMaria = new Loja();
		

		// Criando um vetor para a loja e atribuindo na propriedade clientes[]
		// da loja

		lojinhaDaMaria.clientes = new Cliente[3];
		
		for (int i = 0; i < lojinhaDaMaria.clientes.length; i++) {
			
			Cliente cli1 = new Cliente();

			System.out.println("Digite o nome do cliente");
			cli1.nome = leitor.next();
			System.out.println("Digite o sexo do cliente");
			cli1.sexo = leitor.next().charAt(0);
			System.out.println("Digite a idade do Cliente");
			 cli1.idade= leitor.nextInt();
			 lojinhaDaMaria.adicionarCliente(cli1);
			
		}
			
			System.out.println("Clientes até 50 anos: ");
			lojinhaDaMaria.imprimirClientesAte50Anos();
			System.out.println("Clientes acima de 50 anos: ");
			lojinhaDaMaria.imprimirClientesAcima50Anos();
			System.out.println("Sexo Feminino");
			lojinhaDaMaria.imprimirClientesMulheres();
			System.out.println("Sexo Masculino");
			lojinhaDaMaria.imprimirClientesHomens();
		

	}
}