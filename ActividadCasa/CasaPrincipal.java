package ActividadCasa;

import java.util.ArrayList;

public class CasaPrincipal {

	public static void main(String[] args) {

		Propietario p1 = new Propietario("Alberto", 33, "02299951C", "66325547");
		Persona inquilino1 = new Persona("Josue", 32, "0229551D", "695213364");
		Persona inquilino2 = new Persona("Edu", 31, "02294451F", "69874563");
		Persona inquilino3 = new Persona("Carla", 30, "022349951G", "66541236");
		Habitacion h1 = new Habitacion("Cuarto de baño", 42);
		Habitacion h2 = new Habitacion("Cocina", 50);
		Habitacion h3 = new Habitacion("Salón", 140);
		Habitacion h4 = new Habitacion("Dormitorio 1", 110);
		Habitacion h5 = new Habitacion("Dormitorio 2", 120);
		DireccionCasa d1 = new DireccionCasa("Calle", "Mozart", "28041");

		ArrayList<Habitacion> habitas = new ArrayList<Habitacion>();
		habitas.add(h1);
		habitas.add(h2);
		habitas.add(h3);
		habitas.add(h4);
		habitas.add(h5);

		ArrayList<Persona> inquilinos = new ArrayList<Persona>();
		inquilinos.add(inquilino1);
		inquilinos.add(inquilino2);
		inquilinos.add(inquilino3);

		Casa c1 = new Casa(inquilinos, d1, habitas, p1);
		c1.setDireccion(d1);
		c1.setHabitacionCasa(habitas);
		c1.setDueño(p1);
		c1.setInquilinosCasa(inquilinos);

		System.out.println(c1.toString());

	}

}
