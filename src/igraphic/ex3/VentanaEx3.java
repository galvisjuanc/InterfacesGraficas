package igraphic.ex3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class VentanaEx3 extends JFrame {
    private JPanel jPanel;
    private JTextArea jTextArea;
    private JButton jButton1;

    public VentanaEx3() {
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

        eventoOyenteDeRaton();
    }

    private void eventoOyenteDeRaton() {
        MouseListener mouseListener = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                jTextArea.append("mouseClicked\n");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        };

        jButton1.addMouseListener(mouseListener);
    }

}
