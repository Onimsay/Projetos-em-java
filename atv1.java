//Faça um algoritmo que receba dois números e exiba o resultado da sua soma.

package ATVD2;

import java.util.Scanner;

/**
 *  Date: dom,24 de março
 *  By Heric 2-54
 * 
 */

public class atv1 {
    
 public static void main(String[] args) {
    
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Digite o Primeiro número: ");
       int numero1 = scanner.nextInt();

       System.out.println("Digite o Segundo número");
       int numero2 = scanner.nextInt();

       int soma = numero1 + numero2; 
       System.out.println("A soma dos números é: "+ soma);
   }


 }





}
