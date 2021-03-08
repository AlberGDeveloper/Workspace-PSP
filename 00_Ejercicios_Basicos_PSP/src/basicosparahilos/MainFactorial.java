package basicosparahilos;

import java.util.Scanner;

import hilosPrimos.HiloThread;

public class MainFactorial {
	

	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);
		System.out.print("Introduce un primer número: ");
		int num = numero.nextInt();
		System.out.print("Introduce un segundo número: ");
		int num2 = numero.nextInt();
		System.out.print("Introduce un tercer número: ");
		int num3 = numero.nextInt();
		System.out.print("Introduce un cuarto número: ");
		int num4 = numero.nextInt();
		System.out.print("Introduce un quinto número: ");
		int num5 = numero.nextInt();
		
		HiloFactorialRunnable miHilo1 = new HiloFactorialRunnable(num);
		Thread hilo1 = new Thread(miHilo1);
		hilo1.setName(" Mi hilo 1, bieen! ");
		
		HiloFactorialRunnable miHilo2 = new HiloFactorialRunnable(num2);
		Thread hilo2 = new Thread(miHilo2);
		hilo2.setName(" Mi hilo 2, bieen! ");
		
		HiloFactorialRunnable miHilo3 = new HiloFactorialRunnable(num3);
		Thread hilo3 = new Thread(miHilo3);
		hilo3.setName(" Mi hilo 3, bieen! ");
		
		HiloFactorialRunnable miHilo4 = new HiloFactorialRunnable(num4);
		Thread hilo4 = new Thread(miHilo4);
		hilo4.setName(" Mi hilo 4, bieen! ");

		HiloFactorialRunnable miHilo5 = new HiloFactorialRunnable(num5);
		Thread hilo5 = new Thread(miHilo5);
		hilo5.setName(" Mi hilo 5, bieen! ");

		hilo1.start();
		hilo2.start();
		hilo3.start();
		hilo4.start();
		hilo5.start();

	}

}
