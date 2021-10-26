package es.curso.babel.repository;

import java.util.List;

import es.curso.babel.model.entity.Usuario;

public interface UsuarioRepository {

	List<Usuario> getAllUsuarios();
	boolean isUsuarioRegistered(String username, String password);
}
