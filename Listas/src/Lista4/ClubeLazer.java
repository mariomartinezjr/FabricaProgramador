package Lista4;

public class ClubeLazer {
	
	double mediaHomem=0;
	int qtdHomem=0;
	double somaIdadeHomem=0;

	double mediaMulher=0;
	int qtdMulher=0;
	double somaIdadeMulher=0;
	
	public double calcularIdadeMediaHomens(int idadeHomem){
	
	qtdHomem++;
	somaIdadeHomem = somaIdadeHomem + idadeHomem;
	mediaHomem = somaIdadeHomem / qtdHomem;
	
	return mediaHomem;
	}
	
	public double calcularIdadeMediaMulheres( int idadeMulher){
	
		qtdMulher++;
		somaIdadeMulher = somaIdadeMulher + idadeMulher;
		mediaMulher = somaIdadeMulher / qtdMulher;
		
		return mediaMulher;
	}
	
	public double calcularIdadeMediaGrupo(double mho , double mmu){
	 double mediaGrupo=0;
	 
	 mediaGrupo = mho + mmu;
	 
	 return mediaGrupo;
		
		
	}

	
}
