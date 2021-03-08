package fibobasic;

import java.util.Scanner;

public class Main{

    public static void main(String[] args){
 
        Scanner sc = new Scanner(System.in);
        int numero,fibo1,fibo2,i;
  
        do{
            System.out.print("Introduce numero mayor que 1: ");
            numero = sc.nextInt();
        }while(numero<=1);
  
        System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:");                 

        fibo1=1;
        fibo2=1;

        System.out.print(fibo1 + " ");
        for(i=2;i<=numero;i++){
            System.out.print(fibo2 + " ");
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }
        System.out.println();
    }
}

//Juguetear con milisegundos hilos
/**
public class Hilos extends Thread {
int numeroACalcular;

public Hilos(int numeroACalcular) {
	this.numeroACalcular = numeroACalcular;
}

@Override
public void run() {
	Date dateInicial = new Date();
	double tiempoInicial = dateInicial.getTime();

	for (int i = 2; i < numeroACalcular; i++) {
		if (numeroACalcular % i == 0) {
			System.out.println("El número " + numeroACalcular + " no es primo");
			Date dateFinal = new Date();
			double tiempofinal = dateFinal.getTime();
			System.out.println("El tiempo del hilo " + this.getName() + " han sido: "
					+ (tiempofinal- tiempoInicial) + " milisegundos");
			this.stop();
		}
	}
	Date dateFinal = new Date();
	double tiempofinal = dateFinal.getTime();
	System.out.println("El tiempo del hilo " + this.getName() + " han sido: " + (tiempofinal- tiempoInicial)
			+ " milisegundos");
}
}**/