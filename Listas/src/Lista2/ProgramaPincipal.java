package Lista2;

public class ProgramaPincipal {

	public static void main(String[] args) {
		
		Filme f1 = new Filme();
		Filme f2 = new Filme();
		
		Cliente c1 = new Cliente ();
		Cliente c2 = new Cliente ();
		Cliente c3 = new Cliente ();
		Cliente c4 = new Cliente ();
		
		Operador o1 = new Operador();
		Operador o2 = new Operador();
		
		f1.codigo=1;
		f1.idioma = Idioma.DUB;
		f1.titulo="Matrix";
		f1.sinopse="blablablablabla";
		
		f2.codigo=2;
		f2.idioma = Idioma.LEG;
		f2.titulo="2001 uma odiseia no espaço";
		f2.sinopse="blablablablabla";
		
		c1.codigo=1;
		c1.nome="Carlos";
		c1.telefone="99999999";
		c1.es = Estado_Civil.CASADO;

		c2.codigo=2;
		c2.nome="Maria";
		c2.telefone="99999999";
		c2.es = Estado_Civil.DIVORCIADO;

		c3.codigo=3;
		c3.nome="Ana";
		c3.telefone="99999999";
		c3.es = Estado_Civil.SOLTEIRO;

		c4.codigo=4;
		c4.nome="Patricia";
		c4.telefone="99999999";
		c4.es = Estado_Civil.VIUVO;
		
		o1.matricula=1;
		o1.nome="carla";
		o1.sexo='F';
		
		o2.matricula=2;
		o2.nome="Susana";
		o2.sexo='F';
		
	}

}
