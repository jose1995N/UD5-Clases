package ejercicio3;

class Mamifero {
    //Atribuos
    private String Nombre;
    private String TipoPelo;
    private String TipoDeHuesos;

// Metodos
String obtenerTipoNombre(){
    return Nombre;
}
String obtenerTipoPelo(){
    return TipoPelo;
}
String obtenerTipoTipoDeHuesos(){
    return TipoDeHuesos;
}
void introducirNombre(String Nombre){
    this.Nombre = Nombre;
}
 void introducirRaza(String TipoPelo){
    this.TipoPelo = TipoPelo;
}
void introducirZonaDondeVive(String TipoDeHuesos){
    this.TipoDeHuesos = TipoDeHuesos;
}
}

