package uem.rest.ejercicioconcesionario.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import uem.rest.ejercicioconcesionario.modelo.negocio.GestionarCoches;
import uem.rest.ejercicioconcesionario.modelo.entidad.Coche;

@RestController
public class Controlador {
	
	@Autowired
	public GestionarCoches gestioncoche;
	
    @GetMapping("coche")
    public ResponseEntity<List<Coche>> listar() {
        List<Coche> lista = gestioncoche.listar();
        ResponseEntity<List<Coche>> re = new ResponseEntity<List<Coche>>(lista, HttpStatus.OK);
        return re;
    }

}
