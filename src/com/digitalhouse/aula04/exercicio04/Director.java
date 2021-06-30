/**
 * author : Wesley F.
 * modulo : 5
 * name : java basics - Fundamentos de Java + OOP
 */
package com.digitalhouse.aula04.exercicio04;

public class Director implements SalaryPayment{
	
	private static double PROFIT_SHARING = 0.03;
	private static double SALARE = 15000;
	@Override
	public void pagarSalario(double profit) {
		System.out.println("Pagando salario : "+(SALARE+(profit*PROFIT_SHARING)));
		
	}
	
}
