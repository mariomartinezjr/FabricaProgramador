package Lista16;

public class ValidaNumeros {
	
	public static void validar(double n1 , double n2) throws CalculoException {
		
		
		if (n1 == 0 && n2 == 0) {
			throw new CalculoException ("Indefinido! O numerador e o denominador não devem ser  iguais a zero.");
		} else if (n1 != 0 && n2 ==0) {
			throw new CalculoException ("O denominador não devem ser igual a zero.");
		}
	}

}
