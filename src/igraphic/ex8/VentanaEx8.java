package igraphic.ex8;

import javax.swing.*;
import java.awt.*;

public class VentanaEx8 extends JFrame {

    private JPanel panel;
    private JLabel label;
    private JRadioButton rb1, rb2, rb3, rb4;

    public VentanaEx8() {
        setBounds(50,50,600,600);
        setTitle("Selección del Deporte favorito");
        setLocationRelativeTo(null);
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {
        colocarPanel();
        colocarLabel();
        colocarRadioBotones();
    }

    private void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }

    private void colocarLabel() {
        label = new JLabel();
        label.setBounds(20,10,300,40);
        label.setText("Escoja su deporte favorito");
        label.setFont(new Font("arial",Font.BOLD,20));
        panel.add(label);
    }

    private void colocarRadioBotones() {
        rb1 = new JRadioButton("Fútbol");
        rb1.setBounds(20, 80,150,40);
        rb1.setFont(new Font("arial",Font.BOLD,20));
        panel.add(rb1);
    }
}
