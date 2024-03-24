//Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é:
//F=(9"C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.

package ATVD2;

import java.util.Scanner;

/**
 *  Date: dom,24 de março
 *  By Heric 2-54
 * 
 */


public class atv10 {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite uma temperatura em graus Celsius: ");
            int cel = scanner.nextInt();

            int fahrenheit = (9 * cel + 160) / 5;

            System.out.println("A temperatura em graus fahrenheit é " + fahrenheit);
        }
    }
}
