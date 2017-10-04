package SitemaPedido;

public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		Pedido pedido = new PedidoImpl();
		
		//Primeiro Item do Pedido
		int codigoItem = 5;
		ItemPedido livro = new Livro();
		livro.setCodigo(5);
		livro.setValor(120.50);
		livro.setDescricao("Livro de Java");
		
		//Segundo Item do Pedido
		Curso curso1 = new Curso();
		curso1.setCodigo(1);
		curso1.setDescricao("Desenvolvimento para Android");
		curso1.setCargaHoraria("20 horas");
		curso1.setConteudo("Todo conteúdo de Android");
		curso1.setPublicoAlvo("Universitários");
		curso1.setValor(325d);
		
		
		//Terceiro Item do Pedido
		ItemPedido curso2 = new Curso();
		curso2.setCodigo(2);
		curso2.setDescricao("Fábrica de Programador");
		curso2.setValor(200d);
		
		pedido.adicionarItem(livro);
		pedido.adicionarItem(curso1);
		pedido.adicionarItem(curso2);
		
		pedido.imprimirItens();
		
		System.out.println("Valor total: " + pedido.calcularValorTotal());
		
		pedido.removerItemPedido(curso1);
		
		pedido.ordenarItensPedidos();
        pedido.imprimirItens();
		
        System.out.println("Valor total: " + pedido.calcularValorTotal());
		
	}

}
