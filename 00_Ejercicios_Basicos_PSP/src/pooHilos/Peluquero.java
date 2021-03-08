package pooHilos;

public class Peluquero {
	
	public static synchronized void descansar(ClientePeluqueria cp) {
		System.out.println("******* Soy el cliente " + cp.getNombre() + " y me van a cortar el pelo");
		
		try {
			Thread.sleep(10000);//un obrero descansa 10 segundos
			System.out.println("wow, 10 segundos después, que corte de pelo tan bonito");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("······· Soy el cliente " + cp.getNombre() + " y ahora, a lavar!!!");
	}

}
