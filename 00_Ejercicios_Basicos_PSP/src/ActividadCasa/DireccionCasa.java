package ActividadCasa;

public class DireccionCasa {

	public DireccionCasa(String tipoVia, String nombreVia, String codigoPostal) {
		super();
		this.tipoVia = tipoVia;
		this.nombreVia = nombreVia;
		this.codigoPostal = codigoPostal;
	}

	public String getTipoVia() {
		return tipoVia;
	}

	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}

	public String getNombreVia() {
		return nombreVia;
	}

	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	private String tipoVia;
	private String nombreVia;
	private String codigoPostal;

	@Override
	public String toString() {
		return "Direccion:  Tipo de vía " + tipoVia + ", Nombre= " + nombreVia + ", CP=" + codigoPostal + "]";
	}

}
