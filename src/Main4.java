public class Main4 {
    public static void main(String[] args) {
        Vehiculo vehiculo= new Vehiculo("Chevrolet", "Spark", 120);
        System.out.println("Marca: " + vehiculo.marca);
        // v.codigoSeguridad = "1234"; // Genera error porque es privado
        vehiculo.setColor("verde");   // color no permitido
        System.out.println("-------------------");
        vehiculo.setColor("rojo");    // válido
        vehiculo.setCodigoSeguridad("2526");

        vehiculo.mostrarInformacion();
    }
}
