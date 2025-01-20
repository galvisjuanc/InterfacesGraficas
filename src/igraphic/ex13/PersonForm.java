package igraphic.ex13;

import igraphic.ex1.Persona;
import igraphic.ex13.model.SinglePerson;

import javax.swing.*;

public class PersonForm extends JFrame {
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

    private DefaultComboBoxModel model = new DefaultComboBoxModel();
    private JLabel lbDireccion;

    public PersonForm() {
        setContentPane(mainPanel);
        setTitle("PersonForm");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        llevarModeloComboBox();

        comboBox1.setModel(model);
    }

    public static void main(String[] args) {
        PersonForm pf = new PersonForm();
    }

    private void llevarModeloComboBox() {
        model.addElement(new SinglePerson("Juan", "Galvis", "galvisjuanc@gmail.com", "573002637896", "Calle falsa 123"));
        model.addElement(new SinglePerson("Cossette", "Sierra", "cossette.sierra@gmail.com", "573002631234", "Calle verdadera 123"));
        model.addElement(new SinglePerson("David", "Rodriguez", "ddrcuellar@gmail.com", "573124567896", "Transversal falsa 123"));
        model.addElement(new SinglePerson("Pablo", "Fernandez", "ddbarrera@gmail.com", "573212623245", "Transversal verdadera 123"));

    }
}
