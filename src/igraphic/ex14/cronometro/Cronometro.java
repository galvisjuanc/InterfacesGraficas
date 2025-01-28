package igraphic.ex14.cronometro;

import javax.swing.*;
import java.awt.*;

public class Cronometro extends JFrame{
    private JPanel mainPanel;
    private JLabel jLabelDesk;

    public Cronometro() {
        setContentPane(mainPanel);
        setTitle("Cronometro");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        Cronometro cronometro = new Cronometro();
    }
}
