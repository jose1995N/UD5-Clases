public class CrearAutobus {
    public static void main(String[] args) {
        Autobus autobus = new Autobus();

        int numeroPlazas = 50;
        autobus.getNumeroPlazas(numeroPlazas);

        System.out.printf("El autobus creado tiene %d plazas" + autobus.getNumeroPlazas());
    }
}
