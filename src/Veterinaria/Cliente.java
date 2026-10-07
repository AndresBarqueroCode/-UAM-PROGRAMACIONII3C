package Veterinaria;
/**
 * @author Andres Barquero Valverde
 * PROYECTO EN CLASE: VETERINARIA
 * Clase CLIENTE
 */

public class Cliente extends Persona {
    ///ATRIBUTOS
    
    private String identificacion;
    private String telefono;
    
    
    ///CONSTRUCTOR
    public Cliente(String identificacion,String nombre,String telefono) {
        super(nombre);
        this.identificacion = identificacion;
        this.telefono = telefono;
    }
    
    ///GETTERS & SETTERS
    ///IDENTIFICACION Cliente
    public String getIdentificacion(){ 
        return identificacion;
    }
    public void setIdentificacion(String identificacion){ 
        if(identificacion == null || identificacion.trim().equals("")){
            System.out.println("La [IDENTIFICACION] no es valido.");
        }else{
            this.identificacion = identificacion;
        }
    }
    ///TELEFONO Cliente
    public String getTelefono() { 
        return telefono;
    }
    public void setTelefono(String telefono) {
        if(telefono == null || telefono.trim().equals("")){
            System.out.println("El [NUMERO DE TELEFONO] no es valido.");
        }else{
        this.telefono = telefono;
        }
    }
      
   ///METODOS
}
