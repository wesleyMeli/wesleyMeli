/**
 * author : Wesley F.
 * modulo : 5
 * name : java basics - Fundamentos de Java + OOP
 */
package com.digitalhouse.aula06.exercicio02;

public class Motos extends Veiculo{
	
	private static double PESO = 300;
	private static int RODAS = 2;

	public Motos(double velocidade, double aceleracao, double anguloDeGiro, String patente) {
		super(velocidade, aceleracao, anguloDeGiro,patente, PESO, RODAS);
		// TODO Auto-generated constructor stub
	}

}
