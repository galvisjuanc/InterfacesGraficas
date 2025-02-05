package files.Ex2;

import java.io.File;
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

    public static void main(String[] args) {
        ArchivosDeTexto arch = new ArchivosDeTexto();
        arch.crearArchivo();
    }
}
