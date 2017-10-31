package br.com.fabricadeprogramador.utils;

import br.com.fabricadeprogramador.model.Usuario;

public class TokenUtils {

	public static boolean validarToken(String token) {
		if(token.equals("TOKEN")) {
			return true;
		}
		return false;
	}
	
	public static String criarToken(Usuario usuario) {
		String token = "TOKEN";
		return token;
	}

}
