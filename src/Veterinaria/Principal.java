package Veterinaria;

/**
 * @author Andres Barquero Valverde PROYECTO EN CLASE: VETERINARIA Clase
 * PRINCIPAL: Es el main y lo que va a correr la consola.
 */
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("11111111", "Ronaldo", "777777");
        Mascota mascota1 = new Mascota("Luna", "Perro", 5, 25.5, cliente1);
        Mascota mascota2 = new Mascota("Goku", "Loro", 2, 0.8);

        mascota1.mostrarResumen();
        System.out.println("Duenio: " + mascota1.getDuenio().getIdentificacion());
        System.out.println("=========================");
        mascota2.mostrarResumen();

        cliente1.setIdentificacion("2222222222222222");
        System.out.println("Duenio: " + mascota1.getDuenio().getIdentificacion());
        Veterinario veterinario1 = new Veterinario("V001", "Medicina General", "Dr. Shirley Cruz");

        Consulta consulta1 = new Consulta(
                "5/10/2026",
                "Control General",
                mascota1,
                15000,
                veterinario1);

        consulta1.mostrarResumen();
        System.out.println("=========================");
        consulta1.actualizarCosto(17500);
        consulta1.mostrarResumen();
        System.out.println("=========================");
        consulta1.actualizarCosto(18000, "Control y Medicamento ");
        consulta1.mostrarResumen();
        System.out.println("=========================");

        Cliente cliente2 = new Cliente("22222222", "Carlos Mora", "8888888888");
        Persona personaReferencia = cliente2;

        System.out.println(cliente2.getNombre());
        System.out.println(personaReferencia.getNombre());

        System.out.println("======RESUMIBLES====");
        Resumible r1 = cliente1;
        Resumible r2 = mascota1;
        Resumible r3 = consulta1;

        System.out.println("R1");
        r1.mostrarResumen();
        System.out.println("R2");
        r2.mostrarResumen();
        System.out.println("R3");
        r3.mostrarResumen();

        System.out.println("======ARRAYLIST MASCOTAS====");
        ArrayList<Mascota> mascotas = new ArrayList<Mascota>();
        mascotas.add(mascota1);
        mascotas.add(mascota2);
        mascotas.add(new Mascota("Luffy", "perro", 1, 1));

        if (!mascotas.isEmpty()) {
            System.out.println("=======PRIMERA=======");
            Mascota primera = mascotas.get(0);
            primera.mostrarResumen();
        }
        System.out.println("========RECORRE ARRAYLIST=======");
        for (int i = 0; i < mascotas.size(); i++) {
            mascotas.get(i).mostrarResumen();
        }

        System.out.println("======ARRAY MASCOTAS====");
        Mascota[] mascotas1 = new Mascota[3];
        mascotas1[2] = mascota2;
        mascotas1[1] = mascota1;
        mascotas1[0] = new Mascota("Luffy", "perro", 1, 1);

        if (mascotas1.length > 0) {
            System.out.println("========Primera=======");
            Mascota primera = mascotas1[0];
            primera.mostrarResumen();
        }
        System.out.println("========RECORRE ARRAY=======");
        for (int i = 0; i < mascotas1.length; i++) {
            mascotas1[i].mostrarResumen();
        }
    }
}
