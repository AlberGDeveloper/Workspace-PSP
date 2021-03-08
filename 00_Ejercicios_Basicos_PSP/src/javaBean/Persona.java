package javaBean;

public class Persona {

	private String nombre;
	private int edad;
	private double altura;
	private Direccion direccion;
	private Persona hijo;

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
		if (edad >=0) {
			this.edad = edad;
		} else {
			this.edad=0;
		}
		
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Persona getHijo() {
		return hijo;
	}

	public void setHijo(Persona hijo) {
		this.hijo = hijo;
	}
	
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + ", direccion=" + direccion
				+ ", hijo=" + hijo + "]";
	}

}
