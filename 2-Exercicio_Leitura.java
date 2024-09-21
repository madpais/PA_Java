/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerc_2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Exerc_2 {
    
  public static final float SM = 1412; /***SALÁRIO MÍNIMO DECLEI COMO CONSTANTE****/
  
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite sua idade.");
        int idade = leia.nextInt();
        if (idade > 21) {       
            System.out.println("Maior de 21 anos");  
        } else if (idade == 20) {
            System.out.println("Possui 21 anos");  
        } else {
            System.out.println("Menor de 21 anos"); 
        }
        
        System.out.println("***** NEXT *****");
        
        System.out.println("Digite o seu salário!");
        float sal = leia.nextFloat();
        /*float sm = 1412;*/ //declarei como constante
        if ((sal / SM) > 5) {
            System.out.println("O seu salário é maior que 5 salários mínimo.");
        } else if ((sal / SM) == 5) {
            System.out.println("O seu salário é igual a 5 salários mínimo.");
        } else {
            System.out.println("O seu salário é menor que 5 salários mínimo.");
        }

        System.out.println("***** NEXT *****");
        
        System.out.println("Digite o sua altura! Utilize vírgula para separar os centímetros.");
        float alt = leia.nextFloat();
        if (alt > 1.75) {
            System.out.println("Vc é alto...maior do que 1,75mts22.");
        } else if (alt == 1.75) {
            System.out.println("Vc é alto eihn...1,75mts é bem alto.");
        } else {
            System.out.println("Vc tem menos de 1,75mts de altura");
        }
        
        System.out.println("***** NEXT *****");
        
        System.out.println("Digite o seu peso!");
        float peso = leia.nextFloat();
        if (peso > 70) {
            System.out.println("Vc pesa mais de 70kg.");
        } else if (peso == 70) {
            System.out.println("Vc pesa 70kg exato!");
        } else {
            System.out.println("Vc pesa menos de 70kg.");
        }
        
        System.out.println("***** NEXT *****");
        
        System.out.println("Digite o seu Sobrenome!");
        String sobrenome = leia.next();
        String meusbn = "Dias";
        if (sobrenome.equalsIgnoreCase(meusbn)) {
            System.out.println("Somos chará de Sobrenome uhuu...Nós dois somos 'DIAS'...");
        } else {
            System.out.println("Temos sobrenosmes diferentes!");
        }
        
        System.out.println("Digite seu Gênero: 'F para FEMININO' ou 'M para MASCULINO'.");
        String gen = leia.next();
        if (gen.equalsIgnoreCase("F")) {
            System.out.println("Gênero 'F' é FEMININO!");
        } else if (gen.equalsIgnoreCase("M")) {
            System.out.println("Gênero 'M' é MASCULINO!");
        } else {
            System.out.println("O Genêro não foi digitado conforme orientado!");
        }
        
        leia.close();
    }
}



/*
Utilizando o conceito de operador lógico e relacional, programe os códigos em Java a seguir:
• Leia a idade e verifique se a pessoa tem mais de 21 anos.
• Leia o salário e informe se o valor é maior que 5 vezes o salário mínimo.
• Leia a altura e verifique se é maior que 1,75 m
• .Leia o peso e informe se é maior que 70 kg.
• Leia o sobrenome e verifique se é diferente do seu.
• Leia o gênero e informe se é igual a 'f'.

*/
