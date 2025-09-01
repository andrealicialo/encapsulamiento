public class Figura {
    private String color;
    private double posicionX;
    private double posicionY;

    // Constructor vacío
    public Figura() {}

    // Constructor con parámetros
    public Figura(String color, double posicionX, double posicionY) {
        this.color = color;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    // Constructor copia
    public Figura(Figura otro) {
        this.color = otro.color;
        this.posicionX = otro.posicionX;
        this.posicionY = otro.posicionY;
    }

    // Getters
    public String getColor() { return color; }
    public double getPosicionX() { return posicionX; }
    public double getPosicionY() { return posicionY; }

    // Setters
    public void setColor(String color) { this.color = color; }
    public void setPosicionX(double x) { this.posicionX = x; }
    public void setPosicionY(double y) { this.posicionY = y; }

    // Métodos
    public void dibujar() { System.out.println("Se llamó al método dibujar()"); }
    public void mover(double x, double y) { 
        this.posicionX = x; 
        this.posicionY = y; 
        System.out.println("Se llamó al método mover() a (" + x + ", " + y + ")"); 
    }
}
