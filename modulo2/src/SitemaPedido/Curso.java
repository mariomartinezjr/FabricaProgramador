package SitemaPedido;

public class Curso implements ItemPedido {

	private Integer codigo;
	private Double valor;
	private String descricao;
	
    private String conteudo;
    private String publicoAlvo;
    private String cargaHoraria;
    
    
    
	
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
		Curso other = (Curso) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Curso [codigo=" + codigo + ", valor=" + valor + ", descricao=" + descricao + ", conteudo=" + conteudo
				+ ", publicoAlvo=" + publicoAlvo + ", cargaHoraria=" + cargaHoraria + "]";
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public String getPublicoAlvo() {
		return publicoAlvo;
	}

	public void setPublicoAlvo(String publicoAlvo) {
		this.publicoAlvo = publicoAlvo;
	}

	public String getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
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

	
	
}
