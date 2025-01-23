package pizza;
public class Pizza {
    String tamaño;
    String tipo;
    String estado; // puede ser servidas o pedida
    static int numPedidas = 0;
    static int numServidas = 0;
    //Metodo constructor
Pizza(String tamaño,String tipo){
        this.tamaño =tamaño;
        this.tipo = tipo;
        this.estado = "pedida";
        this.numPedidas++;

    }
//metodos del objeto
void sirve(){
    if (this.estado.equals("servida")){
        System.err.println("Esa pizza esta servida");
        
    } else {
        this.estado = "servida";
        
    }
    this.estado = "servida";
    this.numServidas++;
}
     static int getToltalPedidas(){
    return numPedidas;
}
      static int getTotalServidas(){
    return numServidas;
}
@Override
 public String toString(){
    return"pizza" + this.tipo + " " + this.tamaño + "," + this.estado;
}
}