package SitemaPedido;

public interface ItemPedido {
	//utilizado para garantir uma ordena��o
	public Integer getCodigo() ;
	public void setCodigo(Integer codigo);
	public Double getValor() ;
	public void setValor(Double valor);
	public String getDescricao() ;
	public void setDescricao(String descricao);
	
	

}