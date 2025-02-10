package igraphic.ex15;

import java.io.File;
import java.io.IOException;

public class Archivo {
    private File archivo;

    public void crearArchivo() {
        archivo = new File("agendaContactos.txt");

        try {
            if(archivo.createNewFile()) {

            }
        } catch (IOException e) {
            System.err.println("No se pudo crear el archivo. Error: " + e.getMessage());
        }
    }

    public void escribirTexto(Persona persona) {

    }
}
