public class Auto {
    private String marca;
    private String modelo;
    private int anio;
    private String color;

    // Constructor vacío
    public Auto() {}

    // Constructor con parámetros
    public Auto(String marca, String modelo, int anio, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
    }

    // Constructor copia
    public Auto(Auto otro) {
        this.marca = otro.marca;
        this.modelo = otro.modelo;
        this.anio = otro.anio;
        this.color = otro.color;
    }

    // Getters
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAnio() { return anio; }
    public String getColor() { return color; }

    // Setters
    public void setMarca(String marca) { this.marca = marca; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public void setAnio(int anio) { this.anio = anio; }
    public void setColor(String color) { this.color = color; }

    // Métodos
    public void encender() { System.out.println("Se llamó al método encender()"); }
    public void acelerar() { System.out.println("Se llamó al método acelerar()"); }
}
