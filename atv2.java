//Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão dos
//números lidos.

package ATVD2;

import java.util.Scanner;

/**
 *  Date: dom,24 de março
 *  By Heric 2-54
 * 
 */


public class atv2 {

    public static void main(String[] args) {
            
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número");
            int nume1 = scanner.nextInt();

            System.out.println("Digite o segundo número");
            int nume2 = scanner.nextInt();

            int soma = nume1 + nume2; 
            int subtracao = nume1 - nume2;
            int multiplicacao = nume1 * nume2;
            int divisao = nume1 / nume2; 

            System.out.println("Soma: " + soma);
            System.out.println("subtracao: "+ subtracao);
            System.out.println("multiplicacao:"+ multiplicacao);
            System.out.println("divisao"+ divisao);
        }



    }



}
