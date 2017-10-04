public class Calculadorav1 {

	String marca;
	String modelo;
	Integer tamanho;
	Double peso;
	
	public String parOuImpar(int n1){
		
		if (n1 % 2 == 0){
			return "par";
		}else
		return "impar";
	}
	
	public Double Calcular(Double n1,Double n2, int operacao){
		Double resultado;
		if(operacao ==1){
			resultado= calcularSoma(n1, n2);
					return resultado;
		}else if(operacao == 2){
			resultado=calcularSubtracao(n1, n2);
		return resultado;	
		}else if (operacao == 3){
			resultado=calcularMultiplicacao(n1, n2);
			return resultado;
		}else if (operacao ==4){
			resultado=calcularDivisao(n1, n2);
			return resultado;
		}else{
			return null;	
		}
		
		
	}
	
	public  Double calcularSoma(Double n1,Double n2){
		
		Double x=0.0d;
		x = n1+ n2;
		return x;
	}
	
public  Double calcularSubtracao(Double n1,Double n2){
		
		Double x=0.0d;
		x = n1- n2;
		return x;
	}

public  Double calcularMultiplicacao(Double n1,Double n2){
	
	Double x=0.0d;
	x = n1 * n2;
	return x;
}

public  Double calcularDivisao(Double n1,Double n2){
	Double x = null;
	
	if (n2 > 0 && n1 >0)   {
	x = n1 / n2;
	}
	return x;
	}
}
	