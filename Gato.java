package ejercicio3;

class Gato {
    private String ColorOjos;
    private String TipoPelo;
    private String Raza;

// Metodos
String obtenerTipoColorOjos(){
    return ColorOjos;
}
String obtenerTipoPelo(){
    return TipoPelo;
}
String obtenerTiRaza(){
    return Raza;
}
void introducirNombre(String ColorOjos){
    this.ColorOjos = ColorOjos;
}
 void introducirRaza(String TipoPelo){
    this.TipoPelo = TipoPelo;
}
void introducirZonaDondeVive(String Raza){
    this.Raza = Raza;
} 
}
