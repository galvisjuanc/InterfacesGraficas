package igraphic.ex1;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    public Ventana() {
        this.setTitle("Test Title");
        //this.setBounds(200, 200, 600, 600);
        //this.setLocation(100,200);
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setResizable(true);
        this.setMinimumSize(new Dimension(200,200));

        iniciarComponentes();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {
        JPanel jPanel = new JPanel();

        jPanel.setBackground(Color.YELLOW);
        jPanel.setLayout(null);
        this.getContentPane().add(jPanel);

        JLabel jLabel = new JLabel();
        jLabel.setText("Hello World");
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel.setBounds(20,20,400,50);
        jLabel.setOpaque(true);
        jLabel.setForeground(Color.RED);
        jLabel.setBackground(Color.WHITE);

        jLabel.setFont(new Font("Arial", Font.PLAIN, 30));
        jPanel.add(jLabel);
    }
}
