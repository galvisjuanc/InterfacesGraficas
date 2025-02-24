package files.Ex3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ArchivosBinarios {

    private void escribirBinario() throws FileNotFoundException {
        try (FileOutputStream archivo = new FileOutputStream("personas.bin")) {
            ObjectOutputStream escritura = new ObjectOutputStream(archivo);

        } catch (IOException e) {
            System.err.println("No se pudo escribir el archivo. Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

    }
}
