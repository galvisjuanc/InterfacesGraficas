package igraphic.ex14.cronometro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cronometro extends JFrame{
    private JPanel mainPanel;
    private JLabel mainLabel;
    private JButton btnIniciar;
    private JButton btnPausar;
    private JButton btnReiniciar;
    private JLabel valorCronometro;

    private Timer tiempo;
    private int centesimaSegundos = 0;
    private int segundos = 0;
    private int minutos = 0;
    private int horas = 0;

    private ActionListener acciones = new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent e) {
            centesimaSegundos++;
            if(centesimaSegundos == 100) {
                segundos++;
                centesimaSegundos = 0;
            }
        }
    };

    public Cronometro() {
        configurarBotones();

        tiempo = new Timer(10, acciones);

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
