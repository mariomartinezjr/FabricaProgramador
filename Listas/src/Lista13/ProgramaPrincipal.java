package Lista13;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		IntrumentoMusical sax = new sax();
		//implementa��o do m�todo abstrato tocar
		sax.tocar();
		IntrumentoMusical violao = new violao();
		//implementa��o do m�todo abstrato tocar
		violao.tocar();

	}

}
