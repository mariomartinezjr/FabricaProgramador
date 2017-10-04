package Lista14;

public class Bebida implements Produto{
	
	public TipoProdutoEnum tipo;
	public double valor;
	
	public Bebida (TipoProdutoEnum tipo , double valor) {
		this.valor=valor;
		this.tipo=tipo;
	}

	@Override
	public TipoProdutoEnum getTipo() {
		// TODO Auto-generated method stub
		return this.tipo;
	}

	@Override
	public double getValor() {
		// TODO Auto-generated method stub
		return this.valor;
	}

	@Override
	public String toString() {
		return  getTipo() + " " + getValor() ;
	}

}
