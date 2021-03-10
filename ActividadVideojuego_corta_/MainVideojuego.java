package videojuego;

public class MainVideojuego {
	public static void main(String[] args) {
		Guerrero g1 = new Guerrero();
		Arma e1 = new Espada();
		g1.setNombre("Conan");
		e1.setTipo("Bastarda");
		e1.setDaño(30);
		g1.setArma(e1);
		
		Guerrero g2 = new Guerrero();
		e1 = new Arco();
		e1.setDaño(15);
		e1.setTipo("Arco Largo");
		g2.setNombre("Gimly");
		g2.setArma(e1);
		
		g1.atacar();
		g2.atacar();
	}
}
