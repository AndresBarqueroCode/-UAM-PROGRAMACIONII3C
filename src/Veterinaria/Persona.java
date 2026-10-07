package Veterinaria;
/**
 * @author Andres Barquero Valverde
 * PROYECTO EN CLASE: VETERINARIA
 * Clase PERSONA
 */

public abstract class Persona {
    ///ATRIBUTOS
    protected String nombre;
    
    ///CONSTRUCTOR
    public Persona(String nombre) {    
        this.nombre = nombre;
    }
    ///COSNTRUCTOR ESPECIAL ATRIBUTOS POR -DEFAULT-
    public Persona() {
        this.nombre = "Sin Nombre";
    }
    
    ///GETTERS & SETTERS
    ///NOMBRE Persona
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    ///METODOS
}
