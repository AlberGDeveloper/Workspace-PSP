package pooHilos;

public class ClientePeluqueria extends Thread {

	private String nombre;
	private int tiempocortado;
	private int tiemposecado;
	private Peluquero peluquero;

	@Override
	public void run() {
		Peluquero.descansar(this);
	}

	public ClientePeluqueria(String nombre, int tiempocortado, int tiemposecado) {
		super();
		this.nombre = nombre;
		this.tiempocortado = tiempocortado;
		this.tiemposecado = tiemposecado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTiempocortado() {
		return tiempocortado;
	}

	public void setTiempocortado(int tiempocortado) {
		this.tiempocortado = tiempocortado;
	}

	public int getTiemposecado() {
		return tiemposecado;
	}

	public void setTiemposecado(int tiemposecado) {
		this.tiemposecado = tiemposecado;
	}

	public Peluquero getPeluquero() {
		return peluquero;
	}

	public void setPeluquero(Peluquero peluquero) {
		this.peluquero = peluquero;
	}

}
