import java.util.Scanner;

public class TestaCalculadora {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		int resultado;
		
		Scanner entrada = new Scanner(System.in);
		
		int i =0;
		//for (int i=0; i < 3 ; i++){
		
		//while (i < 3 ){
		
		do {
		
		System.out.println("Digite o primeiro numero: ");
		int n1 = entrada.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int n2 = entrada.nextInt();
		
		System.out.println("Digite a operacao: ");
		int operacao = entrada.nextInt();
		
		resultado = calc.Calcular(n1,n2,operacao);
		
		if (resultado == 9){
		System.out.println("Resultado = Numdero invalido"  );
		}else{
			System.out.println(resultado);
		}
		//i++;
		System.out.println("1-Continua 2 -cancela: ");
		 i = entrada.nextInt();
		
		}while (i == 1) ;
        entrada.close();
	}
       
}
