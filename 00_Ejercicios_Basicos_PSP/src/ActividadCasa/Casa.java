package ActividadCasa;

import java.util.ArrayList;

public class Casa {

	private ArrayList<Persona> inquilinosCasa;
	private DireccionCasa direccion;
	private ArrayList<Habitacion> habitacionCasa;
	private Propietario dueño;

	public ArrayList<Persona> getInquilinosCasa() {
		return inquilinosCasa;
	}

	public void setInquilinosCasa(ArrayList<Persona> inquilinosCasa) {
		this.inquilinosCasa = inquilinosCasa;
	}

	public DireccionCasa getDireccion() {
		return direccion;
	}

	public void setDireccion(DireccionCasa direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Habitacion> getHabitacionCasa() {
		return habitacionCasa;
	}

	public void setHabitacionCasa(ArrayList<Habitacion> habitacionCasa) {
		this.habitacionCasa = habitacionCasa;
	}

	public Propietario getDueño() {
		return dueño;
	}

	public void setDueño(Propietario dueño) {
		this.dueño = dueño;
	}

	public Casa(ArrayList<Persona> inquilinosCasa, DireccionCasa direccion, ArrayList<Habitacion> habitacionCasa,
			Propietario dueño) {
		super();
		this.inquilinosCasa = inquilinosCasa;
		this.direccion = direccion;
		this.habitacionCasa = habitacionCasa;
		this.dueño = dueño;
	}

	@Override
	public String toString() {
		return "Nombre de los inquilinos: \n" + inquilinosCasa + "\n" + "Dirección Postal:\n" + direccion + "\n"
				+ "Habitaciones: " + "\n" + habitacionCasa + "\n" + " Datos del dueño: " + dueño;
	}

}
