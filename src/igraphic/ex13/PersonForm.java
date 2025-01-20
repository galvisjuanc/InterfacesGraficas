package igraphic.ex13;

import javax.swing.*;

public class PersonForm {
    private JPanel mainPanel;
    private JLabel lbPersona;
    private JComboBox comboBox1;
    private JButton btnInsertar;
    private JTable table1;
    private JLabel lbDatosPersona;
    private JTextField txfdNombre;
    private JTextField txfdApellidos;
    private JLabel lbNombre;
    private JLabel lbApellido;
    private JTextField txfdEmail;
    private JTextField txfdCelular;
    private JTextField txfdDireccion;
    private JLabel lbEmail;
    private JLabel lbCelular;
    private JLabel lbDireccion;

    public static void main(String[] args) {
        JFrame frame = new JFrame("PersonForm");
        frame.setContentPane(new PersonForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
