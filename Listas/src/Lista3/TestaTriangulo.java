package Lista3;
import java.util.Scanner;

public class TestaTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner entrada = new Scanner(System.in);
		FiguraGeometrica g = new FiguraGeometrica();
		
		System.out.println("Digite lado 1:");
		Double l1 = entrada.nextDouble();
		
		System.out.println("Digite lado 2:");
		Double l2 = entrada.nextDouble();
		
		System.out.println("Digite lado 3:");
		Double l3 = entrada.nextDouble();
		
		System.out.println(g.identificarTriangulo(l1, l2, l3));
	}

}
