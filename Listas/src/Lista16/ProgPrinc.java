package Lista16;

public class ProgPrinc {

	public static void main(String[] args) {
		
		
		
		try {
			LeitorArquivo.imprimirDadosArquivo("\teste.txt");
		} catch (LeitorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
