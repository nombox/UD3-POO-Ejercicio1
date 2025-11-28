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
    
    public static void main(String[] args){
        
        int decision;
        Scanner entradaTeclado = new Scanner(System.in);
        
        System.out.println("Que ejercicio quieres ver?"
                + "Ejercicio 1: Circulo"
                + "Ejercicio 2: Rectangulo"
                + "Ejercicio 3: Coche"
                + "Ejercicio 4: Libro"
                + "Ejercicio 5:"
                + "Ejercicio 6:");
        decision = entradaTeclado.nextInt();
        
        //EJERCICIO 1
        /*Implementa una clase llamada Circulo, que tiene un atributo radio, y
          métodos para calcular la circunferencia, calcular el área y calcular el
          diámetro. Define una clase App con un método main en el que crees el
          objeto miCirculo, que tendrá que tener un radio, y calcula la circunferencia,
          el área y el diámetro*/
        if(decision == 1){
            
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
        
        if(decision == 2){
        
        
        }
    }
}
