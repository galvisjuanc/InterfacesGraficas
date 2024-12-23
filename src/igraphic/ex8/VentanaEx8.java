package igraphic.ex8;

import javax.swing.*;

public class VentanaEx8 extends JFrame {

    private JPanel panel;
    private JLabel label;
    private JRadioButton radioButton;
    private ImageIcon icon;

    public VentanaEx8() {
        setBounds(50,50,600,600);
        setTitle("Selección del Deporte favorito");
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {
        colocarPanel();
    }

    private void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }
}
