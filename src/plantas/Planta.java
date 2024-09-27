package plantas;

public abstract class Planta {

	private String nombre;
	private double altoTallo;
	private boolean tieneHojas;
	private String climaIdeal;

	public Planta() {
	}

	public Planta(String nombre, double altoTallo, boolean tieneHojas, String climaIdeal) {
		this.nombre = nombre;
		this.altoTallo = altoTallo;
		this.tieneHojas = tieneHojas;
		this.climaIdeal = climaIdeal;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the altoTallo
	 */
	public double getAltoTallo() {
		return altoTallo;
	}

	/**
	 * @param altoTallo the altoTallo to set
	 */
	public void setAltoTallo(double altoTallo) {
		this.altoTallo = altoTallo;
	}

	/**
	 * @return the tieneHojas
	 */
	public boolean isTieneHojas() {
		return tieneHojas;
	}

	/**
	 * @param tieneHojas the tieneHojas to set
	 */
	public void setTieneHojas(boolean tieneHojas) {
		this.tieneHojas = tieneHojas;
	}

	/**
	 * @return the climaIdeal
	 */
	public String getClimaIdeal() {
		return climaIdeal;
	}

	/**
	 * @param climaIdeal the climaIdeal to set
	 */
	public void setClimaIdeal(String climaIdeal) {
		this.climaIdeal = climaIdeal;
	}

	/**
	 * 
	 */
	protected abstract void decirLoQueSoy();

}
