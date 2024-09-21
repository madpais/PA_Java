/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fatura;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Fatura {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        /*leia valor fatura*/
        System.out.println("Qual o valor de sua Fatura");
        float fat = leia.nextFloat();
        
        /*leia parcelas*/
        System.out.println("Quantas parcelas");
        float parc = leia.nextFloat();
        
        System.out.println("Qual o parcentual de desconto para pgto antecipado?");
        float percdesc = leia.nextFloat();
        
        System.out.println("Qual o parcentual de multa por atraso?");
        float percmult = leia.nextFloat();     
        
        System.out.println("Valor total com desconto para pagamento antecipado é igual a R$" + (fat-(fat*(percdesc/100)))+ ".");
        
        System.out.println("Valor de cada parcela já com a multa inclusa é igual a R$" + (fat+(fat*(percmult/100))) + " ***informativo*** O valor total da multa é de R$" + (fat*(percmult/100)) + ".");
     
        leia.close();
               
/*
Utilizando o conceito de operadores aritméticos :
• Faça um algoritmo que leia:
o Valor total de uma fatura
o Número de parcelas
o Percentual de desconto por pagamento antecipado
o Percentual de multa por atraso
• Imprima:
o Valor total com desconto para pagamento antecipado
o Valor de cada parcela com multa (imprima quantos reais de multa estão sendo
pagos em cada parcela).

*/

        
        
    }
}
