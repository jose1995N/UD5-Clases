package ejercicio3;

public class Ave {
    private String Nombre;
    private String TipoPelo;
    private String vuela;

// Metodos
String obtenerTipoNombre(){
    return Nombre;
}
String obtenerTipoPelo(){
    return TipoPelo;
}
String obtenerTipovuela(){
    return vuela;
}
void introducirNombre(String Nombre){
    this.Nombre = Nombre;
}
 void introducirRaza(String TipoPelo){
    this.TipoPelo = TipoPelo;
}
void introducirZonaDondeVive(String vuela){
    this.vuela = vuela;
}
}
