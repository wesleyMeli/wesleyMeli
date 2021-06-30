/**
 * author : Wesley F.
 * modulo : 5
 * name : java basics - Fundamentos de Java + OOP
 */
package com.digitalhouse.aula05.exercicio01;

public class Celular implements Precedente<Celular>{

	private int number;
	private String holder;
	
	public Celular(int number, String holder) {
		super();
		this.number = number;
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	@Override
	public int precedeA(Celular celular) {
		// TODO Auto-generated method stub
		return celular.getNumber() - this.number;
	}

}
