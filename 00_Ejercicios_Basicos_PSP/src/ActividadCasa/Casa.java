package ActividadCasa;

import java.util.ArrayList;

public class Casa {

	private ArrayList<Persona> inquilinosCasa;
	private DireccionCasa direccion;
	private ArrayList<Habitacion> habitacionCasa;
	private Propietario due�o;

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

	public Propietario getDue�o() {
		return due�o;
	}

	public void setDue�o(Propietario due�o) {
		this.due�o = due�o;
	}

	public Casa(ArrayList<Persona> inquilinosCasa, DireccionCasa direccion, ArrayList<Habitacion> habitacionCasa,
			Propietario due�o) {
		super();
		this.inquilinosCasa = inquilinosCasa;
		this.direccion = direccion;
		this.habitacionCasa = habitacionCasa;
		this.due�o = due�o;
	}

	@Override
	public String toString() {
		return "Nombre de los inquilinos: \n" + inquilinosCasa + "\n" + "Direcci�n Postal:\n" + direccion + "\n"
				+ "Habitaciones: " + "\n" + habitacionCasa + "\n" + " Datos del due�o: " + due�o;
	}

}
