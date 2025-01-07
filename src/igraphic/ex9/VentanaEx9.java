package igraphic.ex9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class VentanaEx9 extends JFrame {

    private JPanel panel;
    private JLabel label;
    private JButton botonRojo, botonVerde, botonAzul;
    private int pulsado = 0;

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

        eventoDeRuedaRaton();
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
        botonRojo.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(botonRojo);

        botonRojo.addActionListener(e -> pulsado = 1);

        botonVerde = new JButton("Verde");
        botonVerde.setBounds(230, 230, 130, 50);
        botonVerde.setForeground(Color.GREEN);
        botonVerde.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(botonVerde);

        botonVerde.addActionListener(e -> pulsado = 2);

        botonAzul = new JButton("Azul");
        botonAzul.setBounds(410, 230, 130, 50);
        botonAzul.setForeground(Color.BLUE);
        botonAzul.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(botonAzul);

        botonAzul.addActionListener(e -> pulsado = 3);


    }

    private void eventoDeRuedaRaton() {
        MouseWheelListener eventoRueda = new MouseWheelListener() {

            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {

            }
        };

        panel.addMouseWheelListener(eventoRueda);
    }
}
