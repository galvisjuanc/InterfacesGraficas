package files.Ex2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivosDeTexto {
    File archivo;

    private void crearArchivo() {
        archivo = new File("ArchivosDeTexto.txt");

        try{
            if(archivo.createNewFile()) {
                System.out.println("El archivo se creó correctamente");
            }
        } catch (IOException e) {
            System.err.println("No se pudo crear el archivo");
        }
    }

    private void crearCarpeta() {
        archivo = new File("CarpetaPrueba");

        if(archivo.mkdir()) {
            System.out.println("Se ha creado la carpeta correctamente");
        } else {
            System.err.println("Error, no se ha podido crear la carpeta");
        }
    }

    private void escribirArchivo() {
        try{
            FileWriter escribir = new FileWriter(archivo);
            escribir.write("Hola Mundo");
            escribir.close();
        } catch (IOException e) {
            System.err.println("Error, no se pudo escribir sobre el archivo");
        }
    }

    private void añadirTexto() {
        try {
            FileWriter escribir = new FileWriter(archivo, true);
            escribir.write("\r\nMás mensajes");
            escribir.write("\r\nMás información");
            escribir.close();
        } catch (IOException e) {

        }
    }

    public static void main(String[] args) {
        ArchivosDeTexto arch = new ArchivosDeTexto();
        arch.crearArchivo();
        // arch.crearCarpeta();
        // arch.escribirArchivo();
        arch.añadirTexto();
    }
}
