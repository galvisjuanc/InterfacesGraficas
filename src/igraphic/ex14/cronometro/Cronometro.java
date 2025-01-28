package igraphic.ex14.cronometro;

import javax.swing.*;
import java.awt.*;

public class Cronometro extends JFrame{
    private JPanel mainPanel;
    private JLabel mainLabel;
    private JButton btnIniciar;
    private JButton btnPausar;
    private JButton btnReiniciar;
    private JLabel valorCronometro;

    public Cronometro() {
        configurarBotones();

        setContentPane(mainPanel);
        setResizable(false);
        setTitle("Cronometro");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    private void configurarBotones() {
        btnIniciar = new JButton("Iniciar");
        btnPausar = new JButton("Pausar");
        btnReiniciar = new JButton("Reiniciar");
        btnIniciar.setBackground(Color.CYAN);
        btnPausar.setBackground(Color.CYAN);
        btnReiniciar.setBackground(Color.CYAN);
        btnIniciar.setForeground(Color.RED);
        btnPausar.setForeground(Color.RED);
        btnReiniciar.setForeground(Color.RED);
    }

    public static void main(String[] args) {
        Cronometro cronometro = new Cronometro();
    }
}
