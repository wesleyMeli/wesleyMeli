/**
 * author : Wesley F.
 * modulo : 5
 * name : java basics - Fundamentos de Java + OOP
 */
package com.digitalhouse.aula04.exercicio04;

public abstract class Employee {
	
	private double salare;
	
	public Employee() {}
	
	public Employee(double salare) {
		this.salare = salare;
	}

	public double getSalare() {
		return salare;
	}

	public void setSalare(double salare) {
		this.salare = salare;
	}

	abstract void pagarSalario();

}
