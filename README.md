# encapsulamiento
## Introduccion
El encapsulamiento constituye uno de los pilares fundamentales de la Programación Orientada a Objetos (POO). Este principio establece que los atributos de una clase deben estar protegidos frente al acceso directo de agentes externos, permitiendo su manipulación únicamente a través de métodos controlados llamados setters y getters. Con esta práctica se asegura la integridad de los datos, se refuerza la seguridad de la aplicación y se promueve la reutilización del código. 

En el contexto del ejercicio propuesto, se busca implementar el encapsulamiento en diversas clases previamente creadas, añadiendo constructores (vacío, con parámetros y de copia), junto con los métodos de acceso adecuados. De esta manera, el estudiante desarrolla habilidades técnicas para aplicar un diseño orientado a objetos más robusto, alineado con estándares de ingeniería de software modernos (Horstmann, 2022). 

## Objetivos 
- Aplicar el encapsulamiento a las clases existentes. 
- Crear constructores: vacío, con parámetros y copia. 
- Usar getters y setters para acceder y modificar atributos privados. 
- Instanciar objetos y comprobar el funcionamiento en el método main.

## Metodología
Para el desarrollo del proyecto sobre encapsulamiento en clases de Java, se siguió una metodología estructurada en las siguientes fases:

- Diseño de clases: Se partió de las clases previamente creadas en ejercicios anteriores, identificando sus atributos y métodos principales, con base en los diagramas UML.
<img width="411.5" height="394.5" alt="image" src="https://github.com/user-attachments/assets/b4dffae6-0e47-4e0e-be70-4a8ae7e982cc" />

- Aplicación del encapsulamiento: Se modificaron los atributos de cada clase para declararlos como private, asegurando que no pudieran ser accedidos directamente desde fuera de la clase.
- Implementación de métodos de acceso: Se crearon los métodos getters y setters para permitir el acceso controlado y seguro a cada atributo, siguiendo las buenas prácticas de POO.

### Incorporación de constructores: Se añadieron tres tipos de constructores:
#### Constructor vacío, que permite crear objetos sin inicializar atributos.
#### Constructor con parámetros, que facilita la creación de objetos con valores iniciales definidos.
#### Constructor copia, que posibilita la creación de un nuevo objeto a partir de otro existente.

- Pruebas y validación: Se desarrolló una clase Main para instanciar objetos, verificar el funcionamiento de los métodos implementados y depurar errores de lógica o sintaxis.

Esta metodología permitió asegurar la correcta implementación del encapsulamiento, garantizando la robustez, seguridad y mantenibilidad del código.
