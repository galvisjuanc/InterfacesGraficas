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
        //colocarCajasDeTexto();
        //colocarAreasDeTexto();
        //colocarCasillasDeVerificacion();
        colocarListasDesplegables();
    }


    private void colocarPaneles () {
        jPanel = new JPanel();

        jPanel.setBackground(Color.GRAY);
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

    private void colocarAreasDeTexto() {
        JTextArea jTextArea = new JTextArea();
        jTextArea.setBounds(20, 20, 300, 200);
        jTextArea.setText("Escriba el texto aquí: ");
        jTextArea.append(" \nEscribe por aquí...");
        jTextArea.setEditable(true);
        jPanel.add(jTextArea);

        JScrollPane jScrollPane = new JScrollPane(jTextArea, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jScrollPane.setBounds(20, 20, 300, 200);
        //jScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        //jScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jPanel.add(jScrollPane);
    }

    private void colocarCasillasDeVerificacion() {
        JCheckBox jCheckBox = new JCheckBox("Leche");
        jCheckBox.setBounds(20, 20, 100, 40);
        jPanel.add(jCheckBox);

        JCheckBox jCheckBox1 = new JCheckBox("Galletas");
        jCheckBox1.setBounds(20, 50, 100, 40);
        jPanel.add(jCheckBox1);

        JCheckBox jCheckBox2 = new JCheckBox("Yogurt");
        jCheckBox2.setBounds(20, 80, 100, 40);
        jPanel.add(jCheckBox2);

        JCheckBox jCheckBox3 = new JCheckBox("Cereal");
        jCheckBox3.setBounds(20, 110, 100, 40);
        jPanel.add(jCheckBox3);
    }

    private void colocarListasDesplegables() {
        String [] paises = {"Colombia", "Corea del Sur", "Francia", "Japon"};

        JComboBox jComboBox = new JComboBox(paises);
        jComboBox.setBounds(20,20,100,30);

        jComboBox.addItem("Paises Bajos");
        jComboBox.setSelectedItem("Estados Unidos");
        jPanel.add(jComboBox);
    }
}
