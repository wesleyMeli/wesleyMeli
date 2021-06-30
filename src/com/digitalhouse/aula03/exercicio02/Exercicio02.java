/**
 * author : Wesley F.
 * modulo : 5
 * name : java basics - Fundamentos de Java + OOP
 */
package com.digitalhouse.aula03.exercicio02;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercicio02 {

	public static void main(String[] args) {
		final DateTimeFormatter dataFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DecimalFormat format = new DecimalFormat("#.##");  

        Company empresaX = new Company("Empresa X", LocalDate.parse("01/01/2021", dataFormat) , 1.13, 148);
        Company empresaY = new Company("Empresa Y", LocalDate.parse("01/01/2021", dataFormat), 18.4, 32);

        int i = 0;
        
        
        while(true){
            System.out.println("Ano - "+i);
            System.out.println(empresaX.name +" - "+ empresaX.date.format(dataFormat) +" - "+"Valor da empresa: "+ format.format(empresaX.value * Math.pow( (1+(empresaX.annualGrowthRate/100)),i ))+"m");
            System.out.println(empresaY.name +" - "+ empresaY.date.format(dataFormat) +" - "+"Valor da empresa: "+ format.format(empresaY.value * Math.pow( (1+(empresaY.annualGrowthRate/100)),i ))+"m");
            System.out.println("--------------------------------------------- ");
            if( empresaX.value * Math.pow( (1+(empresaX.annualGrowthRate/100)),i ) > empresaY.value * Math.pow( (1+(empresaY.annualGrowthRate/100)),i ) ) break;
            i++;
            
            empresaX.date = empresaX.date.plusYears(1);
            empresaY.date = empresaY.date.plusYears(1);
        }
        
        
    }

    private static class Company {
        private String name;
        private LocalDate date;
        private double value;
        private double annualGrowthRate;
    
        private Company(String name,LocalDate date,double value, double annualGrowthRate){
            this.name = name;
            this.date = date;
            this.value = value;
            this.annualGrowthRate = annualGrowthRate;
        }
    }

}
