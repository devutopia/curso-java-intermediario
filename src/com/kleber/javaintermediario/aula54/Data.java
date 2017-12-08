package com.kleber.javaintermediario.aula54;

public class Data {
	
	private int dia;
	private int mes;
	private int ano;
	private DiaSemana diaSemana;
	
	
	public Data() {
		super();
	}
	
	/**
	 * @param dia
	 * @param mes
	 * @param ano
	 * @param diaSemana
	 */
	public Data(int dia, int mes, int ano, DiaSemana diaSemana) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.diaSemana = diaSemana;
	}

	/**
	 * @return the dia
	 */
	public int getDia() {
		return dia;
	}
	/**
	 * @param dia the dia to set
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}
	/**
	 * @return the mes
	 */
	public int getMes() {
		return mes;
	}
	/**
	 * @param mes the mes to set
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}
	/**
	 * @return the ano
	 */
	public int getAno() {
		return ano;
	}
	/**
	 * @param ano the ano to set
	 */
	public void setAno(int ano) {
		this.ano = ano;
	}
	/**
	 * @return the diaSemana
	 */
	public DiaSemana getDiaSemana() {
		return diaSemana;
	}
	/**
	 * @param diaSemana the diaSemana to set
	 */
	public void setDiaSemana(DiaSemana diaSemana) {
		this.diaSemana = diaSemana;
	}
}
