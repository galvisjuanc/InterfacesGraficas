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
        //colocarBotones();
        //colocarRadioBotones();
        //colocarBotonesDeActivación();
        colocarCajasDeTexto();
    }


    private void colocarPaneles () {
        jPanel = new JPanel();

        jPanel.setBackground(Color.WHITE);
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
        jButton.setBounds(100, 100, 200, 70);

        jButton.setForeground(Color.RED);
        jButton.setFont(new Font("Cooper Black", Font.PLAIN, 30));
        jPanel.add(jButton);

        JButton imagejButton = new JButton();
        imagejButton.setBounds(100, 200, 200, 70);
        ImageIcon clicAqui = new ImageIcon("button.png");
        imagejButton.setIcon(new ImageIcon(clicAqui.getImage().getScaledInstance(imagejButton.getWidth(), imagejButton.getHeight(), Image.SCALE_SMOOTH)));
        jPanel.add(imagejButton);

        JButton borderjButton = new JButton();
        borderjButton.setBounds(100, 300, 110, 50);
        borderjButton.setBorder(BorderFactory.createLineBorder(Color.RED, 4, true));
        jPanel.add(borderjButton);
    }

    private void colocarRadioBotones() {
        JRadioButton jRadioButton1 = new JRadioButton("Opcion 1", true);
        jRadioButton1.setBounds(50,100,200,50);
        jRadioButton1.setEnabled(false);
        jRadioButton1.setText("Programa 1");
        jRadioButton1.setFont(new Font("Cooper Black", Font.PLAIN, 20));
        jPanel.add(jRadioButton1);

        JRadioButton jRadioButton2 = new JRadioButton("Opcion 2", false);
        jRadioButton2.setBounds(50,150,100,50);
        jPanel.add(jRadioButton2);

        JRadioButton jRadioButton3 = new JRadioButton("Opcion 3", false);
        jRadioButton3.setBounds(50,200,100,50);
        jPanel.add(jRadioButton3);

        ButtonGroup group = new ButtonGroup();
        group.add(jRadioButton1);
        group.add(jRadioButton2);
        group.add(jRadioButton3);
    }

    private void colocarBotonesDeActivación() {
        JToggleButton jToggleButton1 = new JToggleButton("Opcion 1", true);
        jToggleButton1.setBounds(50,100,100,30);
        jPanel.add(jToggleButton1);

        JToggleButton jToggleButton2 = new JToggleButton("Opcion 2", false);
        jToggleButton2.setBounds(50,150,100,30);
        jPanel.add(jToggleButton2);

        JToggleButton jToggleButton3 = new JToggleButton("Opcion 3", false);
        jToggleButton3.setBounds(50,200,100,30);
        jPanel.add(jToggleButton3);

        ButtonGroup group = new ButtonGroup();
        group.add(jToggleButton1);
        group.add(jToggleButton2);
        group.add(jToggleButton3);
    }

    private void colocarCajasDeTexto() {
        JTextField jTextField = new JTextField();
        jTextField.setBounds(50,50,200, 40);
        jTextField.setText("Hola...");
        System.out.println("Text en la caja: " + jTextField.getText());
        jPanel.add(jTextField);
    }
}
