/**
 * author : Wesley F.
 * modulo : 5
 * name : java basics - Fundamentos de Java + OOP
 */
package com.digitalhouse.aula04.exercicio02;

public class IncorrectDataException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IncorrectDataException( String errorMessage ) {
		super(errorMessage);
	}
	
}
