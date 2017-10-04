package Lista3;

public class Fabrica {
	
	public int calcularValorCamisetas(int p , int m , int g){
		int valor=0;
		
		valor = (p*10) + (m * 12) + (g*15);
		
		return valor;
	}

}
