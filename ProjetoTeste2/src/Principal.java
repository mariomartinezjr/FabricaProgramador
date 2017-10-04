
public class Principal {

	public static void main(String[] args) {
		
		Pessoa t1 = new Pessoa();
		Pessoa t2 = new Pessoa();
		
		
		t1.nome ="Mario";
		t1.rg="98766";
		t1.sexo='M';
		t1.telefone="87344";
		t1.peso=90.8;
		t1.altura=113.45;
		t1.corpreferida=Cor.AZUL;

		t2.nome ="Maria";
		t2.rg="09876";
		t2.sexo='F';
		t2.telefone="09876";
		t2.peso=80.8;
		t2.altura=153.45;
		String t ="127";
		
		System.out.println(Integer.parseInt(t) +1);
		
		System.out.println(t1.nome + " " + t2.nome );
		System.out.println(t1.rg + " " + t2.rg );
		System.out.println(t1.sexo + " " + t2.sexo );
		System.out.println(t1.telefone + " " + t2.telefone );
		System.out.println(t1.peso + " " + t2.peso );
		System.out.println(t1.altura + " " + t2.altura );


	}

}
