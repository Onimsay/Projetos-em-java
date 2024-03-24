//Escrever um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância total
//percorrida pelo automóvel e o total de combustível gasto.

package ATVD2;

import java.util.Scanner;

/*
 *
 *  Date: dom,24 de março
 *  By Heric 2-54
 */


public class atv3 {
    
public static void main(String[] args) {
    
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Informe a distancia total percorrida pelo aultomóvel (em km): ");
        int discPe = scanner.nextInt(); 

        System.out.println("Informe o total de combustível gasto pelo aultomóvel (em litros): ");
        int gasto = scanner.nextInt();

        int comsumoMedio = discPe / gasto; 

        System.out.println("O comsumo de médio do aultomóvel é de " + comsumoMedio + " km/1");
    }




}



}
