package igraphic.ex15;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgendaContactos extends JFrame{
    private JToolBar jToolBar;
    private JLabel lbTitle;
    private JLabel lbnNombre;
    private JTextField textFieldName;
    private JButton btnGuardar;
    private JTextField textFieldCorreo;
    private JTextField textFieldCelular;
    private JPanel mainPanel;
    private JMenu jMenu;

    public AgendaContactos() {
        jMenu = new JMenu("File");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        jMenu.add(openItem);
        jMenu.add(saveItem);
        jToolBar.add(jMenu);

        JMenu editMenu = new JMenu("Edit");
        jToolBar.add(editMenu);

        accionesBoton();

        setContentPane(mainPanel);
        setTitle("Agenda de Contactos");
        setLocationRelativeTo(null);
        setBounds(50,50,600,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    private void accionesBoton() {
        btnGuardar.addActionListener(e -> {
            Archivo archivo = new Archivo();
            archivo.crearArchivo();

            String nombre = textFieldName.getText();
            String correo = textFieldCorreo.getText();
            String celular = textFieldCelular.getText();

            Persona persona = new Persona(nombre, correo, celular);

            archivo.escribirTexto(persona);

            textFieldName.setText("");
            textFieldCorreo.setText("");
            textFieldCelular.setText("");

        });
    }

    public static void main(String[] args) {
        AgendaContactos agendaContactos = new AgendaContactos();
    }
}
