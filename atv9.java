//Elaborar um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar
//(US$). O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares disponíveis como
//usuário. |
package ATVD2;

import java.util.Scanner;

/**
 *  Date: dom,24 de março
 *  By Heric 2-54
 * 
 */

public class atv9 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o valor da cotação do dólar: ");
            int cotaD = scanner.nextInt();

            System.out.println("Digite a quantidade de dólares : ");
            int quanD = scanner.nextInt();

            int ValorReal = cotaD * quanD; 

            System.out.println("O valor em real é: R$" + ValorReal);
        }
    }
    
}
