package files.Ex1;

import java.io.File;

public class FileOfExample {
    public static void main(String[] args) {
        File archivo = new File("file.txt");

        if (archivo.exists()) {
            System.out.println("El archivo si existe.");
            System.out.println(archivo.getAbsolutePath());
            System.out.println("¿Es un archivo? --> " + archivo.isFile());
            System.out.println("¿Se puede leer? --> " + archivo.canRead());
        } else {
            System.out.println("El archivo no existe.");
        }

        File directorio = new File ("carpeta.txt");

        if (directorio.exists()) {
            System.out.println("El directorio si existe.");
            System.out.println(directorio.getAbsolutePath());
            System.out.println("¿Es un directorio? --> " + directorio.canRead());
            System.out.println("¿Se puede leer? --> " + directorio.canRead());
        } else {
            System.out.println("El directorio no existe.");
        }
    }
}
