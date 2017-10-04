import java.util.Scanner;

public class Testav1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculadorav1 calc = new Calculadorav1();
		Scanner entrada = new Scanner(System.in);
		
		int continua;
		
		do{
		
		System.out.println("Digite o primeiro numero:");
		Double n1 = entrada.nextDouble();

		System.out.println("Digite o segundo numero:");
		Double n2 = entrada.nextDouble();
		
		System.out.println("Digite a operacao: 1-soma , 2-subtracao , 3-multiplicação, 4=divisão:");
		int operacao = entrada.nextInt();

		Double valor=calc.Calcular(n1,n2,operacao);
		if(valor == null && operacao ==4){
			System.out.println("Divisão por zero não permitida");
		}else if (valor == null){
			
			System.out.println("Opção invalida");
		}else{
		System.out.println(valor);
		}
		System.out.println("deseja continuar? 1- sim , 2 - não");
		continua = entrada.nextInt();
		}while (continua == 1 );
		
		entrada.close();
		
	}
	
}
