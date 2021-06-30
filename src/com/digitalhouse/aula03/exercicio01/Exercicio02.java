/**
 * author : Wesley F.
 * modulo : 5
 * name : java basics - Fundamentos de Java + OOP
 */
package com.digitalhouse.aula03.exercicio01;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        int n = 0;
        int m = 0;

        System.out.println("Digite o valor de N");
        n = in.nextInt();

        System.out.println("Digite o valor de M");
        m = in.nextInt();

        System.out.println("Numeros multiplos de "+m);
        for(int i = 1; i <= n; i++){
            System.out.print(i*m + " ");
            
        }

	}

}
