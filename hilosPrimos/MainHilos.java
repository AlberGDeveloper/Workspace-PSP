package hilosPrimos;

import java.util.Scanner;

public class MainHilos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer numero");
		int numero1sc = sc.nextInt();
		System.out.println("Introduce el segundo numero");
		int numero2sc = sc.nextInt();
		System.out.println("Introduce el tercer número");
		int numero3sc = sc.nextInt();
		
		HiloThread hilo1 = new HiloThread(numero1sc);
		hilo1.setName("Hilo 1");
		HiloThread hilo2 = new HiloThread(numero2sc);
		hilo2.setName("Hilo 2");
		HiloThread hilo3 = new HiloThread(numero3sc);
		hilo3.setName("Hilo 3");

		hilo1.start();
		hilo2.start();
		hilo3.start();
	}

}
