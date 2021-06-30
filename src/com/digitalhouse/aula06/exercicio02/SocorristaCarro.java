/**
 * author : Wesley F.
 * modulo : 5
 * name : java basics - Fundamentos de Java + OOP
 */
package com.digitalhouse.aula06.exercicio02;

public class SocorristaCarro extends Veiculo implements Socorrer<Carros>{


	@Override
	public void socorrer(Carros carro) {
		System.out.println("Soccorendo Carro, placa "+carro.getPlaca());
	}

}
