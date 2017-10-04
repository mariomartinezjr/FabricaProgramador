package SitemaPedido;

import java.util.Arrays;

public class PedidoImpl implements Pedido{

	private Integer codigo;
	private Double valor;
	private Cliente cliente;
	private ItemPedido itens[]= new ItemPedido[3];
	private int contador;
	
	@Override
	public Integer getCodigo() {
		// TODO Auto-generated method stub
		return codigo;
	}

	@Override
	public Double calcularValorTotal() {
		// TODO Auto-generated method stub
		Double soma=0d;
		for(int i=0; i< itens.length; i++) {
		if (itens[i] == null) {
			soma= soma + 0d;
		}else
		soma = soma + itens[i].getValor();
		}
		return soma;
	}

	@Override
	public void adicionarItem(ItemPedido itemPedido) {
		// TODO Auto-generated method stub
		if(contador < itens.length) {
			itens[contador] = itemPedido;
			contador++;
		}
		
	}

	@Override
	public void removerItemPedido(ItemPedido itemPedido) {
		// TODO Auto-generated method stub
		
		if (itemPedido.getCodigo() < 0 || itemPedido.getCodigo() >= contador) {
			System.out.println("Erro no Tamanho do Vetor!!");
		}
		
		ItemPedido aux = itemPedido;
		for (int i = 0; i < contador-1; i++) {
			if(itens[i].equals(itemPedido)) {
				//itens[i]=null;
				itens[i].setValor(0d);
				itens[i].setCodigo(0);
				contador=i;
			} 
				
		}	
		
	}

	@Override
	public void imprimirItens() {
		// TODO Auto-generated method stub
		for (int i = 0; i < itens.length; i++) {
			if (itens[i].getCodigo() != 0) {
				
				System.out.println(itens[i]);
			}
		}
	}

	@Override
	public ItemPedido[] ordenarItensPedidos() {
		// TODO Auto-generated method stub
		
		ItemPedido aux;
		for (int i = 0; i < itens.length; i++) {
			for (int j = 0; j < itens.length-1; j++) {
				
				if (itens[j].getCodigo() > itens[j+1].getCodigo()) {
					aux =itens[j];
					itens[j]= itens[j+1];
					itens[j+1] = aux;
				}
				
			}
			
		}
		return itens;
	}

	

	@Override
	public ItemPedido[] getItensPedidos() {
		// TODO Auto-generated method stub
		return itens;
	}

	
	
}
