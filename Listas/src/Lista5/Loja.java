package Lista5;

import Lista2.Cliente;

public class Loja {
String busca;
		
	Cliente clientes[]; //vetor para armazenar todos os clientes

	int numeroEntradas = 0; //contador de objetos já inseridos no vetor

	/**
 
      * Método que adiciona um objeto cliente em uma posição do vetor
       respeitando seu limite máximo
     */

	public void adicionarCliente(Cliente novoCliente) {

		//Teste para saber se ainda não chegou no limite do vetor

		if (numeroEntradas < clientes.length) {

			//Adicioanado cliente na posição numeroEntradas que serve como índice.

			clientes[numeroEntradas] = novoCliente;

			//incrementando o numero de entradas

			numeroEntradas++;

		}

	}

	/**
    * Este método percorre o vetor de clientes
    * procurando por todos com idade até 50 anos e imprime todos eles.
    */

		
	public void imprimirClientesAte50Anos() {

		for (int i=0 ; i < clientes.length; i++){
			if (clientes[i].idade <= 50){
				imprimir("ClientesAte50Anos",clientes[i].nome ,clientes[i].sexo, clientes[i].idade);
			}
			
		}
		
}

	/**
     w ww.fabricadeprogramador.com.br / www.htcursos.com
     * Este método percorre o vetor de clientes
     * procurando por todos com idade acima de 50 anos e imprime todos eles.
     */

	public void imprimirClientesAcima50Anos() {

		for (int i=0 ; i < clientes.length; i++){
			if (clientes[i].idade > 50){
				imprimir("ClientesAcima50Anos",clientes[i].nome ,clientes[i].sexo, clientes[i].idade);
			}
			
		}

	}

	/**
    * Este método percorre o vetor de clientes
    * procurando por todos com sexo feminino e imprime todos eles.
    */

	public void imprimirClientesMulheres() {

		for (int i=0 ; i < clientes.length; i++){
			if (clientes[i].sexo == 'F'){
				imprimir("ClientesMulheres",clientes[i].nome ,clientes[i].sexo, clientes[i].idade);
			}
			
		}

	}

	/**
    * Este método percorre o vetor de clientes
    * procurando por todos com sexo masculino e imprime todos eles.
    */

	public void imprimirClientesHomens() {

		for (int i=0 ; i < clientes.length; i++){
			if (clientes[i].sexo == 'M'){
				imprimir("ClientesHomens",clientes[i].nome ,clientes[i].sexo, clientes[i].idade);
			}
			
		}

	}

	/**
    * Este método percorre o vetor de clientes
    * calcula e retorna média das idades dos homens
    */

	public double calcularMediaIdadesHomens(){
       double MediaIdade=0;
       int Contador=0;
       
		for (int i=0 ; i < clientes.length; i++){
			if (clientes[i].sexo == 'M'){
			MediaIdade= MediaIdade + clientes[i].idade;
			Contador++;
				
	}
		}
		
		return MediaIdade / Contador ;

	}

	/**
    * Este método percorre o vetor de clientes
    * calcula e retorna média das idades das mulheres
    */

	public double calcularMediaIdadeMulheres(){

	       double MediaIdade=0;
	       int Contador=0;
	       
			for (int i=0 ; i < clientes.length; i++){
				if (clientes[i].sexo == 'F'){
				MediaIdade= MediaIdade + clientes[i].idade;
				Contador++;
					
		}
			}
			
			return MediaIdade / Contador ;
	}

	/**
    * Este método percorre o vetor de clientes
    * e compara o valor da variável nomeBuscar com o nome do cliente de
    cada posição e quando os nomes forem iguais
    * o método retorna o cliente encontrado
    */

	public String buscarPorNome(String nomeBuscar){
     				
		for (int i=0 ; i < clientes.length; i++){
			if (clientes[i].nome.equals(nomeBuscar)){
				return clientes[i].nome ;
			}
			
		}

		return null;

	}

 
	/**
    * Este método percorre o vetor de clientes
    * e compara as idades entre todos os clientes das posições do vetor
     w ww.fabricadeprogramador.com.br / www.htcursos.com
     para buscar e retornar o cliente com menor idade
     */

	public int buscarClienteMaisJoven(){
         int idade=9999 ;
         
		for (int i=0 ; i < clientes.length; i++){
			if (clientes[i].idade < idade){
				
				idade = clientes[i].idade; 
			}
		}

		return idade;

	}

	/**
    * Este método percorre o vetor de clientes
    * e compara as idades entre todos os clientes das posições do vetor
    para buscar e retornar o cliente com maior idade
    */

	public int buscarClienteMaisVelho(){

	     int idade=0 ;
         
			for (int i=0 ; i < clientes.length; i++){
				if (clientes[i].idade > idade){
					
					idade = clientes[i].idade; 
				}
			}

			return idade;

		

	}
	
	public void imprimir(String mensagem,String nome , Character sexo , int idade){
    System.out.println(mensagem + " : " + nome + " " + sexo + " " + idade );
	}
}

