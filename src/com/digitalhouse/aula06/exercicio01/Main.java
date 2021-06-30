/**
 * author : Wesley F.
 * modulo : 5
 * name : java basics - Fundamentos de Java + OOP
 */
package com.digitalhouse.aula06.exercicio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Vestuario> vestuarios = new ArrayList<Vestuario>();
		
		Collections.addAll(vestuarios, new Vestuario("Air Jordan", "Nike"),new Vestuario("Camiseta", "Hering"));
		
		GuardaRoupa guardaRoupa = new GuardaRoupa();
		int index = guardaRoupa.guardarVestuarios(vestuarios);
		
		List<Vestuario> vestuariosDevolucao = guardaRoupa.devolverVestuarios(index);
		vestuariosDevolucao.forEach(System.out::println);
	}

}
