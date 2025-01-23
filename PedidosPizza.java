package pizza;
public class PedidosPizza {
   public static void main(String[] args) {
    Pizza p1 = new Pizza("Margarita", "Mediana");
    Pizza p2 = new Pizza("funghi", "Familiar");
    p2.sirve();
    Pizza p3 = new Pizza("Cuatro quesos", "Manzana");
    System.out.print(p1);
    System.out.print(p2);
    System.out.print(p3);
    p2.sirve();
    System.out.println("Pedidas" + Pizza.getToltalPedidas());
    System.err.println("Servidas" + Pizza.getTotalServidas());
}
}
