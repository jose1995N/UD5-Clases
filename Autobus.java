public class Autobus {
    private String Matricula;
    private String Modelo;
    private float potenciaCV;
    private int NumeroPlazas;

    //metodos de clase

    void setNumeroPlazas(int numero){
        NumeroPlazas = numero;
    }

    String getMatricula(){
        return Matricula;
    }
    String getModelo(){
        return Modelo;
    }
    float getpotenciaCV(){
        return potenciaCV;
    }
    
}
