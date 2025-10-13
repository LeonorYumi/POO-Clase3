import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear objeto con constructor sin parámetros
        Animal a1 = new Animal();
        a1.mostrarInformacion();
        a1.verificar();

        // Crear objeto con constructor con parámetros
        System.out.println("== Ingrese datos de un nuevo animal ==");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();

        Animal a2 = new Animal(nombre, edad);
        a2.mostrarInformacion();
        a2.verificar();
    }
}