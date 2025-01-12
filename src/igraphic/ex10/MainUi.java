package igraphic.ex10;

import javax.swing.*;

public class MainUi extends JFrame {
    public MainUi() {
        setTitle("Simple GUI App");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainUi();
    }
}
