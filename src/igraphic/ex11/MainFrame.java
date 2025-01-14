package igraphic.ex11;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JPanel mainPanel;
    private JTextField tfFirstName;
    private JTextField tfLastName;
    private JButton btnOK;
    private JButton btnClear;
    private JLabel lbWelcome;

    public MainFrame() {
        setContentPane(mainPanel);
        setTitle("Welcome");
        setSize(450,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        buttonEvents();
    }

    private void buttonEvents() {
        btnOK.addActionListener(e -> {
            String firstName = tfFirstName.getText();
            String lastName = tfLastName.getText();
            lbWelcome.setText("Welcome " + firstName + " " + lastName);
        });

        btnClear.addActionListener(e -> {
            tfFirstName.setText("");
            tfLastName.setText("");
            lbWelcome.setText("");
        });
    }

    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
    }
}
