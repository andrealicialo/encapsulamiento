public class Persona {
    private String nombre;
    private int edad;
    private String genero;

    // Constructor vacío
    public Persona() {}

    // Constructor con parámetros
    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    // Constructor copia
    public Persona(Persona otro) {
        this.nombre = otro.nombre;
        this.edad = otro.edad;
        this.genero = otro.genero;
    }

    // Getters
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getGenero() { return genero; }

    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEdad(int edad) { this.edad = edad; }
    public void setGenero(String genero) { this.genero = genero; }

    // Métodos
    public void hablar() { System.out.println("Se llamó al método hablar()"); }
    public void caminar() { System.out.println("Se llamó al método caminar()"); }
}
