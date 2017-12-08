package com.kleber.javaintermediario.aula56;

public class Pessoa {

	private TipoDocumento tipoDocumento;
	private String numeroDocumento;
	
	public Pessoa() {
		super();
	}
	
	/**
	 * @param tipoDocumento
	 * @param numeroDocumento
	 */
	public Pessoa(TipoDocumento tipoDocumento, String numeroDocumento) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
	}

	/**
	 * @return the tipoDocumento
	 */
	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}
	/**
	 * @param tipoDocumento the tipoDocumento to set
	 */
	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	/**
	 * @return the numeroDocumento
	 */
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	/**
	 * @param numeroDocumento the numeroDocumento to set
	 */
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pessoa [tipoDocumento=" + tipoDocumento + ", "
				+ "numeroDocumento=" + numeroDocumento + "]";
	}
	
	
}
