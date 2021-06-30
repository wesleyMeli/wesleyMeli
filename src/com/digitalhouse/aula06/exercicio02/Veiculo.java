/**
 * author : Wesley F.
 * modulo : 5
 * name : java basics - Fundamentos de Java + OOP
 */
package com.digitalhouse.aula06.exercicio02;

public class Veiculo {
	
	private double velocidade;
	private double aceleracao;
	private double anguloDeGiro;
	private String placa;
	private double peso;
	private int rodas;

	public Veiculo() {
		// TODO Auto-generated constructor stub
	}

	public Veiculo(double velocidade, double aceleracao, double anguloDeGiro, String placa, double peso, int rodas) {
		this.velocidade = velocidade;
		this.aceleracao = aceleracao;
		this.anguloDeGiro = anguloDeGiro;
		this.placa = placa;
		this.peso = peso;
		this.rodas = rodas;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public double getAceleracao() {
		return aceleracao;
	}

	public void setAceleracao(double aceleracao) {
		this.aceleracao = aceleracao;
	}

	public double getAnguloDeGiro() {
		return anguloDeGiro;
	}

	public void setAnguloDeGiro(double anguloDeGiro) {
		this.anguloDeGiro = anguloDeGiro;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getRodas() {
		return rodas;
	}

	public void setRodas(int rodas) {
		this.rodas = rodas;
	}

	@Override
	public String toString() {
		return "Veiculo [velocidade=" + velocidade + ", aceleracao=" + aceleracao + ", anguloDeGiro=" + anguloDeGiro
				+ ", placa=" + placa + ", peso=" + peso + ", rodas=" + rodas + "]";
	}
}
