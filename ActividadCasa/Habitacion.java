package ActividadCasa;

import java.util.ArrayList;

public class Habitacion {



	public Habitacion(String tipoHabitacion, double metrosCuadrados) {
		super();
		this.tipoHabitacion = tipoHabitacion;
		this.metrosCuadrados = metrosCuadrados;

	}

	public String getTipoHabitacion() {
		return tipoHabitacion;
	}

	public void setTipoHabitacion(String tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}

	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	private String tipoHabitacion;
	private double metrosCuadrados;
	@Override
	public String toString() {
		return "Tipo de habitación=" + tipoHabitacion + ", M2=" + metrosCuadrados;
	}

	
	
}
