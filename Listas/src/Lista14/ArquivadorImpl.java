package Lista14;

public class ArquivadorImpl implements Arquivador {

	@Override
	public void lerArquivo(String caminhoArquivo) {
		System.out.println("Lendo Arquivo: " + caminhoArquivo);
		
	}

	@Override
	public void gravar(String caminhoArquivo) {

     System.out.println("Gravando Arquivo" + caminhoArquivo);
		
	}

	@Override
	public boolean procurarCaracter(char c) {
		
		return false;
	}

	@Override
	public String lerLinha() {
		// TODO Auto-generated method stub
		return "Lendo Linha..." ;
	}

	
		
	

}
