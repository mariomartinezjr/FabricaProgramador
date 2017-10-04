package Lista4;

public class NumerosParesEImpares {

	public int qtdPar;
	public int qtdImpar;
	
	public void classificarNumero(int numero){
		
		if (numero % 2 ==0){
			qtdPar++;
		}else{
			
			qtdImpar++;
		}
		
	}
}
