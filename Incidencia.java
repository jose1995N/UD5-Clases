package Tiempo.actividad10;

public class Incidencia {
    private static int proximoCodigo = 1;
    private static int pendientes = 0;
    private int codigo;
    private int numeroPuesto;
    private String estado;
    private String descripcion;
    private String informacionResolucion;
 
    //contructor
    public Incidencia(int numeroPuesto, String descripcion) {
        this.codigo = proximoCodigo++;
        this.numeroPuesto = numeroPuesto;
        this.descripcion = descripcion;
        this.estado = "pendiente";
        pendientes++;
    }
    //Metodo objeto.
    public void resolver(String informacionResolucion) {
        if (this.estado.equals("pendiente")) {
            this.estado = "resuelta";
            this.informacionResolucion = informacionResolucion;
            pendientes--;
        }
    }
    //Metodo clase
    public static int getPendientes() {
        return pendientes;
    }

    @Override
     public String toString() {
        String mensaje="";
        if (estado.equals("pendiente")) {
            mensaje = "Incidencia "+codigo +": " + "- Puesto: "+ numeroPuesto+ " - "+ descripcion + " - "+ estado ;

        } else if (estado.equals("resuelta")) {
            mensaje = "Incidencia "+codigo+": " + "- Puesto: "+ numeroPuesto+ " - "+ estado +" - "+informacionResolucion;
        }
        return mensaje;
    }

    //public String toString() {
  //      return "Incidencia: " + codigo + ", Puesto: " + numeroPuesto + ", Estado: " + estado 
  //             +"-" + descripcion + ", - " + (informacionResolucion != null ? informacionResolucion : "Pendiente");
   // }
}

