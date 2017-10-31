package br.com.fabricadeprogramador.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fabricadeprogramador.model.Perfil;
import br.com.fabricadeprogramador.model.Usuario;
import br.com.fabricadeprogramador.repository.PerfilRepository;

@Service
public class PerfilService {

	@Autowired
	PerfilRepository perfilRepository;
	
	public Perfil salvar(Perfil perfil) {
		return perfilRepository.save(perfil);
		
	}
	
	public void exclui(Integer id) {
		perfilRepository.delete(id);
	}
	
	public List<Perfil> buscarTodos() {
		return perfilRepository.findAll();
	}
	
	public Perfil buscarPorId(Integer id) {
		return perfilRepository.findOne(id);
	}
	

	
}
