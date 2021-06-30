/**
 * author : Wesley F.
 * modulo : 5
 * name : java basics - Fundamentos de Java + OOP
 */
package com.digitalhouse.aula03.exercicio02;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#.##");  
        List<Product> products = new ArrayList<Product>();
        for(int i = 0; i < 3; i++){
            Product product = new Product();

            System.out.println("Nome do Produto");
            product.name = in.next();    
            
            System.out.println("Valor do Produto");
            product.value = in.nextDouble();    

            System.out.println("Quantidade do Produto");
            product.qtd = in.nextInt();  
            
            products.add(product);
        }

        double valueTotal = 0;
        int i = 1;
        for(Product product : products){
            System.out.println("Produto "+i);
            System.out.println(product.name);
            System.out.println("R$"+format.format(product.value));
            System.out.println("Quantidade: "+product.qtd);
            valueTotal += product.value*product.qtd;
            i++;
        }

        System.out.println("Valor Total: "+format.format(valueTotal));

    }

    private static class Product {
        private String name;
        private double value;
        private int qtd;
    
        private Product(){

        }

        private Product(String name, double value, int qtd){
            this.name = name;
            this.value = value;
            this.qtd = qtd;
        }
    }

}
