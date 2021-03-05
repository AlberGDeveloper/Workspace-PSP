package uem.rest.ejercicioconcesionario.modelo.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uem.rest.ejercicioconcesionario.modelo.entidad.Coche;
import uem.rest.ejercicioconcesionario.modelo.persistencia.DaoCoche;

@Service
public class GestionarCoches {
	
	@Autowired
	private DaoCoche daocoche;

	public List<Coche> listar() {
		List<Coche> lista = daocoche.findAll();
        return lista;
	}

}
