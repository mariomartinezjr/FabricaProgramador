package Lista13;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		IntrumentoMusical sax = new sax();
		//implementação do método abstrato tocar
		sax.tocar();
		IntrumentoMusical violao = new violao();
		//implementação do método abstrato tocar
		violao.tocar();

	}

}
