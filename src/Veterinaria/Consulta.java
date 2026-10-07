package Veterinaria;
/**
 * @author Andres Barquero Valverde
 * PROYECTO EN CLASE: VETERINARIA
 * Clase CONSULTA
 */

public class Consulta {
    ///ATRIBUTOS
    private String fecha;
    private String motivo;
    private Mascota mascota; 
    private double costo; 
    private Veterinario veterinario;
    
    
    //////CONSTRUCTOR
    public Consulta(String fecha, String motivo, Mascota mascota, double costo) {
        this.fecha = fecha;
        this.motivo = motivo;
        this.mascota = mascota;
        this.costo = costo;
    }
    ///CONSTRUCTOR ESPECIAL 1 (SE AGREGAN LOS OTROS DOS ATRIBUTOS (MOTIVO Y COSTO) DE MANERA -DEFAULT-)
    public Consulta(String fecha, Mascota mascota) {
        this.fecha = fecha;
        this.mascota = mascota;
        this.motivo = "Consulta General";
        this.costo = 0.0;
    }
    ///CONSTRUCTOR ESPECIAL 2 (SE AGREGAN LOS OTROS ATRIBUTOS DE MANERA -DEFAULT-)
    public Consulta() {
        this.fecha = "Sin Fecha";
        this.motivo = "Sin Motivo";
        this.mascota = null;
        this.costo = 0.0;
    }
    ///CONSTRUCTOR ESPECIAL 3 (SE AGREGAN LOS OTROS ATRIBUTOS CON VETERINARIO)
    public Consulta(String fecha, String motivo, Mascota mascota, double costo, Veterinario veterinario) {
        this.fecha = fecha;
        this.motivo = motivo;
        this.mascota = mascota;
        this.costo = costo;
        this.veterinario = veterinario;
    }
    
    
    ///GETTERS & SETTERS
    ///FECHA Consulta
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    ///MOTIVO Consulta
    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    ///MASCOTA Consulta
    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    ///COSTO Consulta
    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    ///VETERINARIO Veterinario
    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }
    
    
    
    ///METODOS
    public void actualizarCosto(double costo){
        setCosto(costo);
    }
    
    public void actualizarCosto(double costo , String motivo){
        setCosto(costo);
        this.motivo = motivo;
    }
    
    public void mostrarResumen(){
        System.out.println("Fecha: " + fecha);
        System.out.println("Motivo: " + motivo);
        if (mascota != null) mascota.mostrarResumen();
        if (veterinario != null) System.out.println(veterinario.getNombre());
        System.out.printf("Costo: ₡%.2f%n", costo);
     
    }
}
