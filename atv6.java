//Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um mês.
//Considere fixo o juro da poupança em 0,70% a. m.
package ATVD2;

import java.util.Scanner;

/**
 *  Date: dom,24 de março
 *  By Heric 2-54
 * 
 */

public class atv6 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o Valor depositado: ");
            int ValorD = scanner.nextInt();

            
            int rendimento = (int) (ValorD * 0.007);

            System.out.println("O valor com rendimento após um mês é: "+ (ValorD + rendimento));
        } 
    }

    
}