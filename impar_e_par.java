import java.util.Scanner;

public class impar_e_par {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            int count = 0;
            int impar = 0;
            int par = 0;
            System.out.println(" Digite um número para verificar se é par ou ímpar: ");
            int numeroUsuario = scanner.nextInt();

            while (count < 20) {

                if (numeroUsuario % 2 == 0) {
                    par += 1;
                    System.out.println("      ");
                    System.out.println("------------");
                    System.out.println("      ");
                    System.out.println(numeroUsuario + " é par.");
                    System.out.println("      ");
                    System.out.println("------------");
                    System.out.println("      ");

                } else {
                    impar += 1;
                    System.out.println("      ");
                    System.out.println("------------");
                    System.out.println("      ");
                    System.out.println(numeroUsuario + " é ímpar.");
                    System.out.println("      ");
                    System.out.println("------------");
                    System.out.println("      ");
                }

                System.out.println(" Digite um número para verificar se é par ou ímpar: ");

                numeroUsuario = scanner.nextInt();

                count++;
            }
            System.out.println("------------");
            System.out.println("Foram " + impar + " números impar e " + par + " números pares ");

    }
}
}
