//A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações sem juros. Faça um algoritmo que
//receba um valor de uma compra e mostre o valor das prestações. |
package ATVD2;

import java.util.Scanner;


/**
 *  Date: dom,24 de março
 *  By Heric 2-54
 * 
 */

public class atv7 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o valor da compra");
            int ValorC = scanner.nextInt();

            int ValorPres = ValorC / 5; 


            System.out.println("O valor da compra é " + ValorPres);
        }
    }
    
}
