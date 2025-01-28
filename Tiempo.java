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

    @Override
    public String toString(){
        return (this.horas +"h "+ this.minutos + "m " + this.segundos + "s"); 
    }
}
