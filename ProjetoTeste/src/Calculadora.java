
public class Calculadora {
	
	public int Calcular(int n1 , int n2 , int operacao){
		int valor=0;
				
		if (operacao == 1 ){
		valor= n1 + n2;
		}else{
		
		if (operacao == 2 ){
		valor= n1 - n2;
		}else {
		
		if (operacao == 3 ) {
		valor= n1 * n2;		
		}else {
		
		if (operacao == 4 ){
				
			valor= n1 / n2;
		}else{
		
			valor=9;
		}
	
	     	  }
			
	      }
		            }
	
			
		return valor;
		}	

	
}
