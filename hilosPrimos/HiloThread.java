package hilosPrimos;

import java.util.Date;

public class HiloThread extends Thread {
	private long numeroprimo;

	public HiloThread(long numeroprimo) {

		this.numeroprimo = numeroprimo;

	}

	public long getNumeroprimo() {
		return numeroprimo;
	}

	public void setNumeroprimo(int numeroprimo) {
		this.numeroprimo = numeroprimo;
	}

	@Override
	public void run() {
		Date inicio = new Date();
		double tiempoinicial = inicio.getTime();
		Boolean es = true;
		String resultado = "Es primo";
		System.out.println("Calculando...");
		for (int i = 2; i < numeroprimo; i++) {
			if (numeroprimo % i == 0) {
				resultado = "No es primo";
				es = true;
				break;

			}
		}
		Date destino = new Date();
		destino.getTime();
		double tiempofinish = destino.getTime();
		double tiempofinal = tiempoinicial - tiempofinish;
		System.out.println("Soy el hilo " + Thread.currentThread().getName() + "\nEl resultado es : " + resultado
				+ "\nY he tardado " + tiempofinal + " segundos");
	}

}