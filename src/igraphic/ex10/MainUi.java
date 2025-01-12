package igraphic.ex10;

import javax.swing.*;
import java.awt.*;

public class MainUi extends JFrame {
    private JLabel label1;
    private JButton clickMeButton;
    private JPanel mainPanel;
    private JTextArea textArea1;

    public MainUi() {
        setContentPane(mainPanel);
        setTitle("Simple GUI App");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(200, 200);
        setLocationRelativeTo(null);
        setVisible(true);
        initComponents();
    }

    public static void main(String[] args) {
        new MainUi();
    }

    private void initComponents() {
        initButton();
    }

    private void initButton() {
        clickMeButton.setForeground(Color.RED);
        clickMeButton.setBounds(20,30,50,50);
        clickMeButton.addActionListener(e -> {
            String firstName = textArea1.getText();
            JOptionPane.showMessageDialog(MainUi.this, "Hello " + firstName + " !");
        });
    }
}
