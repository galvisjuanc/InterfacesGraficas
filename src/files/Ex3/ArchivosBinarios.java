package files.Ex3;

import java.io.*;

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

    private void leerBinario() {

        PersonBin personBin;
        try (FileInputStream archivo = new FileInputStream("personas.bin")) {
            ObjectInputStream lectura = new ObjectInputStream(archivo);

            while(true) {
                personBin = (PersonBin) lectura.readObject();
            }
        } catch (IOException e) {
            System.err.println("No se pudo leer el archivo. Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        ArchivosBinarios archivosBinarios = new ArchivosBinarios();

        archivosBinarios.escribirBinario();
    }
}
