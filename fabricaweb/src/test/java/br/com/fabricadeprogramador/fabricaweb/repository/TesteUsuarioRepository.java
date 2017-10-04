package br.com.fabricadeprogramador.fabricaweb.repository;

import java.util.Iterator;
import java.util.List;

import br.com.fabricadeprogramador.fabricaweb.model.Usuario;

public class TesteUsuarioRepository {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Usuario usuario = new Usuario("zea", "zea@gmail.com");
		UsuarioRepositoryBanco repository = new UsuarioRepositoryBanco();
		
		//repository.cadastrar(usuario);
		//repository.excluir(6);
		//repository.alterar(usuario);
		//usuario.setId(7);
		
		List<Usuario> lista;
		
		lista = repository.buscarTodos();
		
		for (Usuario usuario : lista) {
		
			System.out.println(repository.buscarTodos());
		}
			
		
	}

}
