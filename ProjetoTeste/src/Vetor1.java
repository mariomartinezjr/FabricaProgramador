import java.util.Scanner;
public class Vetor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c=0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor");
		c= entrada.nextInt();
		
		Double notas[] = new Double[c];
		
		for(int i=0;i< c; i++){
			System.out.println("Digite uma nota");
			notas[i]= entrada.nextDouble();
			
		}
		
		
		for(int i=0;i< c; i++){
			System.out.println(notas[i]);
			
			entrada.close();
	}

}
}