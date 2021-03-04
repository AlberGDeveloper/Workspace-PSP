package clientesocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClienteSocket {

	// IP y Puerto a la que nos vamos a conectar
	public static final int PUERTO = 2017;
	public static final String IP_SERVER = "localhost";
	public static final int SUMAR = 1;
	public static final int RESTAR = 2;
	public static final int MULTIPLICAR = 3;
	public static final int DIVIDIR = 4;
	static Scanner sc = new Scanner(System.in);
	public static int opcion;
	
	public static int mostrarMenu() {
		System.out.println("SELECCIONA LA OPERACIÓN A REALIZAR");
		System.out.println(SUMAR + " SUMAR");
		System.out.println(RESTAR + " RESTAR");
		System.out.println(MULTIPLICAR + " MULTIPLICAR");
		System.out.println(DIVIDIR + " DIVIDIR");
		opcion = Integer.parseInt(sc.nextLine());
		return opcion;

	}
	
	public static void main(String[] args) {
		System.out.println("        APLICACIÓN CLIENTE");
		System.out.println("-----------------------------------");
		
		Socket socketCliente = null;
		InputStreamReader entrada = null;
		PrintStream salida = null;

		InetSocketAddress direccionServidor = new InetSocketAddress(IP_SERVER, PUERTO);
		Scanner sc = new Scanner(System.in);

		try {
			
			boolean continuar = true;
			do {
				socketCliente = new Socket();
				socketCliente.connect(direccionServidor);
				System.out.println("Conexion establecida... a " + IP_SERVER + " por el puerto " + PUERTO);
				opcion = mostrarMenu();

				// asignamos este numero de puerto
				entrada = new InputStreamReader(socketCliente.getInputStream());
				// será lo que enviaremos al servidor
				salida = new PrintStream(socketCliente.getOutputStream());
				// será lo que nos devuelva el servidor

				System.out.println("Escriba 'SALIR' para cancelar la operación, o pulse cualquier tecla para continuar");
				String salir = sc.nextLine();
	
				if (salir.toLowerCase().equals("salir")) {
					continuar = false;
				}
				System.out.println("No ha salido del programa. ELIGE EL PRIMER NÚMERO");
				String numero1 = sc.nextLine();
				System.out.println("ELIGE EL SEGUNDO NÚMERO");
				String numero2 = sc.nextLine();
				String escogido ="";
				switch (opcion) {
				case 1: {
					escogido = "UNA SUMA";
					break;
				}
				case 2: {
					escogido = "UNA RESTA";
					break;
				}
				case 3: {
					escogido = "UNA MULTIPLICACIÓN";
					break;
				}
				case 4: {
					escogido = "UNA DIVISIÓN";
					break;
				}
				}
				System.out.println("La operación escogida ha sido "+escogido+" Se enviará la petición a nuestra calculadora");
				String operandos = numero1 +"-"+ numero2 +"-"+ opcion;
				salida.println(operandos);

				BufferedReader bf = new BufferedReader(entrada);
				// Esperamos aqui a que responda el servidor
				String linea_recibida = bf.readLine();
				System.out.println("CLIENTE: El servidor me ha respondido: " + linea_recibida);
				System.out.println("Quiere continuar? S/N");
				String sContinuar = sc.nextLine();
				if (sContinuar.equalsIgnoreCase("n")) {
					continuar = false;
				}
				//mostrarMenu();
			} while (continuar);
		} catch (UnknownHostException excepcion) {
			System.err.println("No encuentro el servidor en la dirección" + IP_SERVER);
		} catch (IOException excepcion) {
			System.err.println("Error de entrada/salida"+ excepcion);
		} catch (Exception e) {
			System.err.println("Error: " + e);
		} finally {// ES MUYYY IMPORTANTE QUE EN LOS SOCKETS SIEMPRE SE CIERREN LAS CONEXIONES
			try {
				salida.close();
				entrada.close();
				socketCliente.close();
				sc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
