package files.Ex3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ArchivosBinarios {

    private void escribirBinario() throws FileNotFoundException {
        try (FileOutputStream archivo = new FileOutputStream("personas.bin")) {
            ObjectOutputStream escritura = new ObjectOutputStream(archivo);

            PersonBin personBin1 = new PersonBin("Juan", 32);
            PersonBin personBin2 = new PersonBin("Cossette", 34);
            PersonBin personBin3 = new PersonBin("María José", 17);

            escritura.writeObject(personBin1);
            escritura.writeObject(personBin2);
            escritura.writeObject(personBin3);

            escritura.close();

        } catch (IOException e) {
            System.err.println("No se pudo escribir el archivo. Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        ArchivosBinarios archivosBinarios = new ArchivosBinarios();

        archivosBinarios.escribirBinario();
    }
}
