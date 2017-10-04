import javax.swing.SingleSelectionModel;

public class ProgramaPrincipal {
	
	public static void main(String[] args) {
	
		Carro c1 = new Carro();
		c1.cor ="azul";
		c1.modelo ="gol";
		c1.placa="nrt2730";
		
		System.out.println(c1.cor + " " + c1.modelo);
		
	}

}
