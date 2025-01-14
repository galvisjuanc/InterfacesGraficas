package igraphic.ex11;

import javax.swing.*;

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
    }

    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
    }
}
