import java.util.Scanner;

public class matrizAula {

	public static void main(String[] args) {
		
    	Scanner entrada = new Scanner(System.in);

		
		int matriz [][] = new int [2][2];
		
		for (int i=0; i < matriz.length ; i++){
			 for (int j=0; j < matriz.length ; j++){
			 
				 System.out.println("digite o valor:");
				 matriz[i][j]=entrada.nextInt();
			 }
		}
		
		for (int i=0; i < matriz.length; i++){
			System.out.println();
			 for(int j=0; j<matriz.length; j++){
				 System.out.print(matriz[i][j] + "  ");
			 }
		}
	entrada.close();
	}

	
}
