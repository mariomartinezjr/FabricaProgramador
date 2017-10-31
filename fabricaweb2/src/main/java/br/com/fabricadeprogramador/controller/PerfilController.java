package br.com.fabricadeprogramador.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fabricadeprogramador.model.Perfil;
import br.com.fabricadeprogramador.service.PerfilService;

@RestController
@RequestMapping("/perfil")
@CrossOrigin(origins = "*")
public class PerfilController {

	@Autowired
	PerfilService perfilService;
	
	@GetMapping("/todos")
	public List<Perfil> buscarTodos(){
		return perfilService.buscarTodos();
		
	}
}
