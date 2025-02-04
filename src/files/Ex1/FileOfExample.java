package files.Ex1;

import java.io.File;

public class FileOfExample {
    public static void main(String[] args) {
        File archivo = new File("C:\\Users\\galvi\\OneDrive\\Documentos\\Java Projects\\InterfacesGraficas\\src\\files\\Ex1\\file.txt");

        if (archivo.exists()) {
            System.out.println("El archivo si existe.");
        } else {
            System.out.println("El archivo no existe.");
        }
    }
}
