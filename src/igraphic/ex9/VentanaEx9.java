package igraphic.ex9;

import javax.swing.*;
import java.awt.*;

public class VentanaEx9 extends JFrame {

    private JPanel panel;
    private JLabel label;

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
}
