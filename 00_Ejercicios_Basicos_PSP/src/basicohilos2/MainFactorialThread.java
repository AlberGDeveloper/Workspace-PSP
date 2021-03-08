package basicohilos2;

import java.util.Scanner;

import hilosPrimos.HiloThread;

public class MainFactorialThread {

	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);
		System.out.print("Introduce un primer número: ");
		int num = numero.nextInt();
		System.out.print("Introduce un segundo número: ");
		int num2 = numero.nextInt();
		System.out.print("Introduce un tercer número: ");
		int num3 = numero.nextInt();
		
		HiloFactorialThread hilo1 = new HiloFactorialThread(num);
		hilo1.setName("HILO ONE ");
		
		HiloFactorialThread hilo2 = new HiloFactorialThread(num2);
		hilo2.setName("HILO TWO ");
		
		HiloFactorialThread hilo3 = new HiloFactorialThread(num3);
		hilo3.setName("HILO THREE ");
		
		
		hilo1.start();
		hilo2.start();
		hilo3.start();
	}

}
