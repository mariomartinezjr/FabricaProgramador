package br.com.fabricadeprogramador.fabricaweb.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fabricadeprogramador.fabricaweb.model.Usuario;

public class UsuarioRepositoryBanco implements UsuarioRepository{

	
	private Connection conexao = ConexaoFactory.criarConexao();
	
	@Override
	public void cadastrar(Usuario usuario) {
		// TODO Auto-generated method stub
	
		String sql = "insert into usuario (nome,email) values (?,?)";
		
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, usuario.getNome());
			ps.setString(2, usuario.getEmail());
			ps.execute();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public List<Usuario> buscarTodos() {
		// TODO Auto-generated method stub
	
		List<Usuario> lista = new ArrayList<>();
		String sql = "select * from usuario";
		
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
						
			ResultSet resultado = ps.executeQuery();
			
			while(resultado.next()) {
				
			Usuario usu = new Usuario();
				
				usu.setId(resultado.getInt("id"));
				usu.setNome(resultado.getString("nome"));
				usu.setEmail(resultado.getString("email"));
				
				lista.add(usu);
				
			}
				return lista;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		return null;
	}

	@Override
	public void alterar(Usuario usuario) {
		// TODO Auto-generated method stub
		
        String sql = "update usuario set nome=? ,email=? where id = ?";
		
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, usuario.getNome());
			ps.setString(2, usuario.getEmail());
			ps.setInt(3, usuario.getId());
			ps.execute();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void salvar(Usuario usuario) {
		// TODO Auto-generated method stub
		
		if (usuario.getId()==null){
			cadastrar(usuario);
		}else{
			alterar(usuario);
		}
		
		
	}

	@Override
	public Usuario buscarPorId(Integer id) {
		// TODO Auto-generated method stub
        Usuario usuRetorno = new Usuario();
        
		String sql = "select * from usuario where id =?";
		
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setInt(1, id);
			
			ResultSet resultado = ps.executeQuery();
			
			if(resultado.next()) {
				usuRetorno = new Usuario();
				
				usuRetorno.setId(resultado.getInt("id"));
				usuRetorno.setNome(resultado.getString("nome"));
				usuRetorno.setEmail(resultado.getString("email"));
				
				return usuRetorno;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}

	@Override
	public void excluir(int id) {
		// TODO Auto-generated method stub
String sql = "delete from  usuario where id = ?";
		
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setInt(1, id);
			ps.execute();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
