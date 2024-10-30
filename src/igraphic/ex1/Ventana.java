package igraphic.ex1;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    public JPanel jPanel;

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
        colocarPaneles();
        //colocarEtiquetas();
        colocarBotones();
    }

    private void colocarPaneles () {
        jPanel = new JPanel();

        jPanel.setBackground(Color.YELLOW);
        jPanel.setLayout(null);
        this.getContentPane().add(jPanel);
    }

    private void colocarEtiquetas() {
        JLabel jLabel = new JLabel();

        jLabel.setText("Mundial 2022");
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel.setBounds(85,10,300,100);
        jLabel.setOpaque(true);
        jLabel.setForeground(Color.BLACK);
        jLabel.setBackground(Color.WHITE);
        jLabel.setFont(new Font("Cooper Black", Font.PLAIN, 30));
        jPanel.add(jLabel);

        ImageIcon icon = new ImageIcon("balon.jpg");
        JLabel jImage = new JLabel(icon);
        jImage.setBounds(10,80, 450, 450);
        jImage.setIcon(new ImageIcon(icon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
        jPanel.add(jImage);
    }

    private void colocarBotones() {
        JButton jButton = new JButton();

        jButton.setText("Click");
        jButton.setEnabled(true);
        jButton.setMnemonic('a');
        jButton.setBounds(100, 100, 200, 40);

        jButton.setForeground(Color.RED);
        jButton.setFont(new Font("Cooper Black", Font.PLAIN, 30));
        jPanel.add(jButton);
    }
}
