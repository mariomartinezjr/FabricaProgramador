package modulo2;

public class TestaHeranca {
	
	public static void main(String[] args) {
	Cliente2 cli = new Cliente2();
	Cidade ci = new Cidade();
	ci.setNome("campo grande");
	
	cli.setNome("Mario");
	cli.setCpf("23455");
	cli.setCidade(ci);

	}
}
