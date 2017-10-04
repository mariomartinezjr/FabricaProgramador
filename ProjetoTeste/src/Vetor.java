import java.util.Scanner;

public class Vetor {
	
	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);
		
		int i =0;
		int valor;
		
		System.out.println("Digite o tamanho do vetor: ");
		i= entrada.nextInt();
		
		int vetor [] = new int [i];
		
		for (int x=0 ; x < i ; x++){
			System.out.println("Digite o valor: " + x  + " DE "+ i);
			valor=entrada.nextInt();
			
			vetor[x] = valor; 
		}
		for (int j=0;j<i;j++){
			System.out.println("vetor posicao " + j + "valor: " + vetor[j]);
		}
	}
	

}
