package videojuego;

public class Espada extends Arma{
	
	@Override
	public void usar() {
		System.out.println("Swannnnnnggg");
		System.out.println("Tipo: " + getTipo() + " daño: " + getDaño());
	}
	
}
