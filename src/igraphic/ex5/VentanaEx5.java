package igraphic.ex5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class VentanaEx5 extends JFrame {

    private JPanel jPanel;
    private JTextArea jTextArea;
    private JButton jButton1;

    public VentanaEx5() {
        setBounds(50,50,600,600);
        setTitle("Eventos del Mouse Listener - Mouse Motion");
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

        eventoRuedaMovimientoRaton();
    }

    private void colocarAreaTexto() {
        jTextArea = new JTextArea();
        jTextArea.setBounds(20,20,200,300);
        jPanel.add(jTextArea);

        JScrollPane jScrollPane = new JScrollPane(jTextArea, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jScrollPane.setBounds(20, 20, 200, 300);
        jPanel.add(jScrollPane);
    }

    private void colocarBoton() {
        jButton1 = new JButton();
        jButton1.setText("¡Pulsa aquí!");
        jButton1.setBounds(150,350,150,40);
        jButton1.setFont(new Font("Arial", Font.PLAIN, 15));
        jPanel.add(jButton1);


    }

    private void eventoRuedaMovimientoRaton() {
        MouseWheelListener mouseWheelListener = new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                if (e.getPreciseWheelRotation() == -1) {
                    jTextArea.append("rueda va arriba\n");
                }
                if (e.getPreciseWheelRotation() == 1) {
                    jTextArea.append("rueda va abajo\n");
                }
            }
        };
        jPanel.addMouseWheelListener(mouseWheelListener);
    }
}
