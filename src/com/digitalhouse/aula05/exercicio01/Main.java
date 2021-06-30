/**
 * author : Wesley F.
 * modulo : 5
 * name : java basics - Fundamentos de Java + OOP
 */
package com.digitalhouse.aula05.exercicio01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa[] pessoas = {
				new Pessoa("JANDERSON", "12345"),
				new Pessoa("Jackeline", "01333"),
				new Pessoa("Moreira", "00224")
		};
		SortUtil.sort(pessoas);
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getCpf()+" - "+pessoa.getNome());
		}
		
		System.out.println();
		
		Celular[] celulares = {
				new Celular(322441000, "Fixo"),
				new Celular(40028922, "celular"),
				new Celular(11933241, "satelite")
		};

		SortUtil.sort(celulares);
		
		for (Celular celular : celulares) {
			System.out.println(celular.getNumber()+" - "+celular.getHolder());
		}
	}

}
