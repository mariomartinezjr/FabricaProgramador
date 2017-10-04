package Lista6;

import java.util.Scanner;

public class Aluno {

	double notas[][] = new double[2][2];

	int linha = 0;

	int coluna = 0;
/**
 * AULA 6 MATRIZES
 * Insere notas em uma matriz MISSÃO: Sua missão é ajustar este método
para
 * permitir apenas entradas de notas entre ZERO e DEZ Se a nota não
estiver
 * neste intervalo então não pode ser inserida e você deve cuidar os
indices
 * i e j para não serem incrementados
 *
 * @param nota
 * Nota de entrada
 */

	public void adicionarNota(double nota) {

		if (nota >= 0 && nota <= 10){
			
		
		if (linha < notas.length) {
			
			notas[linha][coluna] = nota;

		}

		// (incrementa a coluna) se ainda chegou no final da coluna

		if (coluna < notas[0].length) {
			
			coluna++;
           
		}

		// troca de linha (incrementa linha) e reinicia a coluna

		if (coluna == notas[0].length) {
 
			 
			linha++;

			coluna = 0;

		}
		}
	}
/**
 * AULA 6 MATRIZES
 * Este método tem a funçao de reiniciar a matriz com seus valores -1 em
 * cada posição. MISSÃO: Implemente o método para atribuir -1 em todas as
 * posições. Os valores iniciais em cada posição da matriz não pode ser
zero
 * neste caso porque ZERO poder ser considerado uma nota válida, e -1 não
é
 * uma nota válida
 */

	public void limparNotas() {

	for(int i=0; i < notas.length ; i++){
		for (int j=0; j < notas.length;j++){
		
			notas[i][j]=-1;
		}
	}
}
/**
 * AULA 6 MATRIZES
 * MISSÃO: Implementar método que percorre a matriz procurando a maior
nota
 * e após encontrar retorne essa nota
 *
 * @return a maior nota
 */

	public double maiorNota() {
     
		double maiorNota=0;
		
		for(int i=0; i < notas.length ; i++){
			for (int j=0; j < notas.length;j++){
			
				if(notas[i][j] > maiorNota){
					maiorNota = notas[i][j]; 
									
				}
			}
		}

		return maiorNota;

	}
/**
 * AULA 6 MATRIZES
 * MISSÃO: Implementar um método que altera uma nota especifica já
cadastrada pelo número da ordem de inserção, ou seja,
 * faz a atribuição em uma posição específica da matriz alterando a nota.
 * *
 * Ex: de chamada:
 * aluno.alterarNota(9.5, 4);
 * Neste caso está pedindo para alterar a quarta nota inserida para 9.5,
ou seja, a matriz na posição [linha 1] e [coluna 1] deve
 * ser atribuida da nota 9.5
 *
 * Outro exemplo:
 * aluno.alterarNota(7.5, 2) neste caso segunda nota é para ser alaterada
que é referente a posição [linha 0][coluna 1]
 *
 * @param novaNota a nota Nota a ser alterada
 * @param ordem Um numero que varia de 1 a 4 que identifica qual nota a
ser alterada.
 */

	public void alterarNota(double novaNota, int ordem) {
     
		int coluna=0;
		int linha=0;
		
		//descobre a coluna
		if (ordem / 2 == 1 && ordem % 2 == 1){
			linha= ordem /2;
			
		}else{
			if (ordem / 2 > 1 && ordem % 2 == 0 ){
				linha= ordem /2 -1;
			}
		
			//descobre a linha
		}if (linha == 0){
			coluna = ordem -1;
		}else {
			if (linha ==1 ){
				coluna = ordem -3;
			}
		}
		notas[linha][coluna] = novaNota;
	
		
	}
/**
 * AULA 6 MATRIZES
 * MISSÃO: Implementar um método que retorna uma nota específica dada a
ordem.
 * Ex:
 *
 * A chamada aluno.buscarNota(1); deve retornar a nota da posicao [0][0]
 w ww.fabricadeprogramador.com.br / www.htcursos.com
 * A chamada aluno.buscarNota(2); deve retornar a nota da posicao [0][1]
 * e assim por diante.
 * @param ordem Um numero que representa a ordem de entrada da nota
 * @return a nota da ordem informada
 */

	public double buscarNota( int ordem){

		int coluna=0;
		int linha=0;
		
		//descobre a coluna
		if (ordem / 2 == 1 && ordem % 2 == 1){
			linha= ordem /2;
			
		}else{
			if (ordem / 2 > 1 && ordem % 2 == 0 ){
				linha= ordem /2 -1;
			}
		
			//descobre a linha
		}if (linha == 0){
			coluna = ordem -1;
		}else {
			if (linha ==1 ){
				coluna = ordem -3;
			}
		}
		return notas[linha][coluna] ;
		}
/**
 * AULA 6 MATRIZES
 * MISSÃO: Implementar método que percorre a matriz procurando pela menor
 * nota e após encontrar retorne essa nota
 *
 * @return a maior nota
 */

	public double menorNota() {

         double menorNota=11;
		
		for(int i=0; i < notas.length ; i++){
			for (int j=0; j < notas.length;j++){
			
				if(notas[i][j] < menorNota){
					menorNota = notas[i][j]; 
									
				}
			}
		}
		return menorNota;

	}
/**
 * AULA 6 MATRIZES
 * MISSÃO: Implementar método que percorre a calcula a média entre as
notas
 *
 * @return
 */

	public double calculaMediaNotas() {

		double media=0;
	    	
		for(int i=0; i < notas.length ; i++){
			for (int j=0; j < notas.length;j++){
	    	media = media + notas[i][j];
		
			}
		}
		return media/4;

	}
/**
 * AULA 6 MATRIZES
 * MISSÃO: Implementar método que percorre e imprime as notas da ultima
 * posição até a primeira em ordem inversa a ordem de entrada
 */

	public void imprimirNotasInverso() {

		for(int i=notas.length-1; i >= 0 ; i--){
			for (int j=notas.length-1; j >=0 ;j--){
	        
				System.out.println(notas[i][j]);	
			}
			
		}
		
	}	

	public double selecionaOpcao(int opcao){
	
		Scanner entrada = new Scanner(System.in);
		
		switch (opcao){
		case 1:
			System.out.println("digite a nova nota:");
			double novaNota= entrada.nextDouble();
			
			System.out.println("digite a ordem");
			int  ordem = entrada.nextInt();
			
			alterarNota(novaNota, ordem); 
			break;
			
		case 2:
			System.out.println("digite a posicao:");
			int posicao = entrada.nextInt();
			
			System.out.println("Nota da posição " + posicao + " é: " + buscarNota(posicao));
			break;
			
		case 3:
			System.out.println("Media das notas: " + calculaMediaNotas());
			break;
			
		case 4:
			System.out.println("A maior nota é : " + maiorNota());
			break;
			
		case 5:
			System.out.println("A menor nota é: " +menorNota());
			break;
    
		case 6:
			imprimirNotasInverso();
			break;
			
		case 7:
			limparNotas();
			break;
		}
		return 0;
	}


	public void imprimeNotas(){
		
		int contador=1;
		
		for(int i=0; i < notas.length ; i++){
			for (int j=0; j < notas.length;j++){
			
				System.out.println("\n" + "Nota " + contador +   " é : " + notas[i][j]);
				contador ++;
			}
			}
	}

}
