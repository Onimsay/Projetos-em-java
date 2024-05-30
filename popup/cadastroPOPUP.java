
package popup;

import java.time.LocalDate;
import java.time.Period;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import javax.swing.*;

public class cadastroPOPUP {
    private static final String FILE_PATH = "cadastrola.txt";
    
    public static void main(String[] args) {

        while (true) {
            
            String nome = JOptionPane.showInputDialog(null, "Digite o seu nome:", "Cadastro de usuário", JOptionPane.PLAIN_MESSAGE);
            
            if(nome == null || nome.trim().isEmpty()){
                JOptionPane.showMessageDialog(null, "Não pode ser vazio!", "ERRO", JOptionPane.ERROR_MESSAGE);
                continue;
            }       

            String sobrenome = JOptionPane.showInputDialog(null, "Digite seu sobremone", "Cadastro de usuário", JOptionPane.PLAIN_MESSAGE);

            if (sobrenome == null || sobrenome.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Não pode ser vazio!", "ERRO", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            String [] opcoesGenero = {"Masculino", "Feminino", "Outro"};
            String genero = (String) JOptionPane.showInputDialog(null, "Selecione seu gênero:", "Cadastro de usuário",
             JOptionPane.PLAIN_MESSAGE, null, opcoesGenero, opcoesGenero[0]);

            if (genero == null) {
                JOptionPane.showMessageDialog(null, "Selecione seu gênero", "ERRO", JOptionPane.ERROR_MESSAGE);
                continue;
            }

        }

    }
}

//String nome, String sobrenome, String genero, double idadeN, double telefone, String end, double cpf, double salario) {
