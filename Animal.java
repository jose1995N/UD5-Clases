package ejercicio3;

class Animal {
    //Atribuos
    private String Nombre;
    private String Raza;
    private String ZonaDondeVive;

// Metodos
String obtenerTipoNombre(){
    return Nombre;
}
String obtenerTipoRaza(){
    return Raza;
}
String obtenerTipoZonaDondeVive(){
    return ZonaDondeVive;
}
void introducirNombre(String Nombre){
    this.Nombre = Nombre;
}
 void introducirRaza(String Raza){
    this.Raza = Raza;
}
void introducirZonaDondeVive(String ZonaDondeVive){
    this.ZonaDondeVive = ZonaDondeVive;
}
}