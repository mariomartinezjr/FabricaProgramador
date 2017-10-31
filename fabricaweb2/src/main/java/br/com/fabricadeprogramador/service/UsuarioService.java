package br.com.fabricadeprogramador.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fabricadeprogramador.model.Perfil;
import br.com.fabricadeprogramador.model.Usuario;
import br.com.fabricadeprogramador.repository.PerfilRepository;
import br.com.fabricadeprogramador.repository.UsuarioRepository;

@Service
public class UsuarioService {

	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Autowired
	PerfilRepository perfilRepository;
	
	public Usuario salvar(Usuario usuario) throws ServiceException{
		if(usuario.getPerfil() == null) {
			Perfil perfilPadrao = perfilRepository.findOne(2);
			usuario.setPerfil(perfilPadrao);
		}
		if (usuario.getEmail().isEmpty() || usuario.getEmail() == null) {
			throw new ServiceException("E-mail esta vazio!");
			
			//validar e-mail duplicado
		}
		return usuarioRepository.save(usuario);
		
	}
	
	public void exclui(Integer id) {
		 usuarioRepository.delete(id);
	}
	
	public List<Usuario> buscarTodos() {
		return usuarioRepository.findAll();
	}
	
	public Usuario buscarPorId(Integer id) {
		return usuarioRepository.findOne(id);
	}

	public List<Usuario> findByNomeIgnoreCase(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Usuario> autenticar(Usuario usuario){
		return usuarioRepository.findByNomeAndSenha(usuario.getNome(), usuario.getSenha());
	}
	
	
	
}