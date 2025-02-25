package files.Ex3;

import java.io.Serializable;

public class PersonBin implements Serializable {
    private String nombre;
    private int edad;

    public PersonBin(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("");
    }
}
