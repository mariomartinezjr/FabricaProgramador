package Lista7;
import java.util.Date;

public class Pedido {
	
	private Date data;
	private Cliente cliente;
	private ItemPedido itens[];
	private Integer numeroEntradas = 0;
	
	//getters and setters
	
	
	//public void setItens(ItemPedido pedido[]){
		
	//	this.itens = pedido;
	//}
	
	public void setItens(ItemPedido itens[]){
		
		this.itens = ordenarItensPedidoInsertionSort(itens);
		
	}
	
	public void setCliente(Cliente cliente){
		
		this.cliente = cliente;
	}
	
	public void setData(Date hoje){
		this.data= hoje;
	}
	
	public Double calcularValorTotal() {
	
		Double somaValorTotal = 0.0;
	
		for (int i = 0; i < numeroEntradas; i++) {
	
			somaValorTotal = somaValorTotal + itens[i].getValor();
	
		}
	
		return somaValorTotal;
	
	}
	
	public void imprimirItens() {
	
		
		for (int i = 0; i < numeroEntradas; i++) {
	
			System.out.print(itens[i].getDescricao()	+"\t:"+itens[i].getValor()+"\n");
	
		}
		
	}
	
		
	
		public void adicionarItemPedido(ItemPedido itemPedido) {
	
			Integer codigoNovoItem = itemPedido.getCodigo();
	
			if (numeroEntradas == itens.length) {
					if (codigoNovoItem > itens[numeroEntradas - 1].getCodigo()) {
	
					return;
					}
				} else {
	
				numeroEntradas++;
				}
	
			int i = numeroEntradas - 1;
				for (; i >= 1 && codigoNovoItem < itens[i - 1].getCodigo(); i--) {
					itens[i] = itens[i - 1];
				}
				itens[i] = itemPedido;
			}
		
		public ItemPedido removerItemPedido(Integer i){
		
			if(i<0 || i>= numeroEntradas){
				System.out.println("Erro! Índice inválido");
						}
				ItemPedido temp = itens[i];
				for( int j=i ; j< numeroEntradas -1; j++){
					itens[j] = itens[j+1];
				}
				itens [numeroEntradas -1] = null;
		        numeroEntradas--;
		
		return temp;
		
}

		
	public ItemPedido[] ordenarItensPedidosBubbleSort(ItemPedido itens[]) {
		
		ItemPedido aux;
		
		for (int i = 0; i < numeroEntradas; i++) {
		
			for (int j = 0; j < numeroEntradas-1; j++) {
		
				if (itens[j].getCodigo() > itens[j + 1].getCodigo()) {
		
					aux = itens[j];
		
					itens[j] = itens[j + 1];
		
					itens[j + 1] = aux;
		
				}
		
			}
		
		}
		
		return itens;
		
	}


public ItemPedido[] ordenarItensPedidoInsertionSort(ItemPedido itens[]) {
		
		ItemPedido eleito;
		
		for (int i = 0; i < numeroEntradas; i++) {
					eleito = itens[i];
					int j;
		
			for (j = i - 1; (j >= 0) && (itens[j].getCodigo() > eleito.getCodigo()); j--) {
						itens[j + 1] = itens[j];
					}
					itens[j + 1] = eleito;
				}
		
		return itens;
		}

	public ItemPedido buscaLinearItemPedido
		(Integer codigo) {

		for (int i = 0; i < itens.length; i++) {

			if (itens[i].getCodigo() == codigo) {

				return itens[i];

			}

		}

		return null;

	}

	public ItemPedido buscaBinariaItemPedido(Integer codigo ) {
		 
		boolean achou = false;
				int alto = itens.length - 1;
				int baixo = 0;
				int meio = alto / 2;
		 
				while (!achou && alto >= baixo) {
		 
					if (codigo == itens[meio].getCodigo()) {
		 
						achou = true;
		 
					} else if (codigo < itens[meio].getCodigo()) {
		 
						alto = meio -1;
		 
					} else {
		 
						baixo = meio + 1;
		 
					}
		 
					meio = (alto + baixo) / 2;
		 
				}
		 
				return ( (achou) ? itens[meio] : null);
		}

}
