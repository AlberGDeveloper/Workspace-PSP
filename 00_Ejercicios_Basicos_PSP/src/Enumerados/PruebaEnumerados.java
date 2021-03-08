package Enumerados;

import java.util.Scanner;

public class PruebaEnumerados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Bienvenidos a nuestra máquina de café");
		for (int i = 0; i < TipoCafe.values().length; i++) {
			TipoCafe tp = TipoCafe.values()[i];
			System.out.println(i + "-" + TipoCafe.values()[i] + " Precio: " + tp.getPrecio());
		}
		System.out.println("Escoja una opción:");

		Scanner sc = new Scanner(System.in);
		int opcion = sc.nextInt();

		TipoCafe tipoCafeEscogido = TipoCafe.values()[opcion];

		System.out.println("Preparando. Café escogido : " + tipoCafeEscogido);
		System.out.println("Por favor, introduzca: "+ tipoCafeEscogido.getPrecio());

	}
}
