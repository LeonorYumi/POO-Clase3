class Vehiculo{
    public String marca;
    private String modelo;
    private int velocidadMaxima;
    private String codigoSeguridad;
    private String color;
    public Vehiculo(String marca, String modelo, int velocidadMaxima){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }
    //Uso de get y set
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
    public void setCodigoSeguridad(String codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        //en caso de que escriba el nombre del color en mayuscula o minusculas, sea valido
        if(color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") ||
                color.equalsIgnoreCase("blanco")){
            this.color = color;
        }else{
            System.out.println("Color invalido");
        }
    }
    public void mostrarInformacion(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad maxima: " + velocidadMaxima);
        System.out.println("Color: " + color);
    }
}
