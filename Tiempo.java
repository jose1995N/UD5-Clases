package Tiempo;

public class Tiempo {
    int horas;
    int minutos;
    int segundos;

    //Constructor
    Tiempo(int h, int m, int s){
        this.horas = h;
        this.minutos = m;
        this.segundos = s;
    }
    Tiempo(int h){
        this.horas = h;
        this.minutos = 0;
        this.segundos = 0;
    }
    Tiempo(int h, int m){
        this.horas = h;
        this.minutos = m;
        this.segundos= 0;
    }
// METODO TOSTING 
    @Override
    public String toString(){
        return (this.horas +"h "+ this.minutos + "m " + this.segundos + "s"); 
    }
//metodos

//metodo de la suma 
public Tiempo suma (Tiempo t){
  int nuevasHoras = this.horas + t.horas;
  int nuevosMinutos = this.minutos + t.minutos;
  int nuevosSegundos = this.segundos + t.segundos;
  // Normalización
  if (nuevosSegundos >= 60) {
    nuevosMinutos += nuevosSegundos / 60;
    nuevosSegundos %= 60;
}
if (nuevosMinutos >= 60) {
    nuevasHoras += nuevosMinutos / 60;
    nuevosMinutos %= 60;
}

return new Tiempo(nuevasHoras, nuevosMinutos, nuevosSegundos);
}
public Tiempo resta(Tiempo t) {
    int nuevasHoras = this.horas - t.horas;
    int nuevosMinutos = this.minutos - t.minutos;
    int nuevosSegundos = this.segundos - t.segundos;

    // Normalización
    if (nuevosSegundos < 0) {
        nuevosSegundos += 60;
        nuevosMinutos -= 1;
    }
    if (nuevosMinutos < 0) {
        nuevosMinutos += 60;
        nuevasHoras -= 1;
    }
    
    return new Tiempo(nuevasHoras, nuevosMinutos, nuevosSegundos);
}
}
