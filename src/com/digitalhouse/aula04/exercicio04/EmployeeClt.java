/**
 * author : Wesley F.
 * modulo : 5
 * name : java basics - Fundamentos de Java + OOP
 */
package com.digitalhouse.aula04.exercicio04;

public class EmployeeClt extends Employee {
	
	private int workedHours;
	private double bonus;
	private int goals;
	
	public EmployeeClt(double salare, int workedHours, double bonus, int goals) {
		super(salare);
		this.workedHours = workedHours;
		this.bonus = bonus;
		this.goals = goals;
	}
	
	public int getWorkedHours() {
		return workedHours;
	}
	public void setWorkedHours(int workedHours) {
		this.workedHours = workedHours;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public int getGoals() {
		return goals;
	}
	public void setGoals(int goals) {
		this.goals = goals;
	}

	@Override
	void pagarSalario() {
		System.out.println("Pagando salario : "+super.getSalare()*(1+(this.goals*this.bonus)));
		
	}
	
	

}
