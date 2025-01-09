public class Circulo {
    int x;
    int y;
    int radio;

    //metodos
    int obtenerX(){
        return x;
    }
    int obtenerY(){
        return y;
    }

    void establecerX (int valorX){
        x = valorX;
    }

    void establecerY(int valorY){
        y = valorY;
    
    }


public static void main(String[]arg){
    Circulo circulo1 = new Circulo(); // AQUI SE LLAMA AL OBEJETO CREADO DE LA CLASE Circulo

    circulo1.establecerX(10);
    circulo1.establecerY(20);

    System.out.println("El valor del atributo x es :" + circulo1.obtenerX());
    System.out.println("El valor del atributo Y es :" + circulo1.obtenerY());
}
}