package plantas;

public class Arbusto extends Planta {

	private double ancho;
	private boolean esDomestico;
	private String variedadArbusto;
	private String colorDeHojas;
	private boolean sePodaONo;

	public Arbusto() {
	}

	public Arbusto(double ancho, boolean esDomestico, String variedadArbusto, String colorDeHojas, boolean sePodaONo) {
		super();
		this.ancho = ancho;
		this.esDomestico = esDomestico;
		this.variedadArbusto = variedadArbusto;
		this.colorDeHojas = colorDeHojas;
		this.sePodaONo = sePodaONo;
	}

	/**
	 * @return the ancho
	 */
	public double getAncho() {
		return ancho;
	}

	/**
	 * @param ancho the ancho to set
	 */
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	/**
	 * @return the esDomestico
	 */
	public boolean isEsDomestico() {
		return esDomestico;
	}

	/**
	 * @param esDomestico the esDomestico to set
	 */
	public void setEsDomestico(boolean esDomestico) {
		this.esDomestico = esDomestico;
	}

	/**
	 * @return the variedadArbusto
	 */
	public String getVariedadArbusto() {
		return variedadArbusto;
	}

	/**
	 * @param variedadArbusto the variedadArbusto to set
	 */
	public void setVariedadArbusto(String variedadArbusto) {
		this.variedadArbusto = variedadArbusto;
	}

	/**
	 * @return the colorDeHojas
	 */
	public String getColorDeHojas() {
		return colorDeHojas;
	}

	/**
	 * @param colorDeHojas the colorDeHojas to set
	 */
	public void setColorDeHojas(String colorDeHojas) {
		this.colorDeHojas = colorDeHojas;
	}

	/**
	 * @return the sePodaONo
	 */
	public boolean isSePodaONo() {
		return sePodaONo;
	}

	/**
	 * @param sePodaONo the sePodaONo to set
	 */
	public void setSePodaONo(boolean sePodaONo) {
		this.sePodaONo = sePodaONo;
	}

	// Punto 3
	@Override
	public void decirLoQueSoy() {
		System.out.println("Hola soy un arbusto");
	}

}
