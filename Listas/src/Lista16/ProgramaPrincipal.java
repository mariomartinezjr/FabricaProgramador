package Lista16;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		
		System.out.println("digite um numero");
		double n1 = entrada.nextDouble();
				
		System.out.println("digite um nunero");
		double n2 = entrada.nextDouble();
		
		try {
			ValidaNumeros.validar(n1, n2);
		    System.out.println(Calculadora.dividir(n1, n2));
		} catch (CalculoException e) {
			System.out.println(e.getMessage());
		}
		entrada.close();
	}

}
