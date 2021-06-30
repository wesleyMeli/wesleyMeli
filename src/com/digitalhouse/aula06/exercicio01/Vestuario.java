/**
 * author : Wesley F.
 * modulo : 5
 * name : java basics - Fundamentos de Java + OOP
 */
package com.digitalhouse.aula06.exercicio01;

public class Vestuario {
	
	private String modelo;
	private String marca;

	public Vestuario() {
		// TODO Auto-generated constructor stub
	}

	public Vestuario(String modelo, String marca) {
		this.modelo = modelo;
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Vestuario [modelo = " + modelo + ", marca = " + marca + "]";
	}

}
