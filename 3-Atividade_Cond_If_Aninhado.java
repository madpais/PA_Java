/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_condicionais;

import java.util.Scanner;

/**
 *
 * @author madpais
 */
public class App {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String seuNome = leia.next();
        String meuNome = "Marcos";
        if (seuNome.equalsIgnoreCase(meuNome)) {
            System.out.println("Pessoa com nome IGUAL!");
        } else {
            System.out.println("Pessoa com nome DIFERENTE!");
        }
     
        System.out.println("**** NEXT ****");
        
        System.out.println("Qual a sua idade?");
        int idade = leia.nextInt();
        System.out.println("Qual o seu peso?");
        int peso = leia.nextInt();
      System.out.println("Qual a sua altura? Utilize vírgula se precisar!");
        double altura = leia.nextDouble();
     
        leia.nextLine(); // Limpa o buffer para não dar pau na leitura entre esse double e a linha abaixo...ESSE FOI CHATO PROF pra corrigir.
            
        System.out.println("Qual a sua série favorita");
        String serie = leia.nextLine();
        
    
        
        System.out.println("Qual o seu animal preferido?");
        String animal = leia.next();
        
        System.out.println("Qual o número do seu tênis?");
        int tenis = leia.nextInt();
        
        
        int myIdade = 38;
        int myPeso = 91;    
        double myAltura = 1.75;    
        String mySerie = "Game of Thrones";
        String myAnimal = "todos";
        int myTenis = 41;
        int x = 0;
        
        if (idade == myIdade) {
            x = x + 1;
        } if (peso == myPeso) {
            x = x + 1;
        } if (altura == myAltura) {
            x = x + 1;
        } if (serie.equalsIgnoreCase(mySerie)) {
            x = x + 1;
        } if (animal.equalsIgnoreCase(myAnimal)) {
            x = x + 1;
        } if (tenis == myTenis) {
            x = x + 1;
        }
        
        if (x >=3) {
           System.out.println("Temos " + x + " pontos em comum. Esta pessoa eh bem parecida comigo!");
        } else {
           System.out.println("Temos " + x + " pontos em comum. Não somos tão parecidos!"); 
        }
        
        
   
    }
}
