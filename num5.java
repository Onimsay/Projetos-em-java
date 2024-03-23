package ATVD;

import java.util.Scanner;

public class num5 {

        public static void main(String[] args) {
            float salarioMinimo = (float) 1293.20;
    
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("Digite o valor do salário do usuário:");
                float salarioUsuario = scanner.nextFloat();
   
                double quantSalariosMinimos = (salarioUsuario / salarioMinimo);
   
                System.out.println("O usuário ganha " + quantSalariosMinimos + " salários mínimos.");
            }
          }
    }
    