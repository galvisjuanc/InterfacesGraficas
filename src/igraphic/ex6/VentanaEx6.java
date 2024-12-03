package igraphic.ex6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class VentanaEx6 extends JFrame {

    private JPanel jPanel;
    private JTextArea jTextArea;
    private JTextField jTextField;

    public VentanaEx6() {
        setBounds(50,50,600,600);
        setTitle("Eventos del Mouse Listener - Mouse Motion");
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {
        colocarPanel();
        colocarAreaTexto();
        colocarCajaDeTexto();
    }

    private void colocarPanel() {
        jPanel = new JPanel();
        jPanel.setLayout(null);
        this.add(jPanel);
    }

    private void colocarAreaTexto() {
        jTextArea = new JTextArea();
        jTextArea.setBounds(230,30,200,300);
        jPanel.add(jTextArea);

        JScrollPane jScrollPane = new JScrollPane(jTextArea, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jScrollPane.setBounds(230, 30, 200, 300);
        jPanel.add(jScrollPane);
    }

    private void colocarCajaDeTexto() {
        jTextField = new JTextField();
        jTextField.setBounds(20,30,150,30);
        jPanel.add(jTextField);

        eventosDelTeclado();
    }

    private void eventosDelTeclado() {
        KeyListener keyListener = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                jTextArea.append("keyPressed: " + e.getKeyChar() + "\n");
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        };

        jTextField.addKeyListener(keyListener);
    }
}
