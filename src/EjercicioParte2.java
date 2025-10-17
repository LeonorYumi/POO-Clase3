class Producto {
    private double precio;
    private String nombre;

    public void setprecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        }else{
            System.out.println("El precio debe ser mayor que 0.");
        }
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getprecio() {
        return precio;
    }
    public String getNombre() {
        return nombre;
    }
    public void mostrarInformacion(){
        System.out.println("Producto "+ nombre);
        System.out.println("Precio: $"+ precio);
    }
}