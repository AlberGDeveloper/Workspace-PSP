package videojuego;

public class Guerrero {
	private String nombre;
	//codigo pegamento, dependencia fuerte
	private Arma arma;
	
	public void atacar() {
		System.out.println("ARGGGGGGGGGGGGGGG!");
		arma.usar();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	
	
}
