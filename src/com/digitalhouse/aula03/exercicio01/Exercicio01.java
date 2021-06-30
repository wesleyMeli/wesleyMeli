/**
 * author : Wesley F.
 * modulo : 5
 * name : java basics - Fundamentos de Java + OOP
 */

package com.digitalhouse.aula03.exercicio01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        int n = 0;

        System.out.println("Digite um numero");
        n = in.nextInt();

        System.out.println("Numeros pares");
        for(int i = 0; i <= n; i++){
            if(i%2 != 0) continue;
            System.out.print(i + " ");
            
        }

	}

}
