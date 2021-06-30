/**
 * author : Wesley F.
 * modulo : 5
 * name : java basics - Fundamentos de Java + OOP
 */
package com.digitalhouse.aula06.exercicio02;

public class SocorristaMoto extends Veiculo implements Socorrer<Motos>{
	
	@Override
	public void socorrer(Motos moto) {
		System.out.println("Soccorendo Moto, placa "+moto.getPlaca());
	}



}
