package igraphic.ex8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class VentanaEx8 extends JFrame {

    private JPanel panel;
    private JLabel jLabel, imagen;
    private JRadioButton rb1, rb2, rb3, rb4;

    public VentanaEx8() {
        setSize(900,900);
        setTitle("Selección del deporte favorito");
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
        jLabel = new JLabel();
        jLabel.setBounds(20,10,300,40);
        jLabel.setText("Escoja su deporte favorito");
        jLabel.setFont(new Font("arial",Font.BOLD,20));
        panel.add(jLabel);
    }

    private void colocarRadioBotones() {
        rb1 = new JRadioButton("Fútbol");
        rb1.setBounds(20, 80,150,40);
        rb1.setFont(new Font("arial",Font.BOLD,20));
        panel.add(rb1);

        rb2 = new JRadioButton("KungFu");
        rb2.setBounds(20, 140,150,40);
        rb2.setFont(new Font("arial",Font.BOLD,20));
        panel.add(rb2);

        rb3 = new JRadioButton("Natacion");
        rb3.setBounds(20, 200,150,40);
        rb3.setFont(new Font("arial",Font.BOLD,20));
        panel.add(rb3);

        rb4 = new JRadioButton("TenisDeMesa");
        rb4.setBounds(20, 260,150,40);
        rb4.setFont(new Font("arial",Font.BOLD,20));
        panel.add(rb4);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        bg.add(rb4);

        eventoDeAccion();
    }

    private void eventoDeAccion() {
        imagen = new JLabel();
        imagen.setBounds(220,80,600,600);
        imagen.setBackground(Color.RED);
        panel.add(imagen);

        final ImageIcon image1 = new ImageIcon("src/igraphic/ex8/Imagenes/Futbol.jpg");
        final ImageIcon image2 = new ImageIcon("src/igraphic/ex8/Imagenes/KungFu.jpg");
        final ImageIcon image3 = new ImageIcon("src/igraphic/ex8/Imagenes/Natacion.jpg");
        final ImageIcon image4 = new ImageIcon("src/igraphic/ex8/Imagenes/TenisDeMesa.jpg");

        imagenElegida(image1, image2, rb1, rb2);
        imagenElegida(image3, image4, rb3, rb4);
    }

    private void imagenElegida(ImageIcon image1, ImageIcon image2, JRadioButton rb1, JRadioButton rb2) {
        ActionListener eventoAccionA = e -> imagen.setIcon(new ImageIcon(image1.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
        rb1.addActionListener(eventoAccionA);

        ActionListener eventoAccionB = e -> imagen.setIcon(new ImageIcon(image2.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
        rb2.addActionListener(eventoAccionB);
    }
}
