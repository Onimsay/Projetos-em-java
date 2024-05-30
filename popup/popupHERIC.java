

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class popupHERIC {
    public static void main(String[] args) {
        while (true) {
            JOptionPane.showMessageDialog(null, "Olá Mundo!");
            // Exibe uma mensagem de pop-up

            JOptionPane.showMessageDialog(null, "Cliqua di nuevo", "Mensagem", JOptionPane.INFORMATION_MESSAGE);

            int escolha = JOptionPane.showConfirmDialog(null, "Tu entendeu?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (escolha == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "boooyah");
            } else if (escolha == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "burro pra calahalo.");
            }

            String nome = JOptionPane.showInputDialog(null, "Digite o seu nome:", "Cadastro de usuário", JOptionPane.PLAIN_MESSAGE);
            if (nome == null || nome.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nome não pode estar vazio!", "ERRO", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            if (nome.equalsIgnoreCase("cu")) {
                JOptionPane.showMessageDialog(null, "Não seja desrespeitoso, por favor.");
            }

            String sobrenome = JOptionPane.showInputDialog(null, "Digite seu sobrenome:", "Cadastro de usuário", JOptionPane.PLAIN_MESSAGE);
            if (sobrenome == null || sobrenome.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, informe seu sobrenome.", "ERRO", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            JOptionPane.showMessageDialog(null, "Olá, " + nome + " " + sobrenome);

            String[] opcoesGenero = {"Masculino", "Feminino", "biciqueleta", "Helicrobritu","Pombo", "Outro"};
            String genero = (String) JOptionPane.showInputDialog(null, "Selecione seu gênero:", "Cadastro de usuário", JOptionPane.PLAIN_MESSAGE, null, opcoesGenero, opcoesGenero[0]);

            if (genero == null) {
                JOptionPane.showMessageDialog(null, "Por favor, selecione seu gênero.", "ERRO", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            switch (genero) {
                case "Masculino":
                    JOptionPane.showMessageDialog(null, "NORMAL");
                    break;
                case "Feminino":
                    JOptionPane.showMessageDialog(null, "NORMAL");
                    break;
                case "Outro":
                    JOptionPane.showMessageDialog(null, "Estranho");
                    break;
                    case "biciqueleta":
                    JOptionPane.showMessageDialog(null, "Pedala ai paizão 👻");
                    break;
                    case "Helicrobritu":
                    JOptionPane.showMessageDialog(null, "Faz o tuctuctuctactactact pra mim 😘😏");
                    break;
                    case "Pombo":
                    JOptionPane.showMessageDialog(null, "Caiu do céu coco de pombo, hoje na escvola teve uma ivestiggaçao para descobrir p maior cagador da escola cedup abilio paulo e dai no dia de hj eu alevantei de pau durasso ");
                    break;
                    
                    
            }

            String email = JOptionPane.showInputDialog(null, "Insira o email para contato", "Email", JOptionPane.PLAIN_MESSAGE);
            if (email == null || email.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um email válido.", "ERRO", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            int email2 = JOptionPane.showConfirmDialog(null, "Seu email está correto? " + email, "Confirmação email", JOptionPane.YES_NO_OPTION);
            if (email2 == JOptionPane.NO_OPTION) {
                JOptionPane.showInputDialog(null, "Insira o email para contato", "Email", JOptionPane.PLAIN_MESSAGE);
            }

            int escola2 = JOptionPane.showConfirmDialog(null, "SUA MÃE E BONITA ?", "ELA EEEEEEE", JOptionPane.YES_NO_CANCEL_OPTION);
                for (int i = 0; i < 50; i++) {
                    JFrame frame = new JFrame("GOSTOSA EH");
                    frame.setSize(300, 200);
                    frame.setLocation(getRandomLocation());
                    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


                    JLabel label = new JLabel("                           Ḑ̴̵̢̩ͭ́̕͟͝A̸̧̔͆͋ͬͥ͂́͏͢͢҉̶̳͎̥͇ ̴̸̧̢̰͚͚̞̯̠̣̅ͥ͆̔͆͆ͭ́͘̕͟͞E̢ͨ͑̃̍̃́́̐́͞҉̡̧̺̰̳̼̗̟̟̠͙͓̞̀͜L̴̛̼̙̳̹͖̰̪̹͔͔̟̱̝̣̀̓͗̓̅ͪ͂ͭ͜͠͞͠͞͠Ą̶ͭͮ̅̑ͨ̉ͯ̄̀͝͏̴̰̤̰͕͖̻̰̦͍̦̞̲̦̼̭͓̳͠͞ͅ ̡̛̜͎͖̜͍͓̯͍̱̭̭̗̣̣̥̮̺̲̻͔͈͑̄̐̒̊̔͟͢͡͠͞͡P̸̶̵̡̛̛͎̝̞̹̱̖̯̺̦͎͇̙̯̮̺̟̬̘̫͙̼̦̥̻̫̎́͘Ŗ̡̳͍̭͇̣͇͍̺͈̣͙̹̫̞̜̰̯̻͍̥̮̉̾ͩ̂̏̄́͟͡͞͞͞À̸̵̷̛̬̜͉͚̭̝͙̜̫͎̱̬͍͔̯̰̗ͮ͑ͬ͛͒͑̚͘͘͟͟ͅ ̴̛͉̠̲̯̹̩͚̭͇͉͖͔̖̣͛̿̓ͯͧͯͧ̉́̀͟͟͢͞M̵̛̓̉̒ͨ̀̏̑̐͢͏̢̡̙̬͓̲̳̼̥̥͎̪̤͡͞Ĩ̷̡̡̡͉̲̞̩̙͎̫͑ͩ̐̎ͣ͒̇́͘͟͡M̴̸̷̡̎̏̊ͦ̔͛̀͝͡͏̳̤̟͖  ");
                    frame.add(label, BorderLayout.CENTER);

                    JButton button = new JButton("SIM");
                    button.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            frame.dispose(); 
                        }
                    });
                    frame.add(button, BorderLayout.SOUTH);

                    frame.setVisible(true);
                }
            
            break;
        }
    }

    private static Point getRandomLocation() {
        int x = (int) (Math.random() * 1500);
        int y = (int) (Math.random() * 1500);
        return new Point(x, y);
    }
}
