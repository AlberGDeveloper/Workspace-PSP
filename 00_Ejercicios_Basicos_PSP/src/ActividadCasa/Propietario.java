package ActividadCasa;

import java.util.ArrayList;

public class Propietario {


	private String nombre;
	private int edad;
	private String dni;
	private String tlf;

	public Propietario(String nombre, int edad, String dni, String tlf) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.tlf = tlf;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTlf() {
		return tlf;
	}

	public void setTlf(String tlf) {
		this.tlf = tlf;
	}

	@Override
	public String toString() {
		return "Propietario [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", tlf=" + tlf + "]";
	}
	
	
}
