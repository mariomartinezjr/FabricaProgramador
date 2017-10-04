package Lista14;



public class pprincipal {
	
	/**
	* Produto: Interface
	* Refeicao: Classe que implementa Produto
	* Bebida: Classe que implementa Produto
	* Cobranca: Classe que armazena em vetor os produtos e quantidade
	* (Dica: construa 2 vetores, uma para produto e outra para inteiros de
	quantidades)
	*/
		
	public static void main(String[] args) {
	
		// Montando o Cardárpio
	
		// Instanciando uma refeicao do tipo Almoco no valor de R$ 12,00
	
		Produto almoco = new Refeicao(TipoProdutoEnum.ALMOCO, 12.0);
	
		// Instanciando uma refeicao do tipo Marmita no valor de R$ 10,00
	
		Produto marmita = new Refeicao(TipoProdutoEnum.MARMITA, 10.0);
	
		// Instanciando uma Bebida do tipo SUCO no valor de R$ 5,00
	
		Produto suco = new Bebida(TipoProdutoEnum.SUCO, 5.0);
	
		// Instanciando uma Bebida do tipo REFRIGERANTE no valor de R$ 6,00
	
		Produto refrigerante = new Bebida(TipoProdutoEnum.REFRIGERANTE, 6.0);
	
		
		//Instanciando em classe anonima a interface Produto
	
		Produto almocoPromocional = new Produto() {
	
			@Override
	
			public double getValor() {
	
				return 8.0;
	
			}
			@Override
	
			public TipoProdutoEnum getTipo() {
	
				return TipoProdutoEnum.ALMOCO;
	
			}
	
			@Override
			public String toString() {
				return getTipo() +" " + getValor() ;
			}
		};
	
		// Montando a Cobrança
	
		// Objeto de Cobranca, passando 5 posicoes a serem armazenadas
	
		Cobranca cobranca = new Cobranca(5);
	
		// Armazena em um vetor os itens da cobranca e em outro vetor a
	
		// quantidade
	
		cobranca.adicionar(almoco, 1);
		cobranca.adicionar(marmita, 2);
		cobranca.adicionar(suco, 1);
		cobranca.adicionar(refrigerante, 1);
		cobranca.adicionar(almocoPromocional, 2);
		
		// Imprime os itens pedidos, valor unidade, suas quantidades e	valor
		// total
		
		cobranca.imprimirRelatorio();
		cobranca.imprimirTotal();
		}
		}


