package br.com.fabricadeprogramador.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fabricadeprogramador.model.Usuario;
import br.com.fabricadeprogramador.service.ServiceException;
import br.com.fabricadeprogramador.service.UsuarioService;
import br.com.fabricadeprogramador.utils.TokenUtils;

@RestController
@RequestMapping("/login")
@CrossOrigin(origins = {"*"})
public class LoginController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping
	public void autenticar(@RequestBody Usuario usuario , HttpServletResponse response)throws ServiceException {
		System.out.println(usuario.getSenha());
		
		Usuario usuarioAutenticado = usuarioService.autenticar(usuario).get(0);
		
		if (usuarioAutenticado.getNome() != null) {
			System.out.println("Usuario autenticado");
			String token = TokenUtils.criarToken(usuario);
			try {
				response.getWriter().print(token);
				}catch (IOException e ) {
					e.printStackTrace();
				}
		}else {
			System.out.println("Usuario não autenticado");
			response.setStatus(401);
		}
		
		
	}

}
