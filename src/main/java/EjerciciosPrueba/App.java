/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPrueba;

import java.util.Scanner;

/**
 *
 * @author sebastian.eduardo.va
 */
public class App {

    public static void main(String[] args) {

        int decision;
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("""
                           Que ejercicio quieres ver?
                           Ejercicio 1: Circulo
                           Ejercicio 2: Rectangulo
                           Ejercicio 3: Coche
                           Ejercicio 4: Libro
                           Ejercicio 5:
                           Ejercicio 6:""");
        decision = entradaTeclado.nextInt();

        //EJERCICIO 1
        /*Implementa una clase llamada Circulo, que tiene un atributo radio, y
          métodos para calcular la circunferencia, calcular el área y calcular el
          diámetro. Define una clase App con un método main en el que crees el
          objeto miCirculo, que tendrá que tener un radio, y calcula la circunferencia,
          el área y el diámetro*/
        if (decision == 1) {

            Circulo miCirculo = new Circulo();

            miCirculo.setRadio(24.5f);

            miCirculo.calcularArea();

            miCirculo.calcularCircunferencia();

            miCirculo.calcularDiametro();

        }

        //EJERCICIO 2
        /*
        Implementa una clase llamada Rectangulo, que tiene como atributos base
        y altura, y métodos para calcular la suma de los lados, el área y la
        diagonal. En la clase App que creaste en el ejercicio 1, instancia un par de
        Rectángulos con diferentes dimensiones, y haz una llamada a los métodos
        definidos de cada uno de los objetos.
         */
        if (decision == 2) {

            //Rectangulo 1
            Rectangulo miRectangulo = new Rectangulo(25.5f, 20.5f);

            System.out.println("Rectangulo 1");
            miRectangulo.calcularArea();
            miRectangulo.calcularDiagonal();
            miRectangulo.calcularLados();
            System.out.println("");

            //Rectangulo 2
            Rectangulo miRectangulo2 = new Rectangulo(15.5f, 10.5f);

            System.out.println("Rectangulo 2");
            miRectangulo2.calcularArea();
            miRectangulo2.calcularDiagonal();
            miRectangulo2.calcularLados();
            System.out.println("");
        }

        if (decision == 3) {
            
            //EJERCICIO 3
                /*Implementa una clase Coche que va a tener dos atributos, velocidad y
                matrícula, y los métodos acelerar(int incremento), frenar(int
                decremento) y mostrarVelocidad(), que muestra por pantalla la
                velocidad del vehículo. Define una clase App con un método main en el que
                crees dos objetos de tipo coche. Establece velocidades diferentes en cada
                uno, y llama varias veces a acelerar y frenar con valores distintos en cada
                uno de los objetos mostrando posteriormente la velocidad.*/
                
                
            //Coche 1
            Coche coche1 = new Coche(120,"1234 BCD");
            coche1.acelerar(50);
            coche1.frenar(20);
            
            coche1.mostrarVelocidad();
            System.out.println("");
            //Coche 2
            Coche coche2 = new Coche(50,"5678 EFG");
            coche2.acelerar(20);
            coche2.frenar(100);
            
            coche2.mostrarVelocidad();
        }
        
        if(decision == 4){
        /*      Implementa una clase Libro, que va a tener un título, un autor, un
            numeroPaginas, puede estar abierto o cerrado, y una página actual. La
            clase va a contar con los siguientes métodos:
             abrir(): Marca el libro como abierto, mostrando un aviso por
            pantalla. Si el libro ya está abierto, no se puede volver a abrir.
             cerrar(): Marca el libro como cerrado, mostrando un aviso por
            pantalla. Si el libro ya está cerrado, no se puede volver a cerrar.
             pasarPagina(): Incrementa la página actual en uno. Muestra por
            pantalla la página que se acaba de leer. Si el libro está cerrado, no se
            puede pasar página.
             mostrarDatos(): Muestra por pantalla toda la información del libro
            en concreto.
                5. En base a esto, define una clase App con un método main en el que crees
            dos libros. Establece el valor de los atributos para ambos, y para el primero
            prueba el funcionamiento de los métodos definidos previamente. Para el
            segundo, define una página aleatoria entre 0 y la última página del libro, y
            pasa páginas hasta llegar a ella utilizando un bucle. Por último, muestra los
            datos de este libro.
            */
        
        
        
        }
    }
}
