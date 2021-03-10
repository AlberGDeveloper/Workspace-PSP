package uem.rest.hash.modelo.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uem.rest.hash.modelo.entidad.Usuario;
import uem.rest.hash.modelo.persistencia.DaoUsuario;

@Service
public class GestionarUsuario {

	@Autowired
	private DaoUsuario daousuario;

/**	public boolean registrarUsuario(Usuario usuario) {
		DaoUsuario.save()
		
		return true;**/
	//}
}