public class Main1 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Ana");
        persona.setEdad(25);
        persona.setProfesion("Ingenieria");
        //Valores incorrectos
        persona.setNombre("");
        persona.setEdad(-25);
        //Valores correctos
        System.out.println("-----------------------------------");
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Edad: "+persona.getEdad());
        System.out.println("Profesion: "+persona.getProfesion());
    }
}
