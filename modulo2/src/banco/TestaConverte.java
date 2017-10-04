package banco;

public class TestaConverte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String numero = "10";
		
		//Integer n = (Integer) numero;
		
		Integer n1 = Integer.parseInt(numero);
		System.out.println(n1);
		
		Integer n2 = new Integer(numero);
       System.out.println(n2);
       System.out.println(n1+n2);
	}

}
