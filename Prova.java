import java.util.Scanner;

class prova {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int somaPares = 0;
    int somaImpares = 0;

    int contador = 0;
    while (contador < 30) {
      contador += 1;

      System.out.print("Digite um número natural: ");
      int numero = s.nextInt();

      if (contador <= 15 && numero % 2 == 0) {
        somaPares += numero;
      }

      if (contador > 15 && numero % 2 != 0) {
        somaImpares += numero;
      }

      System.out.println("+-------------------------+");
    }

    System.out.println("A soma dos números PARES entre o primeiro número e o décimo quinto é " + somaPares);
    System.out.println("A soma dos números ÍMPARES entre o décimo sexto número e o trigésimo é " + somaImpares);
  }
}
