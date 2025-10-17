public class Main2 {
    public static void main(String[] args) {
        Producto producto= new Producto();
        producto.setNombre("Celular");
        //Datos validos
        producto.setprecio(850);
        producto.mostrarInformacion();
        //Datos inválidos
        System.out.println("------------------------");
        producto.setprecio(-55);
        System.out.println("------------------------");
        producto.mostrarInformacion();
    }
}
