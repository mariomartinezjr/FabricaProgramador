public class Testa {

	public static void main(String[] args) {
		
		int []vetor = {5,4,3,2,1,0};
        int aux ;

for (int i=0; i < vetor.length; i++){
	for(int j=0; j < vetor.length-1;j++){
		System.out.println();
		if (vetor[j] > vetor[j+1]){
			
			aux= vetor[j];
			vetor[j]=vetor[j+1];
			vetor[j+1]= aux;
								}
		for (int a=0; a < vetor.length; a++){
			System.out.print(vetor[a] + " ");
		}
	}}

	}
	
	}
		