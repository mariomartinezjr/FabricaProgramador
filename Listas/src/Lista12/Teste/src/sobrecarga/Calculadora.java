package Lista12.Teste.src.sobrecarga;

public class Calculadora {
	
	public static int soma(int n1 , int n2) {
		int soma;
		
		soma = n1 + n2;
		
		return soma;
	}

	public static int soma(int n1 , int n2, int n3) {
		int soma;
		
		soma = n1 + n2 + n3;
		
		return soma;
	}
	
	public static Double soma(Double n1 , Double n2, Double n3) {
		Double soma;
		
		soma = n1 + n2 + n3;
		
		return soma;
	}
	public static Integer multiplica(Integer n1, Integer n2) {
		Integer valor=0;
		
		valor = n1 * n2;
		
		return valor;
	}
	
	public static Double subtrair(Double n1, Double n2) {
		Double valor=0d;
		if (n1 > n2) {
		valor= n1 - n2;
		}else
			valor = n2 -n1;
		return valor;
	}

}
