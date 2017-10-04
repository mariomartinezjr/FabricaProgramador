package Lista3;

public class Aluno {
	
	public String calcularMedia(Double n1, Double n2, Double n3){
		Double resultado = null;
		
		resultado = (n1+n2+n3) /3;
		if (resultado >= 7){
			return "aprovado";
		}else if (resultado >= 4 && resultado < 7){
			return "pf";
		}else if (resultado < 4 ){
			return "reprovado";
		}
		
		return "erro";		
	}

}
