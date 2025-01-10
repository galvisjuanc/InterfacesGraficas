package igraphic.ex10;

import javax.swing.*;
import javax.swing.table.TableColumn;

public class VentanaEx10 extends JFrame {
    private JPanel panel;
    private JLabel etiquetaTitulo;
    private JComboBox comboPersonas;
    private JButton insertarPersonaButton;
    private JTable tablaPersonas;

    public VentanaEx10() {
        createUIComponents();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here

    }

    public static void main(String[] args) {
        VentanaEx10 ventana = new VentanaEx10();
        ventana.setVisible(true);
    }
}
