package igraphic.ex2;

import javax.swing.*;
import java.awt.*;

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
        jPanel = new JPanel();
        jPanel.setLayout(null);
        this.add(jPanel);
    }

    private void colocarEtiqueta() {
        jLabel = new JLabel();
        jLabel.setText("Ingrese su nombre: ");
        jLabel.setBounds(30,10,200,30);
        jLabel.setFont(new Font("cooper black", Font.PLAIN, 30));
        jPanel.add(jLabel);
    }

    private void colocarCajaDeTexto() {
        jTextField = new JTextField();
        jTextField.setBounds(30,50,300,30);
        jPanel.add(jTextField);
    }

    private void colocarBoton() {
    }

}
