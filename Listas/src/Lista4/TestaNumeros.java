package Lista4;
import java.util.Scanner;
public class TestaNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		ImpressaoNumeros p = new ImpressaoNumeros();
		
		System.out.println("Digite um numero:");
		int numero = entrada.nextInt();
		
		p.imprimirPares(numero);

	}

}
