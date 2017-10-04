package Execao;

public class ValidacaoUtil {
	
	public static void validarCPF(String cpf) throws CPFInvalidException {
		if (cpf.length() != 11) {
			throw new CPFInvalidException();
		}
	}

}
