/**
 * author : Wesley F.
 * modulo : 5
 * name : java basics - Fundamentos de Java + OOP
 */
package com.digitalhouse.aula05.exercicio01;

public class SortUtil{
	
	@SuppressWarnings("unchecked")
	public static <T> T sort(Precedente<T> arr[]) {
		Precedente<T> temp; 
		for(int i=0; i < arr.length; i++){  
			for(int j=1; j < (arr.length-i); j++){  
				if(arr[i].precedeA((T) arr[i+1]) != 1) {  
					temp = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = temp;  
				}  
                     
            }  
		} 
		return (T) arr;
	}


}
