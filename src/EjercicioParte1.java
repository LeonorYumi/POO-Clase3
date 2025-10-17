class Persona{
    private String nombre;
    private int edad;
    private String profesion;
    //Get
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getProfesion() {
        return profesion;
    }
    //set
    public void setNombre(String nuevoNombre) {
        if (nuevoNombre != null && !nuevoNombre.isEmpty()){
            this.nombre = nuevoNombre;
        }else{
            System.out.println("El nombre es obligatorio");
        }
    }
    public void setEdad(int nuevaEdad) {
        if  (nuevaEdad > 0){
            this.edad = nuevaEdad;
        }else{
            System.out.println("La edad debe ser mayor que 0");
        }
    }
    public void setProfesion(String nuevoProfesion) {
        this.profesion = nuevoProfesion;
    }
}
