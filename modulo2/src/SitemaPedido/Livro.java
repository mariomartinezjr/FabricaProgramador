package SitemaPedido;

import java.util.Date;

public class Livro implements ItemPedido {
	
	private Integer codigo;
	private Double valor;
	private String descricao;
	
	@Override
	public String toString() {
		return "Livro [codigo=" + codigo + ", valor=" + valor + ", descricao=" + descricao + ", autor=" + autor
				+ ", editora=" + editora + ", dataPublicacao=" + dataPublicacao + "]";
	}

	private String autor;
	private String editora;
	private Date dataPublicacao;
	
	
	
	
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public Date getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	@Override
	public Integer getCodigo() {
		// TODO Auto-generated method stub
		return codigo;
	}

	@Override
	public void setCodigo(Integer codigo) {
		// TODO Auto-generated method stub
		this.codigo=codigo;
	}

	@Override
	public Double getValor() {
		// TODO Auto-generated method stub
		return valor;
	}

	@Override
	public void setValor(Double valor) {
		// TODO Auto-generated method stub
		this.valor=valor;
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return descricao;
	}

	@Override
	public void setDescricao(String descricao) {
		// TODO Auto-generated method stub
		this.descricao=descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	

}
