package uem.rest.ejercicioconcesionario.modeloProxy;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import uem.rest.ejercicioconcesionario.entidad.Coche;

public class CocheProxy {
	public static final String URL_COCHES = "http://localhost:8090/coches";

	public List<Coche> listar() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Coche[]> response = restTemplate.getForEntity(URL_COCHES, Coche[].class);
		Coche[] arrayCoches = response.getBody();

		List<Coche> lista = Arrays.asList(arrayCoches);
		return lista;
	}

	public Coche obtener(int id) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Coche> coche = restTemplate.getForEntity(URL_COCHES + "/" + id, Coche.class);
		return coche.getBody();
	}

	public Coche alta(Coche c) {
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<Coche> requestBody = new HttpEntity<Coche>(c);
		Coche cocheAlta = restTemplate.postForObject(URL_COCHES, requestBody, Coche.class);
		return cocheAlta;
	}
	
	public Coche modificar(Coche c) {
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<Coche> requestBody = new HttpEntity<Coche>(c);
		ResponseEntity<Coche> coche = restTemplate.exchange(URL_COCHES+"/"+c.getId(), HttpMethod.PUT, requestBody, Coche.class);
		return coche.getBody();
	}
	
    public void borrar(int id) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(URL_COCHES + id);
    }

}
