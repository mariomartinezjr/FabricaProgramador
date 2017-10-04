package Lista3;
import java.util.Scanner;

public class TestaCamiseta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		Fabrica f = new Fabrica();
		
		
		System.out.println("Digite a quantidade de camisetas pequenas:");
		int p = entrada.nextInt();
		
		System.out.println("Digite a quantidade de camisetas medias:");
		int m = entrada.nextInt();
		
		System.out.println("Digite a quantidade de camisetas grandes:");
		int g = entrada.nextInt();
		
		System.out.println(f.calcularValorCamisetas(p, m, g));
		
		entrada.close();
	}

}
