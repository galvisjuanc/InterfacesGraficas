package igraphic.ex9;

import javax.swing.*;

public class VentanaEx9 extends JFrame {
    public VentanaEx9() {
        setSize(600,400);
        setTitle("Colores de Ventana");
        setLocationRelativeTo(null);

        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {
        colocarPanel();
    }

    private void colocarPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }
}
