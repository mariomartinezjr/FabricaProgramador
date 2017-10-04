package Lista2;

public class CalculoFinanceiro {
	
	public double calculoJuros(double valor , double taxa, int tempo){
		double juros=0.0;
		//calculo juros simples
		//J = P . i . n  = 	J = juros 	P = principal (capital) i = taxa de juros
		//n = número de períodos 
				
		juros = valor * taxa * tempo;
		
		return juros;
	}

	public double calculoPorcentagem(double valor , double taxa){
		double porcentagem=0;
		
		porcentagem = valor * (taxa/100);
		
		return porcentagem;
	}
	
	public Float calculoSalario(Float salario, Float valeTransporte, Float
			ticketAlimentacao){
			return salario+ valeTransporte + ticketAlimentacao;
			}
	
	public Float calculoMedia (Float salario1, Float salario2 ){
		return (salario1 + salario2)/2;
		}
	
	public String juntarNome(String nome1 , String nome2){
		
				
		return nome1 + " " + nome2;
	}
}
