package igraphic.ex2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaEx extends JFrame {
    private JPanel jPanel;
    private JLabel jLabel;
    private JTextField jTextField;
    private JButton jButton1;
    
    public VentanaEx() {
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
        JLabel etiqueta = new JLabel("Ingrese su nombre: ");
        etiqueta.setBounds(30,10,200,30);
        etiqueta.setFont(new Font("cooper black", Font.PLAIN, 20));
        jPanel.add(etiqueta);
    }

    private void colocarCajaDeTexto() {
        jTextField = new JTextField();
        jTextField.setBounds(30,50,300,30);
        jPanel.add(jTextField);
    }

    private void colocarBoton() {
        jButton1 = new JButton();
        jButton1.setText("¡Pulsa Aquí!");
        jButton1.setBounds(150,100,150,40);
        jButton1.setFont(new Font("arial", Font.PLAIN, 15));
        jPanel.add(jButton1);

        jLabel = new JLabel();
        jLabel.setBounds(50,200,300,40);
        jLabel.setFont(new Font("arial", Font.BOLD, 15));
        jPanel.add(jLabel);

        eventoOyenteDeAccion();
    }

    private void eventoOyenteDeAccion() {
        ActionListener actionListener = e -> jLabel.setText("Hola " + jTextField.getText());

        jButton1.addActionListener(actionListener);
    }

}
