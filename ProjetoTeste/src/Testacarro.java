import java.util.Scanner;

public class Testacarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tamanho=0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite a quantidade de carros a cadastrar:");
		tamanho = entrada.nextInt();
		
		Carro carro[] = new Carro[tamanho];
		
		for(int i=0; i < carro.length; i++ ){
			Carro c1 = new Carro(); 
			
			System.out.println("Digite o ano:");
			c1.ano=entrada.next();
			
			System.out.println("Digite a marca:");
			c1.marca = entrada.next();
			
			System.out.println("Digite o Modelo:");
			c1.modelo = entrada.next();
			
			carro[i]=c1;
				
			
		}
		entrada.close();
		for (int i=0; i < carro.length; i++){
		
			System.out.println(carro[i].imprimir());
		}
		
	}

}
