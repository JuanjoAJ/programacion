package E01;

public class Persona {
    private String nombre, apellido, dni;
    private int edad, altura;

    private  double peso;


    // Constructores
    public Persona(){
        dni="111111111X";
    }
    public Persona(String nombre, String apellido){

        this.nombre=nombre;
        this.apellido=apellido;
        dni="111111111X";
    }
    public Persona(String nombre, String apellido, String dni, int edad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.edad=edad;
    }

    public Persona(String nombre, String apellido, String dni, int edad, int altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    //Metodos

    public void mostrarDatos(){

        System.out.printf("Los datos del usuario son los siguientes: %s %s, con un dni de %s y una edad de %d tiene una altura de %d y un peso de %.2f",nombre, apellido,dni,edad,altura,peso );
        System.out.println();

    }

    // GETTER & SETTER

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
