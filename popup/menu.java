package popup;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class menu {
public static void main(String[] args) {
    JFrame frame = new JFrame("Menu");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    frame.setLayout(new BorderLayout());

    JMenuBar menuBar = new JMenuBar();
    JMenu menu = new JMenu("Opções");
    menuBar.add(menu);

    JMenuItem popupHERICItem = new JMenuItem("poppupHeric");
    JMenuItem cadastropopupHERICItem = new JMenuItem ("CadastroPOPUP");

    menu.add(popupHERICItem);
    menu.add(cadastropopupHERICItem);

    popupHERICItem.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e ){
            popup.main(null);
        }

    });
    cadastropopupHERICItem.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e ){
            cadastroPOPUP.main(null);
        }
    
    });

    frame.setJMenuBar(menuBar);

    JPanel panel = new JPanel();
    JButton sairButton = new JButton("Sair");

    sairButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
        });

        panel.add(sairButton);

        frame.add(panel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}


