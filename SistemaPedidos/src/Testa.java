
public class Testa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente teste[] = new Cliente[3];
		
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		Cliente c3 = new Cliente();
		Cliente c4 = new Cliente();
		
		c1.nome = "mario";
		c1.sobrenome= "martinez";
		c2.nome = "ze";
		c3.nome = "jao";
		c4.nome = "beto";
		
		teste[0] = c1;
		teste[1] =c2;
		teste[2] = c3;
		teste[3] = c4;
		
		
		System.out.println(teste[1].nome +  teste[1].sobrenome);
		//teste.setNome("mario");
		
		//System.out.println(teste.getNome());
		
		
		
			
		

	}

}
