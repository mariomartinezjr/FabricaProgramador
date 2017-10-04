package Lista7;

public class ItemPedido {
	
	private Integer codigo;
	private String descricao;
	private Double valor;
	
	//getters and setters
	
	public void setCodigo(Integer codigo){
		this.codigo= codigo;
	}
	
	public void setValor(Double valor){
		
		this.valor = valor;
	}
	
	public void setDescricao(String descricao){
		
		this.descricao = descricao;
	}
	
	public Double getValor(){
		
		return this.valor;
	}
	
	public String getDescricao(){
		
		return this.descricao;
	}
	
	
	public int getCodigo() {
		 
		return this.codigo ;
	}

	@Override
	public String toString() {
	 return "ItemPedido [codigo=" + codigo + ", descricao=" + descricao	+ ", valor=" + valor + "]";
	}

}

