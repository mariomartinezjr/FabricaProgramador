package br.com.fabricadeprogramador.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.fabricadeprogramador.model.Cliente;
import br.com.fabricadeprogramador.model.Usuario;
import br.com.fabricadeprogramador.repository.ClienteRepository;
import br.com.fabricadeprogramador.repository.UsuarioRepository;

@RestController
@RequestMapping("/usucontroller")

public class UsuarioController  {

	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@PostMapping
	public Usuario inserir(@RequestBody Usuario usuario) {
		
		return usuarioRepository.save(usuario);
	}
	
	@GetMapping
	public List<Usuario> buscarTodos(){
		return usuarioRepository.findAll();
	}
	
	@GetMapping("/q/{nome}")
	public List<Usuario> buscarPorNome(@PathVariable("nome") String nome){
		return usuarioRepository.findByNomeIgnoreCase(nome);
	}
	
	
	@GetMapping("/{id}")
	public Usuario buscarPorId(@PathVariable("id") Integer id) {
		return usuarioRepository.findOne(id);
	}
	
	@PutMapping
	public Usuario alterar(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	@DeleteMapping("/{id}")
	public void excluir(@PathVariable("id") Integer id) {
		
		usuarioRepository.delete(id);
	}
	
	
	
	@GetMapping("/q2")
	public List<Usuario> buscarPorNomeESenha(@RequestParam("nome") String nome, @RequestParam("senah") String senha){
     
		return usuarioRepository.findByNomeAndSenha(nome, senha);
		
	}
	
}
