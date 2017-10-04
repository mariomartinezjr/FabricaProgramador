package banco;

import modulo2.Cliente;

public class TestaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente c1 = new Cliente();
			c1.setNome("mario");
			
		Conta cc = new Conta();
		cc.nome=c1;
		cc.setSaldo(100.0);
		System.out.println(cc.toString());
		
		cc.depositaConta(30.0);
		
		System.out.println(cc.toString());
		
		cc.debitaConta(200);
		
		System.out.println(cc.toString());

	}

}
