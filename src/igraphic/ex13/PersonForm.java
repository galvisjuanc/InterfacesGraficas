package igraphic.ex13;

import igraphic.ex13.model.SinglePerson;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableColumnModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

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
    private DefaultTableModel modeloTabla = new DefaultTableModel(new String[] {"Nombres", "Apellidos", "Email", "Celular", "Dirección"}, 0);

    private JLabel lbDireccion;
    private JScrollPane jScrollPaneTable;

    public PersonForm() {
        comboBox1.setModel(model);
        llenarModeloComboBox();
        agregarModeloTabla();

        accionBotones();

        setContentPane(mainPanel);
        setTitle("PersonForm");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
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
        tablaPersonas.setModel(modeloTabla);
        ListSelectionListener oyenteSeleccion= e -> {
            if(e.getValueIsAdjusting()) {
                int filaSeleccionada = tablaPersonas.getSelectedRow();

                String nombre = (String) modeloTabla.getValueAt(filaSeleccionada, 0);
                String apellidos = (String) modeloTabla.getValueAt(filaSeleccionada, 1);
                String email = (String) modeloTabla.getValueAt(filaSeleccionada, 2);
                String celular = (String) modeloTabla.getValueAt(filaSeleccionada, 3);
                String direccion = (String) modeloTabla.getValueAt(filaSeleccionada, 4);

                txfdNombre.setText(nombre);
                txfdApellidos.setText(apellidos);
                txfdEmail.setText(email);
                txfdCelular.setText(celular);
                txfdDireccion.setText(direccion);
            }
        };

        tablaPersonas.getSelectionModel().addListSelectionListener(oyenteSeleccion);
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
