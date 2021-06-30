/**
 * author : Wesley F.
 * modulo : 5
 * name : java basics - Fundamentos de Java + OOP
 */
package com.digitalhouse.aula06.exercicio01;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {
	
	private int contador = 0;
	private Map<Integer, List<Vestuario> > dicionario;

	public GuardaRoupa() {
		// TODO Auto-generated constructor stub
		dicionario = new HashMap<Integer, List<Vestuario>>();
	}
	
	public Integer guardarVestuarios(List<Vestuario> listaDeVestuario) {
		this.contador++;
		this.dicionario.put(this.contador, listaDeVestuario);
		return this.contador;
	}

	public void mostrarVestuarios() {
		this.dicionario.entrySet()
			.stream()
			.sorted(Map.Entry.comparingByKey())
			.forEach(System.out::println);
	}
	
	public List<Vestuario> devolverVestuarios(Integer id){
		return dicionario.get(id);
	}
	
}
