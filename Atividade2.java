package ATVD;
import java.util.Scanner;

/**
 * By Nimsay
 *
 */


public class num2 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite um número:");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                System.out.println(numero + " é par.");
            } else {
                System.out.println(numero + " é ímpar.");
            }
            if (numero > 0) {
                System.out.println(numero + " é positivo.");
            } else if (numero < 0) {
                System.out.println(numero + " é negativo.");
            }
        }
    }
}
