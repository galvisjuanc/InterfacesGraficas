package igraphic.ex4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class VentanaEx4 extends JFrame {

    private JPanel jPanel;
    private JTextArea jTextArea;
    private JButton jButton1;

    public VentanaEx4() {
        setBounds(50,50,600,600);
        setTitle("Eventos del Mouse Listener");
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {
        colocarPanel();
        colocarAreaTexto();
        colocarBoton();
    }

    private void colocarPanel() {
        jPanel = new JPanel();
        jPanel.setLayout(null);
        this.add(jPanel);

        eventoDeMovimientoRaton();
    }

    private void colocarAreaTexto() {
        jTextArea = new JTextArea();
        jTextArea.setBounds(20,20,200,300);
        jPanel.add(jTextArea);
    }

    private void colocarBoton() {
        jButton1 = new JButton();
        jButton1.setText("¡Pulsa aquí!");
        jButton1.setBounds(150,350,150,40);
        jButton1.setFont(new Font("Arial", Font.PLAIN, 15));
        jPanel.add(jButton1);


    }

    private void eventoDeMovimientoRaton() {


    }

}
