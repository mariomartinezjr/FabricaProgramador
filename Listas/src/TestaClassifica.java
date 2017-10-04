import java.util.Scanner;

import Lista4.ClassificadorPessoas;

public class TestaClassifica {

	public static void main(String[] args) {

		
		Scanner entrada = new Scanner(System.in);
		ClassificadorPessoas c1 = new ClassificadorPessoas();
		
		for (int i =0; i < 10; i++){
			
			System.out.println("Digite a idade:");
			int idade = entrada.nextInt();
			
			System.out.println("Digite o Peso:");
			double peso = entrada.nextDouble();
			
			System.out.println("Digite a Altura:");
			double altura = entrada.nextDouble();
			
			c1.calcular(idade, peso, altura);
		}

		System.out.println("Media das idades:" + c1.qtdMediaIdades/10);
		System.out.println("Baixinhos Gordos:" + c1.qtdBaixinhosGordos);
		System.out.println("Jovens altos:" + (c1.porcentagemJovensAltos/10) * 100);
	}

}
