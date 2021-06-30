/**
 * author : Wesley F.
 * modulo : 5
 * name : java basics - Fundamentos de Java + OOP
 */
package com.digitalhouse.aula04.exercicio02;

public class Counter {
	
	private int value;

	public Counter() {
		// TODO Auto-generated constructor stub
	}
	
	public Counter(Counter counter) {
		super();
		this.value = counter.value;
	}

	public Counter(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public void increaseValue(int value) {
		this.value += value;

	}
	
	public void decreaseValue() {
		this.value -= value;

	}

}
