package igraphic.ex1;

import javax.swing.*;

public class Ventana extends JFrame {

    public Ventana() {
        this.setTitle("Test Title");
        //this.setBounds(200, 200, 600, 600);
        //this.setLocation(100,200);
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
