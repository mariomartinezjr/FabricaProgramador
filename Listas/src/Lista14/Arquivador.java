package Lista14;

public interface Arquivador {
	
	
	void lerArquivo(String caminhoArquivo);
	void gravar(String caminhoArquivo);
	public boolean procurarCaracter(char c);
	String lerLinha();
	

}
