package SitemaPedido;

public interface Pedido {
public Integer getCodigo();
public Double calcularValorTotal();
public void adicionarItem(ItemPedido itemPedido);
public void removerItemPedido(ItemPedido itemPedido);
public void imprimirItens();
public ItemPedido[] ordenarItensPedidos(); 
public ItemPedido[] getItensPedidos();
}