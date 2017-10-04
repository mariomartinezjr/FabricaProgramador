package Lista14;

public class ProgramaPrincipal {

	public static void main(String[] args) {


		Arquivador arq1= new Arquivador() {
			
			@Override
			public boolean procurarCaracter(char c) {
			return false;
			}
			
			@Override
			public String lerLinha() {
			return null;
			}
			
			@Override
			public void lerArquivo(String caminhoArquivo) {
			} 
			
			@Override
			public void gravar(String caminhoArquivo) {
			
			}
		};
		
			
		Arquivador arq2 = new ArquivadorImpl ();
		if (arq2.procurarCaracter('c') == false) {
			System.out.println("Procurando por character:c...");
		};
		arq2.lerArquivo("x.doc");
		System.out.println(arq2.lerLinha());
		arq2.gravar("x.doc");

	
	}
}
