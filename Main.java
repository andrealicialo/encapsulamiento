public class Main {
    public static void main(String[] args) {
        // Animal
        Animal animal1 = new Animal("Perro", 3, "Canino", 15.0);
        Animal animal2 = new Animal(animal1); // Constructor copia
        animal1.comer();

        // Auto
        Auto auto1 = new Auto("Toyota", "Corolla", 2022, "Rojo");
        Auto auto2 = new Auto(auto1); // Constructor copia
        auto1.encender();

        // Persona
        Persona persona1 = new Persona("Andrea", 25, "Femenino");
        Persona persona2 = new Persona(persona1); // Constructor copia
        persona1.hablar();

        // Figura
        Figura figura1 = new Figura("Azul", 0, 0);
        Figura figura2 = new Figura(figura1); // Constructor copia
        figura1.dibujar();
    }
}
