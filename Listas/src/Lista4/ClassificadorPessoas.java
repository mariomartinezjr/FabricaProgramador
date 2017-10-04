package Lista4;

public class ClassificadorPessoas {

	public double qtdMediaIdades;
	public double qtdBaixinhosGordos;
	public double porcentagemJovensAltos;

	public void calcular(int idade, double peso, double altura){

		qtdMediaIdades =qtdMediaIdades + idade;

		if (peso > 90 && altura < 1.50){
			qtdBaixinhosGordos++;
		}
		if (idade > 10 && idade < 30 && altura > 1.90){
			porcentagemJovensAltos++;
		}
		
	}
}