package Execao;

public class ProgramaPrincipalException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			ValidacaoUtil.validarCPF("905.098.531-90");
			} catch (CPFInvalidException e) {
			//Tratamento da Exception
			e.printStackTrace();
			}

	}

}
