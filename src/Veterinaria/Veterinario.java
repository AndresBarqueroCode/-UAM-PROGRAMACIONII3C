package Veterinaria;

/**
 * @author Andres Barquero Valverde
 * PROYECTO EN CLASE: VETERINARIA
 * Clase VETERINARIA
 */
public class Veterinario extends Persona {
    ///ATRIBUTOS 
    private String codigo;
    private String especialidad;
    
    ///CONSTRUCTORES 
    public Veterinario(String codigo, String especialidad, String nombre) {
        super(nombre);
        this.codigo = codigo;
        this.especialidad = especialidad;
    }
    
    ///GETTERS & SETTERS
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
}
