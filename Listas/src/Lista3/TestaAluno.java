package Lista3;
import java.util.Scanner;
public class TestaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		Aluno a = new Aluno();
		
		System.out.println("digite a primeira nota:");
		Double n1=entrada.nextDouble();
		
		System.out.println("digite a segunda nota:");
		Double n2=entrada.nextDouble();
		
		System.out.println("digite a terceira nota:");
		Double n3=entrada.nextDouble();
		
		System.out.println("Resultado: " + a.calcularMedia(n1, n2, n3));
		
	}

}
