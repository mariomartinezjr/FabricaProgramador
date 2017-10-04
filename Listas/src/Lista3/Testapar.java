package Lista3;
import java.util.Scanner;


public class Testapar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		Calculadorav1 c1 = new Calculadorav1();
		
		System.out.println("digite um numero:");
		int n1 = entrada.nextInt();
		
		System.out.println(c1.parOuImpar (n1));
				
	}

}
