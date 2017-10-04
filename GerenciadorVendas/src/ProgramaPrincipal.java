
public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		
		Venda v1 = new Venda();
		Venda v2 = new Venda();
		Venda v3 = new Venda();
		
		Produto p1 = new Produto();
		Produto p2 = new Produto();
		Produto p3 = new Produto();
		
		p1.codigo=1;
		p1.descricao="vasoura";
		p1.valor=10.0;
		
		p2.codigo=2;
		p2.descricao="rodo";
		p2.valor=15.0;
		
		p3.codigo=3;
		p3.descricao="pano";
		p3.valor=6.0;
		
		v1.codigo=1;
		v1.nome="Jose";
		v1.valor=100.0;
		
		v2.codigo=2;
		v2.nome="Bianca";
		v2.valor=130.0;
		
		v3.codigo=3;
		v3.nome="Mario";
		v3.valor=80.0;
	}

}
