package uem.rest.hash.modelo.persistencia;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import uem.rest.hash.modelo.entidad.Usuario;

public interface DaoUsuario extends JpaRepository<Usuario, Integer>{
	
	public Usuario findByUser(String user);

}
