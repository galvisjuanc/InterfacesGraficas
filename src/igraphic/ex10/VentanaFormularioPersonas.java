package igraphic.ex10;

import javax.swing.*;

public class VentanaFormularioPersonas {
    private JPanel mainPanel;
    private JPanel firstPanel;
    private JLabel etiquetaTitulo;

    public VentanaFormularioPersonas() {
        mainPanel = new JPanel();
        firstPanel = new JPanel();
        mainPanel.setSize(600,600);
        firstPanel.setSize(600,50);

        iniciarComponentes();
    }

    private void iniciarComponentes() {
        colocarMainPanel();
    }

    private void colocarMainPanel() {
        mainPanel.setLayout(null);
    }

    public static void main(String[] args) {

    }
}
