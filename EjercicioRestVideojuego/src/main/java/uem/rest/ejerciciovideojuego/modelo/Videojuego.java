package uem.rest.ejerciciovideojuego.modelo;

public class Videojuego {
	
	private int Id;
	private String nombre;
	private String compania;
	private int precio;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCompania() {
		return compania;
	}
	public void setCompania(String compania) {
		this.compania = compania;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Videojuego [Id=" + Id + ", nombre=" + nombre + ", compania=" + compania + ", precio=" + precio + "]";
	}
	
	

}
