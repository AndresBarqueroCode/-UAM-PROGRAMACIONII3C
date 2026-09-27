package Veterinaria;
/**
 *
 * @author Andres Barquero Valverde
 * PROYECTO EN CLASE: VETERINARIA
 * Clase MASCOTA
 */
public class Cliente {
    ///ATRIBUTOS
    String nombre;
    String identificacion;
    String telefono;
    
    
    ///CONSTRUCTOR
    public Cliente(String identificacion,String nombre,String telefono) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.telefono = telefono;
    }
    
    ///GETTERS & SETTERS
    public String getNombre(){ return nombre;}
    public void setNombre(String nombre){ this.nombre = nombre;}
    public String getIdentificacion(){ return identificacion;}
    public void setIdentificacion(String identificacion){ this.identificacion = identificacion;}
    public String getTelefono() { return telefono;}
    public void setTelefono(String telefono) { this.telefono = telefono;}
       
}
