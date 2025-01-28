package Tiempo.actividad10;

public class Incidencia {
    private static int proximoCodigo = 1;
    private static int pendientes = 0;
    private int codigo;
    private int numeroPuesto;
    private String estado;
    private String descripcion;
    private String informacionResolucion;

    public Incidencia(int numeroPuesto, String descripcion) {
        this.codigo = proximoCodigo++;
        this.numeroPuesto = numeroPuesto;
        this.descripcion = descripcion;
        this.estado = "pendiente";
        this.informacionResolucion = null;
        pendientes++;
    }

    public void resolver(String informacionResolucion) {
        if (this.estado.equals("pendiente")) {
            this.estado = "resuelta";
            this.informacionResolucion = informacionResolucion;
            pendientes--;
        }
    }

    public static int getPendientes() {
        return pendientes;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Puesto: " + numeroPuesto + ", Estado: " + estado +
               ", Descripción: " + descripcion + ", Información: " + (informacionResolucion != null ? informacionResolucion : "Pendiente");
    }
}

