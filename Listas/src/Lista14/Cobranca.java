package Lista14;

public class Cobranca {

	
	public Produto[] produtos;
	public Integer[] qdt;
	public int indice=0;
		
	public Cobranca() {
		
	}
	
public Cobranca(int tamanhoArray) {
	produtos = new Produto[tamanhoArray];
	qdt = new Integer[tamanhoArray];
	}
	
	public void imprimirRelatorio() {
		System.out.println("Refeições------- ");
		for (int i = 0; i < produtos.length; i++) {
			System.out.println(produtos[i] + " Quantidade: " + qdt[i]);
		}
		
	}

	public void adicionar(Produto almocoPromocional, int i) {
		if (indice < produtos.length) {
			produtos[indice] = almocoPromocional;
			qdt[indice] = i;
			indice++;
		}
		
	}
	
	public void imprimirTotal() {
		double total=0;
		Integer quantidade=0;
		
		for (int i = 0; i < produtos.length; i++) {
			quantidade += qdt[i];
			total += produtos[i].getValor() * qdt[i];
		}
		System.out.println("Total: R$ " + total  + " Quantidade Total: " + quantidade);
	}
	
	

}
