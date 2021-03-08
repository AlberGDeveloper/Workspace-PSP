package basicohilos2;

public class HiloFactorialThread extends Thread {

	private long numerofactorial;

	
	public HiloFactorialThread(long numerofactorial) {
		this.numerofactorial = numerofactorial;
	}

	public long getNumerofactorial() {
		return numerofactorial;
	}

	public void setNumerofactorial(long numerofactorial) {
		this.numerofactorial = numerofactorial;
	}

	@Override
	public void run() {
		solucionFactorial();
	}

	private synchronized void solucionFactorial() {
		long factorial = 1;
		for (long i = numerofactorial; i > 0; i--) {
			factorial = factorial * i;
		}
		System.out.println("PARA EL HILO "+Thread.currentThread().getName()+"El factorial de " + numerofactorial + " es: " + factorial);
		
	}

}
