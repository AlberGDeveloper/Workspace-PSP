package pooHilos;

public class MainHilos {

	public static void main(String[] args) {
		Peluquero peluquero = new Peluquero();
		
		//cada obrero se encarga de poner ladrillos en una
		//valla, cada obrero cubre una porción de una valla
		ClientePeluqueria cp1 = new ClientePeluqueria("Pepe",10,20);
		cp1.setPeluquero(peluquero);
				
		ClientePeluqueria cp2 = new ClientePeluqueria("Luis",22,33);
		cp2.setPeluquero(peluquero);
		
		ClientePeluqueria cp3 = new ClientePeluqueria("Maria",44,11);
		cp3.setPeluquero(peluquero);
		
		ClientePeluqueria cp4 = new ClientePeluqueria("Marta",20,55);
		cp4.setPeluquero(peluquero);		
		
		ClientePeluqueria cp5 = new ClientePeluqueria("Harry potter,",23,31);
		cp5.setPeluquero(peluquero);
		
		cp1.start();
		cp2.start();
		cp3.start();
		cp4.start();
		cp5.start();

	}

}
