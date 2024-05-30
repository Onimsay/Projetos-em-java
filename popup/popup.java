package popup;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class popup {
    public static void main(String[] args) {
        while (true) {
            JOptionPane.showMessageDialog(null, "Olá Mundo!");
            // Exibe uma mensagem de pop-up

            JOptionPane.showMessageDialog(null, "Clica de novo", "Mensagem", JOptionPane.INFORMATION_MESSAGE);

            int escolha = JOptionPane.showConfirmDialog(null, "Tu entendeu?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (escolha == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Te fuder ent.");
            } else if (escolha == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Assim que é bom.");
            }

            String nome = JOptionPane.showInputDialog(null, "Digite o seu nome:", "Cadastro de usuário", JOptionPane.PLAIN_MESSAGE);
            if (nome == null || nome.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nome bem legal!", "ERRO", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            if (nome.equalsIgnoreCase("cu")) {
                JOptionPane.showMessageDialog(null, "HAHAHHAHAHAHAHAHHAHAHAH ingraçadinho toma no cu vai JÃO");
            }

            String sobrenome = JOptionPane.showInputDialog(null, "Digite seu sobrenome:", "Cadastro de usuário", JOptionPane.PLAIN_MESSAGE);
            if (sobrenome == null || sobrenome.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "COLOCA O NOME!", "ERRO", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            JOptionPane.showMessageDialog(null, "Olá, " + nome + " " + sobrenome);

            String[] opcoesGenero = {"Masculino", "Feminino", "marmitex de 20", "automovel(todos os tipos)", "objetos(no geral)", "eletricidade", "soparafans", "todos ao mesmo tempo", "Outro"};
            String genero = (String) JOptionPane.showInputDialog(null, "Selecione seu gênero:", "Cadastro de usuário", JOptionPane.PLAIN_MESSAGE, null, opcoesGenero, opcoesGenero[0]);

            if (genero == null) {
                JOptionPane.showMessageDialog(null, "Selecione seu gênero", "ERRO", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            switch (genero) {
                case "Masculino":
                case "Feminino":
                    JOptionPane.showMessageDialog(null, "vai o normalzao");
                    break;
                case "marmitex de 20":
                    JOptionPane.showMessageDialog(null, "ta barato assim?");
                    break;
                case "automovel(todos os tipos)":
                    JOptionPane.showMessageDialog(null, "posso te dirigir 😛😏😈");
                    break;
                case "objetos(no geral)":
                    JOptionPane.showMessageDialog(null, "basico filho");
                    break;
                case "eletricidade":
                    JOptionPane.showMessageDialog(null, "faaaaala isaac newton");
                    break;
                case "soparafans":
                    JOptionPane.showMessageDialog(null, "fala catarina paolino");
                    break;
                case "todos ao mesmo tempo":
                    JOptionPane.showMessageDialog(null, "joa joite jinderela");
                    break;
                case "Outro":
                    JOptionPane.showMessageDialog(null, "demoro");
                    break;
            }

            String email = JOptionPane.showInputDialog(null, "Insira o email para contato", "Email", JOptionPane.PLAIN_MESSAGE);
            if (email == null) {
                JOptionPane.showMessageDialog(null, "Não pode ser vazio, não mêu", "ERRO", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            int email2 = JOptionPane.showConfirmDialog(null, "Seu email está correto? " + email, "Confirmação email", JOptionPane.YES_NO_OPTION);
            if (email2 == JOptionPane.NO_OPTION) {
                JOptionPane.showInputDialog(null, "Insira o email para contato", "Email", JOptionPane.PLAIN_MESSAGE);
            }

            int escola2 = JOptionPane.showConfirmDialog(null, "Você está sozinho agora?", "ESTÁ?????????", JOptionPane.YES_NO_CANCEL_OPTION);
                for (int i = 0; i < 50; i++) {
                    JFrame frame = new JFrame("??????????????????????????????????????????????????");
                    frame.setSize(300, 200);
                    frame.setLocation(getRandomLocation());
                    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                    JLabel label = new JLabel("                                    Q̶̢̢̢̼̝̹̺̭͍̤͔͂̽̊͠ͅȖ̸̡͉͈̲̣̼̫̘̩͚͙͙͙̣̘͙͚̫̙͎̹͓͖̻̱̔͑̆̒̈́̅͐͐̇̕͘̕Ę̴̨̨̡̛̛͚͕̺͙̪̯̬̳̲̬̟͉͇̗̮̙̳̘̬̦̦̗͎̜̘͓̼̟̪̱̹̩̐͒͑͛̏͆̊̾̋̊͆͑̓̏͐͘̕̕̕͜͠ ̷̡̧̨̧̢̟̮͈̬̼̭̲̝̠͍̫̖̫̟̝̖̞̞̻̘͔͉͍͎͎͈͙̠̹͋̿̂́͐̂̃́̂̾̾͐́͐͊͐̋̔͂͊̀̅̓́̏̍̓̈́͆̃̚͜͝͝B̶̡̡̧̢̦̖̱̘̼͖̖̤̱̗͇͎͇̞͉͈̗͙̥͈̘̥͓̭͇̻̭̮̘̦̼̻̻̮͈͍̬̐̈́͜͜͜ͅͅǪ̸̧̥̞̘̬͙͇̪̠̜̖̟̙͍͉̟͎͉̮̞̩͎̤̥̠̪͈̩̘͖͍̳̜̭̝̉̀͊͐̈̎̒͌M̵̭̪̰͚͕̝̦̺̺̫͓̬̖̯̲̺̗̍̔̆̿̔̇͆͗̇́̀̌̍̇̅̈́̄̀̊̄͛̃̈́̏̽̃̎̀́̓̊́̑͘͝ ̶̡̧̢͙̯̞̥͕͉̘͍͎̣͉̜̗͙̦̰̳̳͔̬͋͜͜ͅͅ");
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
