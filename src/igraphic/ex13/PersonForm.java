package igraphic.ex13;

import igraphic.ex13.model.SinglePerson;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PersonForm extends JFrame {
    private JPanel mainPanel;
    private JLabel lbPersona;
    private JComboBox comboBox1;
    private JButton btnInsertar;
    private JTable tablaPersonas;
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

    private DefaultComboBoxModel<SinglePerson> model = new DefaultComboBoxModel<>();
    private DefaultTableModel modeloTabla = new DefaultTableModel();

    private JLabel lbDireccion;

    public PersonForm() {
        comboBox1.setModel(model);
        agregarModeloTabla();
        tablaPersonas.setModel(modeloTabla);
        llenarModeloComboBox();

        accionBotones();
        setContentPane(mainPanel);
        setTitle("PersonForm");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);

    }

    private void llenarModeloComboBox() {
        model.addElement(new SinglePerson("Juan", "Galvis", "galvisjuanc@gmail.com", "573002637896", "Calle falsa 123"));
        model.addElement(new SinglePerson("Cossette", "Sierra", "cossette.sierra@gmail.com", "573002631234", "Calle verdadera 123"));
        model.addElement(new SinglePerson("David", "Rodriguez", "ddrcuellar@gmail.com", "573124567896", "Transversal falsa 123"));
        model.addElement(new SinglePerson("Pablo", "Fernandez", "ddbarrera@gmail.com", "573212623245", "Transversal verdadera 123"));

    }

    private void agregarModeloTabla() {
        modeloTabla.addColumn("Nombres");
        modeloTabla.addColumn("Apellidos");
        modeloTabla.addColumn("Email");
        modeloTabla.addColumn("Celular");
        modeloTabla.addColumn("Direccion");
    }

    private void accionBotones() {
        btnInsertar.addActionListener(e -> {
            SinglePerson singlePerson = (SinglePerson) comboBox1.getSelectedItem();

            String nombres = singlePerson.getNombre();
            String apellidos = singlePerson.getApellidos();
            String email = singlePerson.getEmail();
            String celular = singlePerson.getCelular();
            String direccion = singlePerson.getDireccion();

            String [] persona = {nombres, apellidos, email, celular, direccion};
            modeloTabla.addRow(persona);
        });
    }

    public static void main(String[] args) {
        PersonForm pf = new PersonForm();
    }
}
