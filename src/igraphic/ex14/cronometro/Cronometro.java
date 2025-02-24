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
    private JLabel lblTiempo;

    private Timer tiempo;
    private int centesimaSegundos = 0;
    private int segundos = 0;
    private int minutos = 0;
    private int horas = 0;

    private ActionListener acciones = e -> {
        centesimaSegundos++;
        if(centesimaSegundos == 100) {
            segundos++;
            centesimaSegundos = 0;
        }
        if(segundos == 60) {
            minutos++;
            segundos = 0;
        }
        if(minutos == 60) {
            horas++;
            minutos = 0;
        }

        actualizarEtiquetaTiempo();
    };

    public Cronometro() {
        configurarBotones();
        mainLabel.setForeground(Color.BLACK);

        tiempo = new Timer(10, acciones);

        setContentPane(mainPanel);
        setResizable(false);
        setTitle("Cronometro Personalizado");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    private void configurarBotones() {
        btnIniciar.setBackground(Color.CYAN);
        btnPausar.setBackground(Color.GRAY);
        btnReiniciar.setBackground(Color.BLACK);
        btnIniciar.setForeground(Color.RED);
        btnPausar.setForeground(Color.YELLOW);
        btnReiniciar.setForeground(Color.GREEN);
        accionesBotones();
    }

    private void actualizarEtiquetaTiempo() {
        String texto = (horas <= 9 ? "0" : "") +
                horas + ":" + (minutos <= 9 ? "0" : "") +
                minutos + ":" + (segundos <= 9 ? "0" : "") +
                segundos + ":" + (centesimaSegundos <= 9 ? "0" : "") +
                centesimaSegundos;

        lblTiempo.setText(texto);
    }

    private void accionesBotones() {
        btnIniciar.addActionListener(e -> {
            tiempo.start();
            btnIniciar.setEnabled(false);
            btnIniciar.setText("Reanudar");
            btnPausar.setEnabled(true);
            btnReiniciar.setEnabled(true);
        });

        btnPausar.addActionListener(e -> {
            tiempo.stop();
            btnIniciar.setEnabled(true);
            btnPausar.setEnabled(false);
        });

        btnReiniciar.addActionListener(e -> {
            if(tiempo.isRunning()) {
                tiempo.stop();
                btnIniciar.setEnabled(true);
            }
            btnIniciar.setText("Iniciar");
            btnPausar.setEnabled(false);
            btnReiniciar.setEnabled(false);

            horas = 0;
            minutos = 0;
            segundos = 0;
            centesimaSegundos = 0;

            actualizarEtiquetaTiempo();
        });
    }

    public static void main(String[] args) {
        Cronometro cronometro = new Cronometro();
    }
}
