public class Rectangulo {
    // Atributos públicos
    public double x1, y1; // Coordenadas del vértice inferior izquierdo
    public double x2, y2; // Coordenadas del vértice superior derecho

    // Constructor de la clase
    public Rectangulo(double x1, double y1, double x2, double y2) {
        // Asignamos los valores de los parámetros directamente a los atributos
        x1 = x1;
        y1 = y1;
        x2 = x2;
        y2 = y2;
    }
}
    public static void main(String[] args) {
        // Crear un rectángulo con las coordenadas especificadas
        Rectangulo rectangulo = new Rectangulo(0, 0, 5, 10);

        // Imprimir las coordenadas del rectángulo
        System.out.println("Vértice inferior izquierdo: (" + rectangulo.x1 + ", " + rectangulo.y1 + ")");
        System.out.println("Vértice superior derecho: (" + rectangulo.x2 + ", " + rectangulo.y2 + ")");
    }

