/**
 * author : Wesley F.
 * modulo : 5
 * name : java basics - Fundamentos de Java + OOP
 */
package com.digitalhouse.aula03.exercicio01;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        int n = 0;
        int m = 0;
        int p = 0;

        int qtd = 0;
        

        System.out.println("Digite o valor de N");
        n = in.nextInt();

        System.out.println("Digite o valor de M");
        m = in.nextInt();

        System.out.println("Digite o valor de P");
        p = in.nextInt();

        System.out.println("Numeros naturais");

        for(int i = 0; true; i++){
            if(!numbersIsValid(i,p,m)) continue;
            System.out.println(i);            
            qtd++;
            if(qtd == n ) break;
        }

	}
	
	public static Boolean numbersIsValid(int number,int reference, int qtd){
        String temp = "" + number;
        int digits = 0;
        for (int i = 0; i < temp.length(); i++) {
            if(temp.charAt(i) != Character.forDigit(reference, 10)) continue;
            digits++;
        }
        return qtd <= digits;
    }

}
