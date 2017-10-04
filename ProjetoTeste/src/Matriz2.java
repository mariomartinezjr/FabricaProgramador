import java.util.Scanner;

public class Matriz2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int tamanho=0;
		System.out.println("digite o tamanho da matriz:");
		tamanho = entrada.nextInt();
		
		int matriz [][] = new int [tamanho][tamanho];
		
		for (int i=0; i < matriz.length ; i++){
			 for (int j=0; j < matriz.length ; j++){
			 
				 System.out.println("digite o valor:");
				 matriz[i][j]=entrada.nextInt();
			 }
		}
		
		for (int i=0; i<matriz.length; i++){
			 for(int j=0; j<matriz.length; j++){
				 System.out.println(matriz[i][j]);
			 }
		}
	entrada.close();
	}

	
}
