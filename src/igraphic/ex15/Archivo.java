package igraphic.ex15;

import java.io.File;
import java.io.FileWriter;
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
        try (FileWriter escribir = new FileWriter(archivo, true)){
            escribir.write(persona.getNombre() + " % " + persona.getCorreo() + " % " + persona.getCelular() + "\r\n");
        } catch (IOException e) {
            System.err.println("No se pudo escribir el archivo. Error: " + e.getMessage());
        }
    }
}
