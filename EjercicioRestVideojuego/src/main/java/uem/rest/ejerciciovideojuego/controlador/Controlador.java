package uem.rest.ejerciciovideojuego.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import uem.rest.ejerciciovideojuego.modelo.Videojuego;

@RestController
public class Controlador {

	static Videojuego videogame = new Videojuego();
	
	
	@GetMapping("videojuego")
	public Videojuego obtenerMensaje() {
		videogame.setId(10);
		videogame.setNombre("World Of Warcraft: Shadowlands");
		videogame.setCompania("Blizzard");
		videogame.setPrecio(45);
		return videogame;

	}
	
	@GetMapping(value = "videojuegoHTML", produces = "text/html")
	public String obtenerMensajeHTML() {
		//esta clase es muy buena para concatenar Strings
		StringBuffer buffer = new StringBuffer();
		buffer.append("<!DOCTYPE html>");
		buffer.append("<html>");
		buffer.append("<head>");
		buffer.append("<title>Videojuego HTML</title>");
		buffer.append("</head>");
		buffer.append("<body>");
		buffer.append("<h1> Videojuego </h1>");
		//buffer.append("'<img src=\"https://media.vandal.net/t200/79072/world-of-warcraft-shadowlands-20209291145071_1.jpg''</img>'");
		buffer.append("<h2>ID: "+ videogame.getId()+"</h2>");
		buffer.append("<h2>Nombre: " +videogame.getNombre()+"</h2>");
		buffer.append("<h2>Compañia: " +videogame.getCompania()+"</h2>");	
		buffer.append("<h2>Precio: " +videogame.getPrecio()+"$</h2>");
		buffer.append("</body>");
		buffer.append("</html>");
		
		return buffer.toString();
	}
	
	@PutMapping("videojuego")
    public static Videojuego cambiarPrecioVideojuego() {
		videogame.setPrecio(videogame.getPrecio()+25);
        return videogame;
    }
}