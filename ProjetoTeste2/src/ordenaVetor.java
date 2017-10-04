
public class ordenaVetor {

	public static void main(String[] args) {
		
	int []lista = {5,4,3,2,1,0};
	
	// bubble sort
	
	int aux;
	
	for (int i=0; i < lista.length ; i++){
		for(int j=0; j < lista.length-1; j++){
			if (lista[j] > lista[j+1]){
				aux= lista[j];
				lista[j] = lista[j+1];
				lista[j+1]=aux;
			}
		}
	}
	
	// insertion sort
	//int j;
	//int valor;
	
	//for (int i =1; i < lista.length; i++){
		//valor = lista[i];
	  //	for (j= i -1; (j >= 0) && (lista[j] > valor) ; j--){
			
		//	lista[j+1] = lista[j];
			
//		}
		
	//	  lista[j+1] = valor;
	//}
	
	for (int i=0; i < lista.length ; i++){
		System.out.println(lista[i]);
	}
		
	}
	}


