package Lista3;
import java.util.Scanner;
public class TestaTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner entrada = new Scanner(System.in);
		Temperatura t1 = new Temperatura();
		
		System.out.println("Digite a temperatura em Graus Celsius:");
		Float temp = entrada.nextFloat();
		
		System.out.println(temp + "C " + " para Faren..: " + t1.converterCelsiusParaFah(temp));
	}

}
