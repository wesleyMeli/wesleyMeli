/**
 * author : Wesley F.
 * modulo : 5
 * name : java basics - Fundamentos de Java + OOP
 */
package com.digitalhouse.aula04.exercicio02;

public class StringUtil {
	
	public static String rpad (String s, char c, int n) {
		if(s.length() < n) return s;
		String aux = s.substring(0, n);
		aux += c;
		return aux+s.substring(n, s.length());
	}
	
	public static String ltrim (String s) {
		return s.stripLeading();
	}
	
	public static String rtrim (String s) {
		return s.stripTrailing();
	}
	
	public static String trim(String s) {
		return s.strip();
	}
	
	public static int indexOfN(String s, char c, int n) {
		int digits = 1;
		for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != c) continue;
            digits++;
            if(digits == n) return i;
        }
		return -1;
	}

}
