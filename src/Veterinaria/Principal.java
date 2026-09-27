package Veterinaria;
/**
 *
 * @author Andres Barquero Valverde
 * PROYECTO EN CLASE: VETERINARIA
 * Clase PRINCIPAL: Es el main y lo que va a correr la consola.
 */
public class Principal {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("11111111", "Ronaldo", "777777");
        Mascota mascota1 = new Mascota("Luna", "Perro",5,25.5,cliente1);
        Mascota mascota2 = new Mascota("Goku","Loro",2,0.8);
       
        mascota1.mostrarResumen();
        System.out.println("Duenio: " + mascota1.getDuenio().getNombre());
        System.out.println("=========================");
        mascota2.mostrarResumen();
    }
}
