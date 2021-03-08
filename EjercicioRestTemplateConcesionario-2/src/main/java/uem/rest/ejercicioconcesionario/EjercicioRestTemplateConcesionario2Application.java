package uem.rest.ejercicioconcesionario;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import uem.rest.ejercicioconcesionario.entidad.Coche;
import uem.rest.ejercicioconcesionario.modeloProxy.CocheProxy;

@SpringBootApplication
public class EjercicioRestTemplateConcesionario2Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EjercicioRestTemplateConcesionario2Application.class, args);

		CocheProxy cProxy = context.getBean("cocheProxy", CocheProxy.class);

		System.out.println("LISTAR");
		List<Coche> listaCoches = cProxy.listar();
		System.out.println(listaCoches);

		System.out.println("OBTENER");
		Coche c1 = cProxy.obtener(1);
		System.out.println(c1);

		Coche c2 = new Coche();
		// no le ponemos el id, porque el servicio rest me asignara el id
		c2.setId(12);
		c2.setMarca("Hyundai");
		c2.setMatricula("3001hhk");
		c2.setModelo("GT");
		c2.setPotencia(102.10);

		System.out.println("ALTA");
		c2 = cProxy.alta(c2);
		System.out.println(c2);

		c2.setModelo("GT Line");
		c2.setPotencia(112.10);

		System.out.println("MODIFICAR");
		Coche c3 = cProxy.modificar(c2);
		System.out.println(c3);

		System.out.println("BORRAR");
		cProxy.borrar(1);
		System.out.println("Coche borrado");

	}
}
