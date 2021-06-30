/**
 * author : Wesley F.
 * modulo : 5
 * name : java basics - Fundamentos de Java + OOP
 */
package com.digitalhouse.aula03.exercicio02;

import java.util.Arrays;
import java.util.Collections;

public class Exercicio01 {

	public static void main(String[] args) {
		Integer[] array = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};

        Arrays.sort(array);

        System.out.println("Crescente");
        System.out.println(Arrays.toString(array));

        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Decrescente");
        System.out.println(Arrays.toString(array));

	}

}
