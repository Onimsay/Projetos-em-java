package ATVD;
import java.util.Scanner;


/**
 * By Nimsay
 *
 */
public class num1 {

    

    public static void main(String[] args) {
       
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o valor de A:");
         int A = scanner.nextInt();
        System.out.println("Digite o valor de B:");
            int B = scanner.nextInt();
            System.out.println("Digite o valor de C:");
            int C = scanner.nextInt();
            int somaAB = A + B;
            if (somaAB < C) {
                System.out.println("A soma de A e B é menor que C.");
            } else {
                System.out.println("A soma de A e B é maior que C.");
            }
        }
       
    }

}
