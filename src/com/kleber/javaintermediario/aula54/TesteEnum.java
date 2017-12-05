package com.kleber.javaintermediario.aula54;

public class TesteEnum {

	public static void main(String[] args) {
		
		DiaSemana dia = DiaSemana.DOMINGO;
		
		System.out.println(dia.toString() + " - " + dia.getValor());
		
		Data data = new Data(1, 1, 2017, DiaSemana.SABADO);
		
		System.out.println(data.getDia());

	}
}
