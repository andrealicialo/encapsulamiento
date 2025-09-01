public class Animal {
    // Encapsulamiento: atributos privados
    private String nombre;
    private int edad;
    private String especie;
    private double peso;

    // Constructor vacío
    public Animal() {}

    // Constructor con parámetros
    public Animal(String nombre, int edad, String especie, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.peso = peso;
    }

    // Constructor copia
    public Animal(Animal otro) {
        this.nombre = otro.nombre;
        this.edad = otro.edad;
        this.especie = otro.especie;
        this.peso = otro.peso;
    }

    // Getters
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getEspecie() { return especie; }
    public double getPeso() { return peso; }

    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEdad(int edad) { this.edad = edad; }
    public void setEspecie(String especie) { this.especie = especie; }
    public void setPeso(double peso) { this.peso = peso; }

    // Métodos
    public void comer() { System.out.println("Se llamó al método comer()"); }
    public void dormir() { System.out.println("Se llamó al método dormir()"); }
}
