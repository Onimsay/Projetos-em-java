package ATVD;

import java.util.Scanner;

public class num3 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o valor de A:");
            int A = scanner.nextInt();

            System.out.println("Digite o valor de B:");
            int B = scanner.nextInt();

            if (A == B) {
                int soma = A + B;
                System.out.println("Os valores de A e B são iguais. A soma é: " + soma);
            }
            else 
            System.out.println("Os valores de A e B não são iguais. A multiplicação dos dois é: "+ A*B);
        }

    }
}
