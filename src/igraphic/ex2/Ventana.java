package igraphic.ex2;

import javax.swing.*;

public class Ventana extends JFrame {
    private JPanel jPanel;
    private JLabel jLabel;
    private JTextField jTextField;
    private JButton jButton1;
    
    public Ventana () {
        setBounds(50,50,500, 500);
        setTitle("Eventos");
        
        iniciarComponentes();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {
        colocarPanel();
        colocarEtiqueta();
        colocarCajaDeTexto();
        colocarBoton();
    }

    private void colocarPanel() {
    }

    private void colocarEtiqueta() {
    }

    private void colocarCajaDeTexto() {
    }

    private void colocarBoton() {
    }

}
