package Lista6;

import java.util.Scanner;

public class ProgramaPrincipalMatrizes {


	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int continua =0;
		for (int i =0; i < 3; i++){
		
			Aluno jao = new Aluno();

			System.out.println("Digite a nota 1: ");
			double nota1= entrada.nextDouble();
			jao.adicionarNota(nota1);

			System.out.println("Digite a nota 2: ");
			double nota2= entrada.nextDouble();
			jao.adicionarNota(nota2);

			System.out.println("Digite a nota 3: ");
			double nota3= entrada.nextDouble();
			jao.adicionarNota(nota3);

		    System.out.println("Digite a nota 4: ");
			double nota4= entrada.nextDouble();
			jao.adicionarNota(nota4);
			
		
			do{
			System.out.println("digite a opção desejada:");
			System.out.println("1 alterar nota");
			System.out.println("2 buscar nota");
			System.out.println("3 Calcular media");
			System.out.println("4 ver a maior nota");
			System.out.println("5 ver a menor nota");
			System.out.println("6 imprimir notas na ordem inversa");
			System.out.println("7 limpar notas");
			int opcao = entrada.nextInt();
			
			jao.selecionaOpcao(opcao);
			
						
			System.out.println("deseja realizar mais alguma operação? 0- sim , 1- não");
			continua= entrada.nextInt();
			
			}while (continua ==0);
			
			jao.imprimeNotas();
		
		}
		entrada.close();
		
				
	}
}
