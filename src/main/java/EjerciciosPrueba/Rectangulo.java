/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPrueba;

/**
 *
 * @author sebastian.eduardo.va
 */
public class Rectangulo {

    //EJERCICIO 2
    /*
        Implementa una clase llamada Rectangulo, que tiene como atributos base
        y altura, y métodos para calcular la suma de los lados, el área y la
        diagonal. En la clase App que creaste en el ejercicio 1, instancia un par de
        Rectángulos con diferentes dimensiones, y haz una llamada a los métodos
        definidos de cada uno de los objetos.
     */
    private float base;
    private float altura;

    //CONSTRUTORES
    
   public Rectangulo(float base, float altura){
       this.base = base;
       this.altura = altura;
   
   }
   
   public Rectangulo(){
   
   }
    
    //-----
    
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void calcularLados() {

        System.out.println("La suma de los lados de tu Rectangulo es: " + ((this.base * 2) + (this.altura * 2)));

    }

    public void calcularArea() {
        System.out.println("El area de tu rectangulo es: " + (this.base * this.altura));
    }

    public void calcularDiagonal() {
        System.out.println("La diagonal de tu rectangulo es: " + (Math.sqrt(Math.pow(this.base, 2) + (Math.pow(this.altura, 2))))+"''");

    }

}
