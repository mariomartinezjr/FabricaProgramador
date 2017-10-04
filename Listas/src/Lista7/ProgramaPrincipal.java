package Lista7;
import java.util.Date;

public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		
		Cliente jao = new Cliente();
		jao.setNome("Jão da Silva");
		
		Date hoje = new Date();
		
		Pedido pedido1 = new Pedido();
		pedido1.setData(hoje);
		pedido1.setCliente(jao);
		
		ItemPedido livro = new ItemPedido();
		
		livro.setDescricao("Livro de Java");
		livro.setCodigo(10);
		livro.setValor(100.0);
		
		ItemPedido cursoPresencialJava = new ItemPedido();
		
		cursoPresencialJava.setDescricao("Curso de Java");
		cursoPresencialJava.setCodigo(5);
		cursoPresencialJava.setValor(1200.00);
		
		ItemPedido cursoOnlineJava = new ItemPedido();
		
		cursoOnlineJava.setCodigo(3);
		cursoOnlineJava.setDescricao("Curso On Line de Java");
		cursoOnlineJava.setValor(850.00);
		
		//pedido1.setItens(pedidos);
		//pedido1.imprimirItens();
		//pedido1.ordenarItensPedidoInsertionSort(pedidos);
		
		pedido1.setItens(new ItemPedido[3]);
		pedido1.adicionarItemPedido(livro);
		pedido1.adicionarItemPedido(cursoPresencialJava);
		pedido1.adicionarItemPedido(cursoOnlineJava);
		pedido1.imprimirItens();
		pedido1.removerItemPedido(0);
		//pedido1.imprimirItens();

		System.out.println("---------------------------------------------");
		
		System.out.println();
		
		Double valorTotal = pedido1.calcularValorTotal();
		
		System.out.println(valorTotal);
		System.out.println("---------------------------------------------");
		
		System.out.println();
		
		//ItemPedido itemPedidoBuscado = pedido1.buscaLinearItemPedido(10);
				//System.out.println("Item Buscado:"+itemPedidoBuscado.getCodigo() + " "+	itemPedidoBuscado.getDescricao() +" "+ itemPedidoBuscado.getValor());
				
				//ItemPedido itemPedidoBuscado = pedido1.buscaLinearItemPedido(10);
				//System.out.println(itemPedidoBuscado);
				System.out.println("---------------------------------------------");	
				
				pedido1.imprimirItens();
	}

}
