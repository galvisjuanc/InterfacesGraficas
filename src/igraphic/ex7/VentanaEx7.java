package igraphic.ex7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class VentanaEx7 extends JFrame {

    private JPanel panel;
    private JLabel label;
    private JButton button;
    private int contador;

    public VentanaEx7() {
        setBounds(50,50,400,400);
        setTitle("Contabilizador de Clics - Ejercicio 1");
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    void iniciarComponentes() {
        colocarPanel();
        colocarLabel();
        colocarButton();
    }

    private void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }

    private void colocarLabel() {
        label = new JLabel();
        label.setBounds(120,100,180,40);
        label.setText("Pulsa el botón");
        label.setFont(new Font("arial", Font.PLAIN, 20));
        panel.add(label);

    }

    private void colocarButton() {
        button = new JButton();
        button.setText("Pulsa aquí");
        button.setBounds(120,200,150,40);
        button.setFont(new Font("arial", Font.PLAIN, 15));
        panel.add(button);

        eventoClickMouse();
    }

    private void eventoClickMouse() {
        ActionListener listener = e -> {
            contador++;
            if (contador == 1) {
                label.setText("Pulsaste 1 vez");
            }
            else {
                label.setText("Pulsaste " + contador + " veces");
            }
        };

        button.addActionListener(listener);
    }
}
