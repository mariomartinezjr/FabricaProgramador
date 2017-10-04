import java.util.Scanner;

public class TestaFatorial{

	public static void main(String [] args){
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite um numero: ");
		int n1 = entrada.nextInt();
	
		int numero = Fatorial.CalcularFatorial(n1);
		System.out.println("fatorial de " + n1 +  " = " + numero);
	}
	
	
	
}