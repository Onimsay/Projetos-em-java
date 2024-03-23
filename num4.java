package ATVD;

import java.util.Scanner;

public class num4 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite um número inteiro:");
            int numero = scanner.nextInt();

            int antecessor = numero - 1;
            int sucessor = numero + 1;

            System.out.println("O antecessor de " + numero + " é: " + antecessor);
            System.out.println("O sucessor de " + numero + " é: " + sucessor);
        }

    }
}
