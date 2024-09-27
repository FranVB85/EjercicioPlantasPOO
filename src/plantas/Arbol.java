package plantas;

public class Arbol extends Planta {

	private String variedad;
	private String tipoDeTronco;
	private double radioTronco;
	private String color;
	private String tipoHojas;

	public Arbol() {
	}

	public Arbol(String variedad, String tipoDeTronco, double radioTronco, String color, String tipoHojas) {
		super();
		this.variedad = variedad;
		this.tipoDeTronco = tipoDeTronco;
		this.radioTronco = radioTronco;
		this.color = color;
		this.tipoHojas = tipoHojas;
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
	 * @return the tipoDeTronco
	 */
	public String getTipoDeTronco() {
		return tipoDeTronco;
	}

	/**
	 * @param tipoDeTronco the tipoDeTronco to set
	 */
	public void setTipoDeTronco(String tipoDeTronco) {
		this.tipoDeTronco = tipoDeTronco;
	}

	/**
	 * @return the radioTronco
	 */
	public double getRadioTronco() {
		return radioTronco;
	}

	/**
	 * @param radioTronco the radioTronco to set
	 */
	public void setRadioTronco(double radioTronco) {
		this.radioTronco = radioTronco;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the tipoHojas
	 */
	public String getTipoHojas() {
		return tipoHojas;
	}

	/**
	 * @param tipoHojas the tipoHojas to set
	 */
	public void setTipoHojas(String tipoHojas) {
		this.tipoHojas = tipoHojas;
	}

	// Punto 3
	@Override
	public void decirLoQueSoy() {
		System.out.println("Hola soy un árbol");
	}

}
