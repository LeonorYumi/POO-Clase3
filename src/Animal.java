public class Animal {
    //Atributos privados
    private String nombre;
    private int edad;

    //Constructor sin parametros
    public Animal() {
        this.nombre = "Lucas";
        this.edad = 1;
    }
    //Concstructor con parametros
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    //1. metodo propio
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
    }
    //2 metodo propio
    public void verificar(){
        if (edad <3){
            System.out.println(nombre + " es un cachorro");
        }else{
            System.out.println(nombre + " es un adulto");
        }
    }
}
