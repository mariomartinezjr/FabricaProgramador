package Lista4;

import java.util.Scanner;

public class TestaParImpar {

	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);
		NumerosParesEImpares n1 = new NumerosParesEImpares();
		
		int numero;
		int continua;
		
		do{
			System.out.println("Digite um numero");
			numero = entrada.nextInt();
			
			n1.classificarNumero(numero);
			
			System.out.println("Deseja continuar? 1=sim , 2 = não");
			continua = entrada.nextInt();
		}while (continua ==1);
		entrada.close();
	System.out.println("Quantidade de numeros pares:" + n1.qtdPar);
	System.out.println("Quantidade de numeros impares:" + n1.qtdImpar);
	}
}
