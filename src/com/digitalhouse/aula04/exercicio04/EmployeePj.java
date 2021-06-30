/**
 * author : Wesley F.
 * modulo : 5
 * name : java basics - Fundamentos de Java + OOP
 */
package com.digitalhouse.aula04.exercicio04;

public class EmployeePj extends Employee{
	
	private double hourWage;
	private int workedHours;

	public EmployeePj(double hourWage, int workedHours) {
		
		this.hourWage = hourWage;
		this.workedHours = workedHours;
	}

	@Override
	void pagarSalario() {
		this.setSalare(this.workedHours*this.hourWage);
		System.out.println("Pagando salario : "+this.getSalare());
		
	}
}
