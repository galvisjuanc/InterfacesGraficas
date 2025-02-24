package files.Ex3;

import java.io.Serializable;

public class PersonBin implements Serializable {
    private String nombre;
    private int edad;

    public PersonBin(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}
