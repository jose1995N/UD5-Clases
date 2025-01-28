package Tiempo.actividad10;

public class ComprobarIncidencia {
    public static void main(String[] args) {
        Incidencia inc1 = new Incidencia(105, "No tiene acceso a internert");
        Incidencia inc2 = new Incidencia(14, "No arranca");
        Incidencia inc3 = new Incidencia(5, "La pantalla se ve rosa");
        Incidencia inc4 = new Incidencia(237, "Hace ruido extraño");
        Incidencia inc5 = new Incidencia(111,"se cuelga al abrir 3 ventanas");
        inc2.resolver("El equipo no esta enchufado");
        inc3.resolver("Cambio del cable VGA");
        System.out.println(inc1);
        System.out.println(inc2);
        System.out.println(inc3);
        System.out.println(inc4);
        System.out.println(inc5);
        System.out.println("incidencias pedientes " + Incidencia.getPendientes());
    }
}
