package igraphic.ex9;

import javax.swing.*;
import java.awt.*;

public class VentanaEx9 extends JFrame {

    private JPanel panel;
    private JLabel label;
    private JButton botonRojo, botonVerde, botonAzul;

    public VentanaEx9() {
        setSize(600,400);
        setTitle("Colores de Ventana");
        setLocationRelativeTo(null);

        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {
        colocarPanel();
        colocarEtiqueta();
        colocarBotones();
    }

    private void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }

    private void colocarEtiqueta() {
        label = new JLabel("Color (Rojo, Verde, Azul)");
        label.setBounds(100, 30, 400, 50);
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(label);
    }

    private void colocarBotones() {
        botonRojo = new JButton("Rojo");
        botonRojo.setBounds(50, 230, 130, 50);
        botonRojo.setForeground(Color.RED);
        botonRojo.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(botonRojo);

        botonVerde = new JButton("Verde");
        botonVerde.setBounds(230, 230, 130, 50);
        botonVerde.setForeground(Color.GREEN);
        botonVerde.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(botonVerde);

        botonAzul = new JButton("Azul");
        botonAzul.setBounds(410, 230, 130, 50);
        botonAzul.setForeground(Color.BLUE);
        botonAzul.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(botonAzul);
    }
}
