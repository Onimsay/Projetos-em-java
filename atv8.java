//Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o preço de
//custo receberá um acréscimo de acordo com um percentual informado pelo usuário.
package ATVD2;

import java.util.Scanner;

/**
 *  Date: dom,24 de março
 *  By Heric 2-54
 * 
 */

public class atv8 {
    
    
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o preço de custo do produto: ");
            int PreC = scanner.nextInt();


            
            System.out.println("Digite o percentual de acréscimo: ");
            int PercenA = scanner.nextInt();

            int ValorVenda = PreC + (PreC * (PercenA / 100 )); 
            
            System.out.println("O valor de venda do produto é: " + ValorVenda);
        }

    }
}
