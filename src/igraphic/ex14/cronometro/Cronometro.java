package igraphic.ex14.cronometro;

import javax.swing.*;

public class Cronometro extends JFrame{
    private JPanel mainPanel;
    private JLabel mainLabel;
    private JButton btnIniciar;
    private JButton btnPausar;
    private JButton btnReiniciar;
    private JLabel valorCronometro;

    public Cronometro() {
        setContentPane(mainPanel);
        setResizable(false);
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
