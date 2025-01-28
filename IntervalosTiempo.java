package Tiempo;

public class IntervalosTiempo {
    public static void main(String[] args) {
        Tiempo tiempo = new Tiempo(10, 20, 40);
        Tiempo tiempo2 = new Tiempo(11);
        Tiempo suma = tiempo.suma(tiempo2);
        Tiempo resta = tiempo.resta(tiempo2);
        System.out.println("El tiempo es :" + tiempo);
        System.out.println("Tiempo 2 es " + tiempo2);
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
    }
}
