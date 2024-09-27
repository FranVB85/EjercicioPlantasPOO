package plantas;

public class Flor extends Planta {

	private String colorDePetalos;
	private int cantidadPetalos;
	private String colorPistilo;
	private String variedad;
	private String estacion;

	public Flor() {
	}

	public Flor(String colorDePetalos, int cantidadPetalos, String colorPistilo, String variedad, String estacion) {
		super();
		this.colorDePetalos = colorDePetalos;
		this.cantidadPetalos = cantidadPetalos;
		this.colorPistilo = colorPistilo;
		this.variedad = variedad;
		this.estacion = estacion;
	}

	/**
	 * @return the colorDePetalos
	 */
	public String getColorDePetalos() {
		return colorDePetalos;
	}

	/**
	 * @param colorDePetalos the colorDePetalos to set
	 */
	public void setColorDePetalos(String colorDePetalos) {
		this.colorDePetalos = colorDePetalos;
	}

	/**
	 * @return the cantidadPetalos
	 */
	public int getCantidadPetalos() {
		return cantidadPetalos;
	}

	/**
	 * @param cantidadPetalos the cantidadPetalos to set
	 */
	public void setCantidadPetalos(int cantidadPetalos) {
		this.cantidadPetalos = cantidadPetalos;
	}

	/**
	 * @return the colorPistilo
	 */
	public String getColorPistilo() {
		return colorPistilo;
	}

	/**
	 * @param colorPistilo the colorPistilo to set
	 */
	public void setColorPistilo(String colorPistilo) {
		this.colorPistilo = colorPistilo;
	}

	/**
	 * @return the variedad
	 */
	public String getVariedad() {
		return variedad;
	}

	/**
	 * @param variedad the variedad to set
	 */
	public void setVariedad(String variedad) {
		this.variedad = variedad;
	}

	/**
	 * @return the estacion
	 */
	public String getEstacion() {
		return estacion;
	}

	/**
	 * @param estacion the estacion to set
	 */
	public void setEstacion(String estacion) {
		this.estacion = estacion;
	}

	// Punto 3
	@Override
	public void decirLoQueSoy() {
		System.out.println("Hola soy una flor");
	}

}
