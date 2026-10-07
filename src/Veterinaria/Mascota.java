package Veterinaria;
/**
 * @author Andres Barquero Valverde
 * PROYECTO EN CLASE: VETERINARIA
 * Clase MASCOTA
 */

public class Mascota {
    ///ATRIBUTOS
    private String nombre;
    private String especie; 
    private int edad;
    private double peso;
    private Cliente duenio;
    
    ///CONSTRUCTOR SIN DUENIO
    public Mascota (String nombre, String especie, int edad, double peso){ 
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
    }
    ///CONSTRUCTOR CON DUENIO
    public Mascota(String nombre, String especie, int edad, double peso, Cliente duenio) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.duenio = duenio;
    }
        
    ///GETTERS/SETTTERS
    ///NOMBRE Mascota
    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}   
    ///ESPECIE Mascota 
    public String getEspecie(){return especie;}
    public void setEspecie(String especie){this.especie = especie;} 
    ///EDAD Mascota
    public int getEdad(){return edad;}
    public void setEdad(int edad){this.edad = edad;}
    ///PESO Mascota
    public double getPeso(){return peso;}
    public void setPeso(double peso){this.peso = peso;}
    ///DUENIO de la Mascota
    public Cliente getDuenio() { return duenio; }
    public void setDuenio(Cliente duenio) { this.duenio = duenio;}
    
    ///METODOS
    ///METODO 1: Imprime un resumen de la informacion de la Mascota y sus atributos.
    public void mostrarResumen(){
        System.out.println("Mascota:" + nombre);
        System.out.println("Especie:" + especie);
        System.out.println("Edad:" + edad);
        System.out.printf("Peso: %.2f kg%n" , peso);
        
        if (this.duenio != null){
            System.out.println("Dueño: " + duenio.getNombre()); 
        }

        
    }
    
}
