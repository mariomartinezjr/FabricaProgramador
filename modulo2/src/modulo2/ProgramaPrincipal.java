package modulo2;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente c1 = new Cliente();
		c1.setNome("Mario");

		Cliente c2 = new Cliente();
		c2.setNome("Elizangela");
		
		Cidade cg = new Cidade();
		cg.setNome("campo grande");
		
		Estado es = new Estado();
		es.setNome("Mato grosso do sul");
		es.setUf("ms");
		
		cg.setEstado(es);
		
		c1.setCidade(cg);
		
		System.out.println(c1.getNome() + " " + c1.getCidade().getNome() + " " + c1.getCidade().getEstado().getNome() + " " + c1.getCidade().getEstado().getUf()) ;
	}

}
