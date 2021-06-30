/**
 * author : Wesley F.
 * modulo : 5
 * name : java basics - Fundamentos de Java + OOP
 */
package com.digitalhouse.aula03.exercicio01;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        int n = 0;

        System.out.println("Digite o valor de N");
        n = in.nextInt();

        System.out.println("Numeros Primos");
        for(int i = 2; i <= n; i++){
            
            if(!virifyIsPrimeNumber(i)) continue;
            System.out.print(i + " ");
            
        }
	}
	
	public static boolean virifyIsPrimeNumber(int number) {
		if(number == 2 || number == 3 || number == 5 || number == 7 ) return true;
		if(number%2 == 0 || number%3 == 0 || number%5 == 0 || number%7 == 0 ) return false;
		return true;
		
		
	}
}
