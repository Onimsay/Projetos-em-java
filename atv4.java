//Escrever um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. No final
//informar o nome do aluno e a sua média (aritmética).

package ATVD2;

import java.util.Scanner;

/*
 *  Date: dom,24 de março
 *  By Heric 2-54 
 * 
 */


public class atv4 {
    
        public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Digite o nome do aluno: ");
                String nomeAluno = scanner.nextLine();
                
                System.out.print("Digite a nota da primeira prova: ");
                int nota1 = scanner.nextInt();
                
                System.out.print("Digite a nota da segunda prova: ");
                int nota2 = scanner.nextInt();
                
                System.out.print("Digite a nota da terceira prova: ");
                int nota3 = scanner.nextInt();
                
                int media = (nota1 + nota2 + nota3) / 3;
                
                System.out.println("Nome do aluno: " + nomeAluno);
                System.out.println("Média: " + media);
            }
            
        
        }
    }

