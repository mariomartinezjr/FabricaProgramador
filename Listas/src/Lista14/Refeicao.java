package Lista14;

public class Refeicao implements Produto{

	double valor;
	private TipoProdutoEnum tipo;
	
	public  Refeicao (TipoProdutoEnum tipo , double valor) {
		this.tipo=tipo;
		this.valor=valor;
	}
	@Override
	public TipoProdutoEnum getTipo() {
		
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
