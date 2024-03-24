//Ler dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variável A passe a possuir o
//valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.

package ATVD2;


import java.util.Scanner;

/**
 *  Date: dom,24 de março
 *  By Heric 2-54
 * 
 */

public class atv5 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o valor de A");
            int A = scanner.nextInt(); 

            System.out.println("Digite o valor de B");
            int B = scanner.nextInt(); 

        int temp = A;
        A = B; 
        B = temp; 

        System.out.println("Valores trocados: ");
        System.out.println("A: "+ A );
        System.out.println("B: "+ B );
        }

    }


}