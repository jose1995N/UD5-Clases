package ejercicio3;

class Perro {
    private String TipoDeLadrido;
    private String ColorOjos;
    private String TipoPelo;
    private String Raza;

// Metodos

String obtenerTipoTipoDeLadrido(){
    return TipoDeLadrido;
}
String obtenerTipoColorOjos(){
    return ColorOjos;
}
String obtenerTipoPelo(){
    return TipoPelo;
}
String obtenerTiRaza(){
    return Raza;
}

void introducirTipoDeLadrido(String TipoDeLadrido){
    this.TipoDeLadrido = TipoDeLadrido;
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
